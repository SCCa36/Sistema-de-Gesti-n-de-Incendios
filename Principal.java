package Ventanas;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class Principal extends javax.swing.JFrame {
    private static final long serialVersionUID = -8366855300214541908L;
    ImageIcon fondo;
    Icon icono_fondo;
    PDFParser parseador;
    String texto_parseado;
    PDDocument documento_PDF;
    COSDocument cd;
    JTextArea área_texto = new JTextArea();
    JFrame ventana = new JFrame();
    PDFTextStripper pts;
    AudioFileFormat.Type tipo_formato = AudioFileFormat.Type.WAVE;
    AudioFormat formato = new AudioFormat(8000.0F, 16, 1, true, false);
    TargetDataLine entrada_micro;
    File archivo = new File("grabación_voces.wav");
    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        fondo = new ImageIcon(getClass().getResource("/Imágenes/islas_Cíes.jpg"));
        icono_fondo = new ImageIcon(fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono_fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmSistemaPrevenciónIncendios = new javax.swing.JMenu();
        jmActivarVídeoVigilancia = new javax.swing.JMenuItem();
        jmActivarGrabaciónSonido = new javax.swing.JMenuItem();
        jmDiagnóstico = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmInformación = new javax.swing.JMenu();
        jmInformaciónVídeoVigilancia = new javax.swing.JMenuItem();
        jmInformaciónDiagnóstico = new javax.swing.JMenuItem();
        jmManualUsuario = new javax.swing.JMenuItem();
        jmAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Incendios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -26, 400, 310));

        jMenu1.setText("Archivo");

        jmSistemaPrevenciónIncendios.setText("Sistema de Prevención de Incendios");

        jmActivarVídeoVigilancia.setText("Activar sistema de vídeo vigilancia");
        jmActivarVídeoVigilancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmActivarVídeoVigilanciaActionPerformed(evt);
            }
        });
        jmSistemaPrevenciónIncendios.add(jmActivarVídeoVigilancia);

        jmActivarGrabaciónSonido.setText("Activar grabación de sonido");
        jmActivarGrabaciónSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmActivarGrabaciónSonidoActionPerformed(evt);
            }
        });
        jmSistemaPrevenciónIncendios.add(jmActivarGrabaciónSonido);

        jMenu1.add(jmSistemaPrevenciónIncendios);

        jmDiagnóstico.setText("Diagnóstico");
        jmDiagnóstico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDiagnósticoActionPerformed(evt);
            }
        });
        jMenu1.add(jmDiagnóstico);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jmInformación.setText("Información sobre el funcionamiento del programa");

        jmInformaciónVídeoVigilancia.setText("Sistema de vídeo vigilancia");
        jmInformaciónVídeoVigilancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInformaciónVídeoVigilanciaActionPerformed(evt);
            }
        });
        jmInformación.add(jmInformaciónVídeoVigilancia);

        jmInformaciónDiagnóstico.setText("Sistema de diagnóstico");
        jmInformaciónDiagnóstico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInformaciónDiagnósticoActionPerformed(evt);
            }
        });
        jmInformación.add(jmInformaciónDiagnóstico);

        jMenu2.add(jmInformación);

        jmManualUsuario.setText("Manual de usuario");
        jmManualUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManualUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmManualUsuario);

        jmAcercaDe.setText("Acerca de...");
        jmAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(jmAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmActivarVídeoVigilanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmActivarVídeoVigilanciaActionPerformed
        VídeoVigilancia vídeo_vigilancia = new VídeoVigilancia();
        vídeo_vigilancia.setLocationRelativeTo(null);
        vídeo_vigilancia.setVisible(true);
    }//GEN-LAST:event_jmActivarVídeoVigilanciaActionPerformed

    private void jmActivarGrabaciónSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmActivarGrabaciónSonidoActionPerformed
        grabarAudio();
    }//GEN-LAST:event_jmActivarGrabaciónSonidoActionPerformed

    private void jmDiagnósticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDiagnósticoActionPerformed
        SistemaExperto diagnóstico = new SistemaExperto();
        diagnóstico.setLocationRelativeTo(null);
        diagnóstico.setVisible(true);
    }//GEN-LAST:event_jmDiagnósticoActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmInformaciónVídeoVigilanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInformaciónVídeoVigilanciaActionPerformed
        try {
            ventana.setTitle("Información sobre la opción 'Vídeo vigilancia'.");
            ventana.setBounds(0, 0, 640, 300);
            ventana.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
            área_texto.setBounds(0, 0, 630, 290);
            área_texto.setText("El sistema de vídeo vigilancia se encarga de\nrealizar una fotografía del lugar del incendio\ny de realizar un reconocimiento facial de todas las personas que se\nencuentren en la imagen.\nPor otro lado, el sistema de grabación de sonido nos permite grabar\nlas voces de las personas presentes en el lugar del incendio en el momento\nprevio a que éste ocurra.");
            ventana.add(área_texto);
            ventana.setVisible(true);
        }
        catch(Exception ex2) {
            JOptionPane.showMessageDialog(rootPane, ex2.getCause().getLocalizedMessage(), "No se ha podido cargar la ventana de información.", JOptionPane.ERROR_MESSAGE);
            ex2.getStackTrace();
        }

    }//GEN-LAST:event_jmInformaciónVídeoVigilanciaActionPerformed

    private void jmInformaciónDiagnósticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInformaciónDiagnósticoActionPerformed
        try {
            ventana.setTitle("Información sobre la opción 'Diagnóstico'.");
            ventana.setBounds(0, 0, 640, 300);
            ventana.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
            área_texto.setBounds(0, 0, 630, 290);
            área_texto.setText("El sistema de diagnóstico no es más que un sistema experto\nmuy básico, el cual, mediante un sistema de preguntas y\nrespuestas determinará si el incendio ha sido intencionado (provocado),\naccidental (no provocado) o natural (causado por un rayo o por cualquier otra causa natural).\n\nAdemás también nos permite enviar un aviso, tanto por SMS como por email, a los retenes y\nal personal encargado de investigar las causas del incendio.");
            ventana.add(área_texto);
            ventana.setVisible(true);
        }
        catch(Exception ex1) {
            JOptionPane.showMessageDialog(rootPane, ex1.getCause().getLocalizedMessage(), "No se ha podido cargar la ventana de información.", JOptionPane.ERROR_MESSAGE);
            ex1.getStackTrace();
        }
    }//GEN-LAST:event_jmInformaciónDiagnósticoActionPerformed

    private void jmManualUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManualUsuarioActionPerformed
        File fichero = new File("/Manual/Manual del usuario.pdf"); 
        try { 
            parseador = new PDFParser((RandomAccessRead) new FileInputStream(fichero));
            parseador.parse();
            cd = parseador.getDocument();
            pts = new PDFTextStripper();
            documento_PDF = new PDDocument(cd);
            texto_parseado = pts.getText(documento_PDF);
            cd.close();
            documento_PDF.close();
            área_texto.setText(texto_parseado);
            ventana.setBounds(0, 0, 640, 300);
            ventana.setTitle("Manual del usuario.");
            ventana.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
            área_texto.setBounds(0, 0, 630, 290);
            área_texto.setVisible(true);
            ventana.add(área_texto);
            ventana.setVisible(true);
        }
        catch(IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getCause().getLocalizedMessage(), "Error al cargar el manual.", JOptionPane.ERROR_MESSAGE);
            ex.getStackTrace();
        }
    }//GEN-LAST:event_jmManualUsuarioActionPerformed

    private void jmAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAcercaDeActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Versión: 1.0\nAutor: Santiago Casteleiro", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmAcercaDeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAcercaDe;
    private javax.swing.JMenuItem jmActivarGrabaciónSonido;
    private javax.swing.JMenuItem jmActivarVídeoVigilancia;
    private javax.swing.JMenuItem jmDiagnóstico;
    private javax.swing.JMenu jmInformación;
    private javax.swing.JMenuItem jmInformaciónDiagnóstico;
    private javax.swing.JMenuItem jmInformaciónVídeoVigilancia;
    private javax.swing.JMenuItem jmManualUsuario;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JMenu jmSistemaPrevenciónIncendios;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables

    private void grabarAudio() {
        try {
            DataLine.Info información = new DataLine.Info(TargetDataLine.class, formato);
            entrada_micro = (TargetDataLine)AudioSystem.getLine(información);
            new hilo().start();
        }
        catch(LineUnavailableException ex3) {
            JOptionPane.showMessageDialog(rootPane, ex3.getCause().getLocalizedMessage(), "Error al crear el archivo de sonido.", JOptionPane.ERROR_MESSAGE);
            ex3.getStackTrace();
        }
    }
    class hilo extends Thread {

        public void run() {
            try {
                entrada_micro.open(formato);
                entrada_micro.start();
                AudioSystem.write(new AudioInputStream(entrada_micro), tipo_formato, archivo);
            }
            catch(IOException | LineUnavailableException ex4) {
                JOptionPane.showMessageDialog(rootPane, ex4.getCause().getLocalizedMessage(), "Error al grabar el sonido.", JOptionPane.ERROR_MESSAGE);
                ex4.getStackTrace();
            }
        }
    }
}