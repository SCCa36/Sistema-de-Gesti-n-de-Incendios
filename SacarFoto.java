package Clases.Webcam;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryEvent;
import com.github.sarxos.webcam.WebcamDiscoveryListener;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamPicker;
import com.github.sarxos.webcam.WebcamResolution;
import ds.desktop.notify.DesktopNotify;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SacarFoto extends JFrame implements ActionListener, Runnable, WebcamListener, WindowListener, UncaughtExceptionHandler, ItemListener, WebcamDiscoveryListener{
    private static final long serialVersionUID = 4607744604434892764L;
    private WebcamPanel panel = null;
    private WebcamPicker picker = null;
    private JButton botón = new JButton("Sacar Foto.");
    private Webcam w = null;
    String webcam;
    public SacarFoto(String webcam) {
        this.webcam = webcam;
    }
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == botón) {
            BufferedImage imagen = w.getImage();
            try {
                ImageIO.write(imagen, "JPG", new File("fotografía_incendio.jpg"));
            }
            catch(IOException ex) {
                DesktopNotify.showDesktopMessage("Error al sacar la fotografía.", ex.getCause().getLocalizedMessage(), DesktopNotify.FAIL);
                ex.getStackTrace();
            }
        }
    }
    @Override
    public void run() {
        Webcam.addDiscoveryListener(this);
        setTitle("Sistema de Gestión de Incendios - Fotografiar.");
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage()); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        addWindowListener(this);
        picker = new WebcamPicker();
        picker.addItemListener(this);
        w = picker.getSelectedWebcam();
        webcam = picker.getSelectedWebcam().getName();
        if (webcam == null) {
            DesktopNotify.showDesktopMessage("Webcam.", "No se ha encontrado ninguna webcam o la webcam seleccionada es incompatible con el sistema operativo.", DesktopNotify.FAIL);
            System.exit(0);
        }
        w.setViewSize(WebcamResolution.VGA.getSize());
        w.addWebcamListener(this);
        panel = new WebcamPanel(w, false);
        panel.setFPSDisplayed(true);
        add(picker, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(botón, BorderLayout.SOUTH);
        botón.addActionListener(this);
        pack();
        setVisible(true);
        Thread hilo = new Thread() {
            @Override
            public void run() {
                panel.start();
            }
        };
        hilo.setName("sacar-foto");
        hilo.setDaemon(true);
        hilo.setUncaughtExceptionHandler(this);
        hilo.start();
    }
    @Override
    public void webcamOpen(WebcamEvent we) {
        System.out.println("La webcam seleccionada se encuentra activa.");
    }    
    @Override
    public void webcamClosed(WebcamEvent we) {
        System.out.println("La webcam seleccionada no se encuentra activa.");
    }
    @Override
    public void webcamDisposed(WebcamEvent we) {
        
    }
    @Override
    public void webcamImageObtained(WebcamEvent we) {
        webcam = w.getName();
        ReconocimientoFacial reconocer_caras = new ReconocimientoFacial(webcam, panel);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }
    @Override
    public void windowClosing(WindowEvent e) {
        
    }
    @Override
    public void windowClosed(WindowEvent e) {
        w.close();
    }
    @Override
    public void windowIconified(WindowEvent e) {
        panel.pause();
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        panel.resume();
    }
    @Override
    public void windowActivated(WindowEvent e) {
        
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    @Override
    public void uncaughtException(Thread hilo, Throwable error) {
        DesktopNotify.showDesktopMessage("Se ha producido el siguiente error en el hilo " + hilo.getName() + ":", error.getCause().getLocalizedMessage(), DesktopNotify.FAIL);
        error.getStackTrace();
    }
    @Override
    public void itemStateChanged(ItemEvent evt) {
        if (evt.getItem() != w) {
            if (w != null) {
                panel.stop();
                remove(panel);
                w.removeWebcamListener(this);
                w.close();
                w = (Webcam)evt.getItem();
                w.setViewSize(WebcamResolution.VGA.getSize());
                w.addWebcamListener(this);
                System.out.println("Se ha seleccionado la webcam " + w.getName() + ".");
                panel = new WebcamPanel(w, false);
                panel.setFPSDisplayed(true);
                add(panel, BorderLayout.CENTER);
                pack();
                Thread hilo2 = new Thread() {
                    @Override
                    public void run() {
                        panel.start();
                    }
                };
                hilo2.setName("cambio-webcam");
                hilo2.setDaemon(true);
                hilo2.setUncaughtExceptionHandler(this);
                hilo2.start();
            }
        }
    }
    @Override
    public void webcamFound(WebcamDiscoveryEvent wde) {
        if (picker != null) {
            picker.addItem(wde.getWebcam());
        }
    }
    @Override
    public void webcamGone(WebcamDiscoveryEvent wde) {
        if (picker != null) {
            picker.removeItem(wde.getWebcam());
        }
    }
}