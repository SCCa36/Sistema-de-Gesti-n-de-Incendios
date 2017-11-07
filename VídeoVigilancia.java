package Ventanas;

import Clases.Webcam.SacarFoto;
import ds.desktop.notify.DesktopNotify;
import java.awt.Image;
import java.io.IOException;
import java.util.Vector;
import javax.media.CannotRealizeException;
import javax.media.CaptureDeviceInfo;
import javax.media.CaptureDeviceManager;
import javax.media.Format;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.protocol.CaptureDevice;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class VídeoVigilancia extends javax.swing.JFrame {
    private static final long serialVersionUID = -7405323684333661690L;
    ImageIcon imagen_fondo;
    Icon icono_fondo;
    CaptureDeviceInfo información_dispositivo;
    Vector lista_dispositivos;
    MediaLocator localizador;
    Player reproductor;
    boolean en_ejecución;
    Image imagen_capturada;
    CaptureDevice dispositivo;
    public VídeoVigilancia() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        imagen_fondo = new ImageIcon(getClass().getResource("/Imágenes/Cascadas_Ézaro.jpg"));
        icono_fondo = new ImageIcon(imagen_fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        cbWebcam.removeAllItems();
        cargarDispositivos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActivarWebcam = new javax.swing.JButton();
        lblSeleccionarWebcam = new javax.swing.JLabel();
        btnSacarFoto = new javax.swing.JButton();
        cbWebcam = new javax.swing.JComboBox<>();
        jpPanel1 = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Incendios - Sistema de Vídeo Vigilancia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActivarWebcam.setBackground(new java.awt.Color(0, 102, 255));
        btnActivarWebcam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActivarWebcam.setForeground(new java.awt.Color(255, 255, 255));
        btnActivarWebcam.setText("Activar Webcam");
        btnActivarWebcam.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 255)));
        btnActivarWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarWebcamActionPerformed(evt);
            }
        });
        getContentPane().add(btnActivarWebcam, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lblSeleccionarWebcam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSeleccionarWebcam.setText("Seleccione la webcam que desea utilizar:");
        getContentPane().add(lblSeleccionarWebcam, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 13, -1, -1));

        btnSacarFoto.setBackground(new java.awt.Color(0, 51, 204));
        btnSacarFoto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSacarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnSacarFoto.setText("Sacar Foto");
        btnSacarFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        btnSacarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSacarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 12, 176, -1));

        cbWebcam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbWebcam, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 54, 414, -1));

        javax.swing.GroupLayout jpPanel1Layout = new javax.swing.GroupLayout(jpPanel1);
        jpPanel1.setLayout(jpPanel1Layout);
        jpPanel1Layout.setHorizontalGroup(
            jpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jpPanel1Layout.setVerticalGroup(
            jpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jpPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, 810, 450));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActivarWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarWebcamActionPerformed
        try {
            CaptureDeviceInfo webcam = null;
            if (cbWebcam.getSelectedItem().toString().startsWith("vfw")) {
                webcam = información_dispositivo;
                localizador = webcam.getLocator();
                reproductor = Manager.createRealizedPlayer(localizador);
                reproductor.start();
                en_ejecución = true;
                jpPanel1.add(reproductor.getVisualComponent());
            }
            if (webcam == null) {
                DesktopNotify.showDesktopMessage("Incompatibilidad de webcam.", "La webcam seleccionada no es compatible con su sistema operativo.", DesktopNotify.FAIL);
            }
        }
        catch(IOException | CannotRealizeException | NoPlayerException ex) {
            DesktopNotify.showDesktopMessage("Error al activar la webcam seleccionada.", ex.getCause().getLocalizedMessage(), DesktopNotify.FAIL);
            ex.getStackTrace();
        }
    }//GEN-LAST:event_btnActivarWebcamActionPerformed

    private void btnSacarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarFotoActionPerformed
        if (en_ejecución) {
            try {
                SacarFoto fotografiar = new SacarFoto(cbWebcam.getSelectedItem().toString());
            }
            catch(Exception ex1) {
                DesktopNotify.showDesktopMessage("Error al cargar la ventana.", ex1.getCause().getLocalizedMessage(), DesktopNotify.FAIL);
                ex1.getStackTrace();
            }
        }
    }//GEN-LAST:event_btnSacarFotoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarWebcam;
    private javax.swing.JButton btnSacarFoto;
    private javax.swing.JComboBox<String> cbWebcam;
    private javax.swing.JPanel jpPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblSeleccionarWebcam;
    // End of variables declaration//GEN-END:variables

    private void cargarDispositivos() {
        lista_dispositivos = CaptureDeviceManager.getDeviceList(null);
        for (int i = 0; i < lista_dispositivos.size(); i ++) {
            información_dispositivo = (CaptureDeviceInfo)lista_dispositivos.elementAt(i);
            cbWebcam.addItem(información_dispositivo.getName());
            Format[] formatos = información_dispositivo.getFormats();
            for (int j = 0; j < formatos.length; j ++) {
                System.out.println("\nFormatos de dispositivo admitidos: " + formatos[j]);
            }
        }
    }
}