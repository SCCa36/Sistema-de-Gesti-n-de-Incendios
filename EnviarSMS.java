package Ventanas;

import ds.desktop.notify.DesktopNotify;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarSMS extends javax.swing.JFrame {
    private static final long serialVersionUID = -700300366887999204L;
    ImageIcon imagen_fondo;
    Icon icono_imagen_fondo;
    public EnviarSMS() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        imagen_fondo = new ImageIcon(getClass().getResource("/Imágenes/Horreo.jpg"));
        icono_imagen_fondo = new ImageIcon(imagen_fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono_imagen_fondo);
    }
    public boolean comprobarConexión() {
        String dirección_web = "http://wwww.google.es";
        int puerto = 80;
        try {
            Socket socket = new Socket(dirección_web, puerto);
            if (socket.isConnected()) {
                lblConexión.setText("Conexión establecida con la dirección " + dirección_web + " a través del puerto " + puerto + ".");
            }
        }
        catch(IOException ex) {
            lblError.setText("\nNo se pudo establecer conexión con " + dirección_web + " a través del puerto " + puerto + ".");
            ex.getStackTrace();
            return false;
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelConexión = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        jpContraseña = new javax.swing.JPasswordField();
        lblError = new javax.swing.JLabel();
        lblOperadora = new javax.swing.JLabel();
        cbOperadora = new javax.swing.JComboBox<>();
        btnComprobarConexión = new javax.swing.JButton();
        lblConexión = new javax.swing.JLabel();
        lblHost = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        jpEnvíoSMS = new javax.swing.JPanel();
        lblOrigen = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        lblAsunto = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMensaje = new javax.swing.JTextArea();
        btnEnviarSMS = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Incendios - Envío de SMS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPanelConexión.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2), "Datos de conexión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Droid Serif", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuario:");

        lblClave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblClave.setForeground(new java.awt.Color(102, 102, 102));
        lblClave.setText("Clave:");

        lblError.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));

        lblOperadora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblOperadora.setForeground(new java.awt.Color(102, 102, 102));
        lblOperadora.setText("Seleccione la operadora:");

        cbOperadora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movistar", "Jazztel", "Orange", "Amena", "Yoigo", "Vodafone" }));

        btnComprobarConexión.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnComprobarConexión.setForeground(new java.awt.Color(0, 0, 0));
        btnComprobarConexión.setText("Comprobar Conexión");
        btnComprobarConexión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarConexiónActionPerformed(evt);
            }
        });

        lblHost.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHost.setForeground(new java.awt.Color(102, 102, 102));
        lblHost.setText("Host:");

        javax.swing.GroupLayout jpPanelConexiónLayout = new javax.swing.GroupLayout(jpPanelConexión);
        jpPanelConexión.setLayout(jpPanelConexiónLayout);
        jpPanelConexiónLayout.setHorizontalGroup(
            jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelConexiónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(lblClave)
                    .addComponent(jpContraseña)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprobarConexión, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(lblConexión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpPanelConexiónLayout.createSequentialGroup()
                        .addComponent(lblOperadora)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpPanelConexiónLayout.createSequentialGroup()
                        .addComponent(lblHost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHost)))
                .addContainerGap())
        );
        jpPanelConexiónLayout.setVerticalGroup(
            jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelConexiónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblOperadora))
                .addGap(18, 18, 18)
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClave)
                    .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHost)
                        .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprobarConexión))
                .addGap(18, 18, 18)
                .addGroup(jpPanelConexiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPanelConexiónLayout.createSequentialGroup()
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lblConexión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jpPanelConexión, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 704, -1));

        jpEnvíoSMS.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2), "Datos para el envío del SMS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        lblOrigen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(102, 102, 102));
        lblOrigen.setText("De:");

        lblDestino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(102, 102, 102));
        lblDestino.setText("Para:");

        lblAsunto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAsunto.setForeground(new java.awt.Color(102, 102, 102));
        lblAsunto.setText("Asunto:");

        lblMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(102, 102, 102));
        lblMensaje.setText("Mensaje:");

        txtareaMensaje.setColumns(20);
        txtareaMensaje.setRows(5);
        jScrollPane1.setViewportView(txtareaMensaje);

        btnEnviarSMS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEnviarSMS.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviarSMS.setText("Enviar SMS");
        btnEnviarSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarSMSActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEnvíoSMSLayout = new javax.swing.GroupLayout(jpEnvíoSMS);
        jpEnvíoSMS.setLayout(jpEnvíoSMSLayout);
        jpEnvíoSMSLayout.setHorizontalGroup(
            jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                        .addComponent(lblOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrigen))
                    .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                        .addComponent(lblDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDestino))
                    .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                        .addComponent(lblAsunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAsunto))
                    .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnviarSMS, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpEnvíoSMSLayout.setVerticalGroup(
            jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsunto)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addGroup(jpEnvíoSMSLayout.createSequentialGroup()
                        .addGroup(jpEnvíoSMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje)
                            .addComponent(btnEnviarSMS))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jpEnvíoSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 283, 670, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnComprobarConexiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarConexiónActionPerformed
       comprobarConexión();
    }//GEN-LAST:event_btnComprobarConexiónActionPerformed

    private void btnEnviarSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarSMSActionPerformed
        try {
            String usuario, clave, mensaje, asunto, de, para, host;
            usuario = txtUsuario.getText();
            clave = jpContraseña.getText();
            de = txtOrigen.getText();
            para = txtDestino.getText();
            asunto = txtAsunto.getText();
            mensaje = txtareaMensaje.getText();
            host = txtHost.getText();
            if(usuario.equals("") && clave.equals("") && de.equals("") && para.equals("") && asunto.equals("") && mensaje.equals("") && host.equals("")) {
                lblError.setText("Te faltan por introducir todos los datos necesarios para el envío del SMS.");
            }
            else if (usuario.equals("") && clave.equals("") && host.equals("")) {
                lblError.setText("Tienes que introducir tu nombre de usuario, tu contraseña y el host desde el que vas a enviar el SMS.");
            }
            else if (de.equals("") && para.equals("") && asunto.equals("") && mensaje.equals("") && host.equals("")) {
                lblError.setText("Te faltan por introducir los siguientes datos:\n- De:\n- Para:\n- Asunto:\n- Mensaje:\n- Host:");
            }
            else if (usuario.equals("") || clave.equals("") || de.equals("") || para.equals("") || asunto.equals("") || mensaje.equals("") || host.equals("")) {
                if (usuario.equals("")) {
                    lblError.setText("Tienes que introducir tu nombre de usuario.");
                }
                if (clave.equals("")) {
                    lblError.setText("Tienes que introducir tu contraseña.");
                }
                if (de.equals("")) {
                    lblError.setText("Tienes que introducir el origen del SMS.");
                }
                if (para.equals("")) {
                    lblError.setText("Tienes que introducir el destinatario del SMS.");
                }
                if (asunto.equals("")) {
                    lblError.setText("Tienes que introducir el asunto del SMS.");
                }
                if (mensaje.equals("")) {
                    lblError.setText("Tienes que introducir el texto del SMS que deseas enviar.");
                }
                if (host.equals("")) {
                    lblError.setText("Tienes que introducir el host desde el que vas a a enviar el SMS.");
                }
            }
            else {
                if (cbOperadora.getSelectedItem().equals("Moviestar")) {
                    para = txtDestino.getText() + "@movistar.com.es";
                }
                if (cbOperadora.getSelectedItem().equals("Jazztel")) {
                    para = txtDestino.getText() + "@jazztel.com.es";
                }
                if (cbOperadora.getSelectedItem().equals("Orange")) {
                    para = txtDestino.getText() + "@sms.orange.com.es";
                }
                if (cbOperadora.getSelectedItem().equals("Amena")) {
                    para = txtDestino.getText() + "@amena.com.es";
                }
                if (cbOperadora.getSelectedItem().equals("Yoigo")) {
                    para = txtDestino.getText() + "@sms.yoigo.com.es";
                }
                if (cbOperadora.getSelectedItem().equals("Vodafone")) {
                    para = txtDestino.getText() + "@sms.vodafone.com.es";
                }
                Properties propiedades = new Properties();
                propiedades.setProperty("mail.smtp.host", host);
                propiedades.setProperty("mail.smtp.starttls.enable", "true");
                propiedades.setProperty("mail.smtp.port", "587");
                propiedades.setProperty("mail.smtp.user", usuario);
                propiedades.setProperty("mail.smtp.auth", "false");
                Session sesión = Session.getDefaultInstance(propiedades);
                sesión.setDebug(true);
                MimeMessage m = new MimeMessage(sesión);
                m.setFrom(new InternetAddress(de));
                m.addRecipients(Message.RecipientType.TO, para);
                m.setSubject(asunto);
                m.setText(mensaje, "ISO-88509-1", "html");
                Transport protocolo_transporte = sesión.getTransport("smtp");
                protocolo_transporte.connect(usuario, clave);
                protocolo_transporte.sendMessage(m, m.getAllRecipients());
                protocolo_transporte.close();
                DesktopNotify.showDesktopMessage("Envío realizado con éxito", "El SMS se ha enviado correctamente.");
            }
        }
        catch(MessagingException ex) {
            lblError.setText(ex.getCause().getLocalizedMessage());
            ex.getStackTrace();
        }
    }//GEN-LAST:event_btnEnviarSMSActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobarConexión;
    private javax.swing.JButton btnEnviarSMS;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbOperadora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JPanel jpEnvíoSMS;
    private javax.swing.JPanel jpPanelConexión;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblConexión;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblOperadora;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextArea txtareaMensaje;
    // End of variables declaration//GEN-END:variables
}