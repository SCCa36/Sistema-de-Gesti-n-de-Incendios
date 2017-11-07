package Clases.Webcam;

import ds.desktop.notify.DesktopNotify;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import static org.opencv.objdetect.Objdetect.CASCADE_SCALE_IMAGE;

public class ReconocimientoFacial {
    String caras_reconocidas = "/Datos_Programa/haarcascade_frontalface_alt2.xml";
    CascadeClassifier detector_caras = new CascadeClassifier(caras_reconocidas);
    public ReconocimientoFacial(String webcam, JPanel panel) {
        Thread hilo = new Thread() {
            @Override
            public void run() {
                VideoCapture captura_vídeo = new VideoCapture(webcam.indexOf(webcam));
                MatOfRect caras = new MatOfRect();
                MatOfByte memoria = new MatOfByte();
                Mat partícula = new Mat();
                Mat partícula_gris = new Mat();
                Rect[] array_caras;
                Graphics gráficos;
                BufferedImage imagen_buffer = null;
                while(captura_vídeo.read(partícula)) {
                    if (partícula.empty()) {
                        System.out.println("No hay registros de imagen.");
                        break;
                    }
                    else {
                        try {
                            gráficos = panel.getGraphics();
                            Imgproc.cvtColor(partícula, partícula_gris, Imgproc.COLOR_BGR2GRAY);
                            Imgproc.equalizeHist(partícula_gris, partícula_gris);
                            double ancho, alto;
                            ancho = partícula.width();
                            alto = partícula.height();
                            detector_caras.detectMultiScale(partícula_gris, caras, 1.1, 2, 0|CASCADE_SCALE_IMAGE, new Size(30, 30), new Size(ancho, alto));
                            array_caras = caras.toArray();
                            System.out.println("Nº de caras encontradas: " + array_caras.length + ".");
                            Mat ROI = new Mat();
                            for (int i = 0; i < array_caras.length; i ++) {
                                Point centro = new Point((array_caras[i].x + array_caras[i].width * 0.5), (array_caras[i].y + array_caras[i].height * 0.5));
                                Imgproc.ellipse(partícula, centro, new Size(array_caras[i].width * 0.5, array_caras[i].height * 0.5), 0, 0, 360, new Scalar(255, 0, 255), 4, 8, 0);
                                ROI = partícula_gris.submat(array_caras[i]);
                                Imgproc.rectangle(partícula, new Point(array_caras[i].x, array_caras[i].y), new Point(array_caras[i].x + array_caras[i].width, array_caras[i].y + array_caras[i].height), new Scalar(123, 213, 23, 220));
                                Imgproc.putText(partícula, "Ancho cara: " + ROI.width() + " Alto cara: " + ROI.height() + " X = " + array_caras[i].x + " Y = " + array_caras[i].y, new Point(array_caras[i].x, array_caras[i].y - 20), 1, 1, new Scalar(255, 255, 255));
                            }
                            Imgcodecs.imencode(".bmp", ROI, memoria);
                            Image imagen = ImageIO.read(new ByteArrayInputStream(memoria.toArray()));
                            imagen_buffer = (BufferedImage)imagen;
                            if (gráficos.drawImage(imagen_buffer, 0, 0, panel.getWidth(), panel.getHeight(), 0, 0, imagen_buffer.getWidth(), imagen_buffer.getHeight(), null)) {
                                
                            }
                        }
                        catch(IOException ex) {
                            DesktopNotify.showDesktopMessage("Error al realizar el reconocimiento facial.", ex.getCause().getLocalizedMessage(), DesktopNotify.FAIL);
                            ex.getStackTrace();
                        }
                    }
                }
            }
        };
        hilo.setName("reconocimiento-facial");
        hilo.setDaemon(true);
        hilo.start();
    }
}