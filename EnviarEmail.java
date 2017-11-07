package Ventanas;

import Clases.ComprobarConexión;
import Clases.Validación;
import Hilos.HiloComprobarEnvíoEmail;
import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class EnviarEmail extends javax.swing.JFrame {
    private static final long serialVersionUID = 2930429489550777390L;
    ImageIcon imagen_fondo, imagen_adjunto;
    Icon icono_fondo, icono_adjunto;
    public static String ruta_archivo, destinatario, asunto, mensaje, archivo_adjunto;
    Validación validar_email = new Validación();
    HiloComprobarEnvíoEmail comprobar_envío = new HiloComprobarEnvíoEmail();
    public static int servidor = 0;
    public static String[] adjuntos, destinatarios;
    JFileChooser seleccionador = new JFileChooser();
    File archivo;
    public EnviarEmail() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        imagen_fondo = new ImageIcon(getClass().getResource("/Imágenes/Castillo_Baiona.jpg"));
        icono_fondo = new ImageIcon(imagen_fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono_fondo);
        imagen_adjunto = new ImageIcon(getClass().getResource("/Imágenes/ArchivoAdjunto/archivo_adjunto.png"));
        icono_adjunto = new ImageIcon(imagen_adjunto.getImage().getScaledInstance(btnAdjunto.getWidth(), btnAdjunto.getHeight(), Image.SCALE_DEFAULT));
        btnAdjunto.setIcon(icono_adjunto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprobarConexión = new javax.swing.JButton();
        lblPara = new javax.swing.JLabel();
        txtPara = new javax.swing.JTextField();
        lblAsunto = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        lblAdjunto = new javax.swing.JLabel();
        btnAdjunto = new javax.swing.JButton();
        lblEstadoAdjunto = new javax.swing.JLabel();
        lblEstadoConexión = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMensaje = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprobarConexión.setBackground(new java.awt.Color(0, 153, 153));
        btnComprobarConexión.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnComprobarConexión.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobarConexión.setText("Comprobar Conexión");
        btnComprobarConexión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarConexiónActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprobarConexión, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 12, -1, -1));

        lblPara.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPara.setForeground(new java.awt.Color(255, 255, 255));
        lblPara.setText("Para:");
        getContentPane().add(lblPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 57, -1, -1));
        getContentPane().add(txtPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 61, 555, -1));

        lblAsunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAsunto.setForeground(new java.awt.Color(255, 255, 255));
        lblAsunto.setText("Asunto:");
        getContentPane().add(lblAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));
        getContentPane().add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 101, 529, -1));

        lblAdjunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdjunto.setForeground(new java.awt.Color(255, 255, 255));
        lblAdjunto.setText("Archivo adjunto:");
        getContentPane().add(lblAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, -1, -1));

        btnAdjunto.setBorder(null);
        btnAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 137, 67, 58));

        lblEstadoAdjunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(lblEstadoAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 137, 361, 58));

        lblEstadoConexión.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(lblEstadoConexión, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 407, 27));

        lblMensaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Mensaje:");
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, -1, -1));

        txtareaMensaje.setColumns(20);
        txtareaMensaje.setRows(5);
        jScrollPane1.setViewportView(txtareaMensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, 626, 191));

        btnEnviar.setBackground(new java.awt.Color(0, 153, 51));
        btnEnviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 439, -1, 37));

        btnSalir.setBackground(new java.awt.Color(0, 204, 0));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 439, -1, 37));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprobarConexiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarConexiónActionPerformed
        verificarConexión();
    }//GEN-LAST:event_btnComprobarConexiónActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        destinatario = txtPara.getText().trim();
        asunto = txtAsunto.getText();
        mensaje = txtareaMensaje.getText();
        if (verificarDatos()) {
            destinatarios = destinatario.split(",\\s*");
            comprobar_envío.start();
            if (HiloComprobarEnvíoEmail.envío_exitoso) {
                System.out.println();
                vaciar(false);  
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntoActionPerformed
        seleccionador.setFileSelectionMode(0);
        int opción = seleccionador.showSaveDialog(this);
        if (opción == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionador.getSelectedFile();
            try {
                archivo_adjunto = archivo.getCanonicalPath();
                archivo_adjunto = archivo_adjunto.replace("\\", "/");
                lblEstadoAdjunto.setForeground(Color.GREEN);
                lblEstadoAdjunto.setText("Adjuntos: " + archivo_adjunto);
                actualizarAdjunto();
            }
            catch(IOException ex) {
                DesktopNotify.showDesktopMessage("Error al cargar el archivo.", ex.getCause().getLocalizedMessage(), DesktopNotify.FAIL);
                lblEstadoAdjunto.setForeground(Color.RED);
                lblEstadoAdjunto.setText("Error al cargar el archivo.\nEn el aviso que se le acaba de mostrar verá más información.");
                ex.getStackTrace();
            }
        }
    }//GEN-LAST:event_btnAdjuntoActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjunto;
    private javax.swing.JButton btnComprobarConexión;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdjunto;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblEstadoAdjunto;
    private javax.swing.JLabel lblEstadoConexión;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPara;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtPara;
    private javax.swing.JTextArea txtareaMensaje;
    // End of variables declaration//GEN-END:variables

    public void verificarConexión() {
        ComprobarConexión comprobar_conexión = new ComprobarConexión();
        boolean conexión = comprobar_conexión.comprobar();
        btnEnviar.setEnabled(conexión);
        if (conexión) {
            lblEstadoConexión.setForeground(Color.GREEN);
            lblEstadoConexión.setText("Conexión establecida con éxito.");
        }
        else {
            lblEstadoConexión.setForeground(Color.RED);
            lblEstadoConexión.setText("No se ha podido establecer una conexión a Internet.");
        }
    }   
    public static void notificarEnvío(boolean bandera) {
        DesktopNotify.showDesktopMessage("Notificación de estado.", "Enviando el mensaje de correo electrónico. \nEspere, por favor.", DesktopNotify.INFORMATION);
    }    
    public static void vaciar(boolean bandera) {
        if (bandera) {
            destinatario = "";
            asunto = "";
            mensaje = "";
            archivo_adjunto = "";
        }
    }
    private boolean verificarDatos() {
        if (destinatario.equals("") && asunto.equals("") && mensaje.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Le faltan por introducir todos los datos necesarios.", "Aviso.", JOptionPane.ERROR_MESSAGE);
        }
        else if (destinatario.equals("") || asunto.equals("") || mensaje.equals("")) {
            if (destinatario.contains("")) {
                JOptionPane.showMessageDialog(rootPane, "Tiene que introducir la dirección de email del destinatario.", "Aviso.", JOptionPane.ERROR_MESSAGE);
            }
            if (asunto.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tiene que indicar un asunto para el mensaje.\nDe esta manera podrá evitar que su mensaje de correo electrónico sea clasificado como SPAM.", "Aviso.", JOptionPane.ERROR_MESSAGE);
            }
            if (mensaje.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tiene que escribir un mensaje para poderlo enviar.", "Aviso.", JOptionPane.ERROR_MESSAGE);
            }
        }
        return true;
    }
    public void actualizarAdjunto() {
        adjuntos = archivo_adjunto.split(",\\s*");
    }
}