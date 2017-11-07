package Ventanas;

import Clases.ComprobarConexión;
import Clases.Validación;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class LoginEmail extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    ImageIcon imagen_fondo;
    Icon icono_imagen_fondo;
    public static String usuario, contraseña, u;
    private Validación validación = new Validación();
    private String dominio;
    public static int servidor;
    private boolean conexión;
    public LoginEmail() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        imagen_fondo = new ImageIcon(getClass().getResource("/Imágenes/Petroglifos.jpg"));
        icono_imagen_fondo = new ImageIcon(imagen_fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono_imagen_fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGrupoBotones = new javax.swing.ButtonGroup();
        lblTítulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        jpClave = new javax.swing.JPasswordField();
        btnConectar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblServidor = new javax.swing.JLabel();
        rbGMail = new javax.swing.JRadioButton();
        rbHotmail = new javax.swing.JRadioButton();
        rbOutlook = new javax.swing.JRadioButton();
        rbLive = new javax.swing.JRadioButton();
        rbYahoo = new javax.swing.JRadioButton();
        lblEstadoConexión = new javax.swing.JLabel();
        btnComprobarConexión = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblTítulo.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(0, 51, 204));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("LOGIN EMAIL.");
        getContentPane().add(lblTítulo);
        lblTítulo.setBounds(0, 10, 770, 103);

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 51, 204));
        lblUsuario.setText("Usuario (correo electrónico):");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(10, 240, 230, 17);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(270, 240, 294, 18);

        lblClave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblClave.setForeground(new java.awt.Color(0, 51, 204));
        lblClave.setText("Clave:");
        getContentPane().add(lblClave);
        lblClave.setBounds(10, 310, 49, 17);
        getContentPane().add(jpClave);
        jpClave.setBounds(90, 310, 294, 18);

        btnConectar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConectar);
        btnConectar.setBounds(10, 450, 106, 27);

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(680, 450, 68, 27);

        lblServidor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblServidor.setForeground(new java.awt.Color(0, 0, 255));
        lblServidor.setText("Servidor:");
        getContentPane().add(lblServidor);
        lblServidor.setBounds(10, 130, 90, 17);

        btngGrupoBotones.add(rbGMail);
        rbGMail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbGMail.setText("GMail");
        rbGMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbGMailMousePressed(evt);
            }
        });
        getContentPane().add(rbGMail);
        rbGMail.setBounds(130, 130, 70, 25);

        btngGrupoBotones.add(rbHotmail);
        rbHotmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbHotmail.setForeground(new java.awt.Color(255, 255, 255));
        rbHotmail.setText("Hotmail");
        rbHotmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbHotmailMousePressed(evt);
            }
        });
        getContentPane().add(rbHotmail);
        rbHotmail.setBounds(220, 130, 90, 25);

        btngGrupoBotones.add(rbOutlook);
        rbOutlook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbOutlook.setForeground(new java.awt.Color(255, 255, 255));
        rbOutlook.setText("Outlook");
        rbOutlook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbOutlookMousePressed(evt);
            }
        });
        getContentPane().add(rbOutlook);
        rbOutlook.setBounds(320, 130, 90, 25);

        btngGrupoBotones.add(rbLive);
        rbLive.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbLive.setForeground(new java.awt.Color(255, 255, 255));
        rbLive.setText("Live");
        rbLive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbLiveMousePressed(evt);
            }
        });
        getContentPane().add(rbLive);
        rbLive.setBounds(430, 130, 60, 25);

        btngGrupoBotones.add(rbYahoo);
        rbYahoo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbYahoo.setForeground(new java.awt.Color(255, 255, 255));
        rbYahoo.setText("Yahoo");
        rbYahoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbYahooMousePressed(evt);
            }
        });
        getContentPane().add(rbYahoo);
        rbYahoo.setBounds(510, 130, 80, 25);

        lblEstadoConexión.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblEstadoConexión);
        lblEstadoConexión.setBounds(10, 170, 480, 50);

        btnComprobarConexión.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnComprobarConexión.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobarConexión.setText("Comprobar Conexión");
        btnComprobarConexión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarConexiónActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprobarConexión);
        btnComprobarConexión.setBounds(540, 190, 210, 27);
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 870, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        try {
            usuario = txtUsuario.getText().trim();
            contraseña = jpClave.getText().trim();
            u = usuario;
            StringTokenizer token = new StringTokenizer(usuario, "@");
            if (validación.validarEmail(usuario) && contraseña.length() != 0) {
                while(token.hasMoreTokens()) {
                    String correo = token.nextToken();
                    dominio = token.nextToken();
                    dominio = dominio.toLowerCase();
                }
                if (rbGMail.isSelected()) {
                    if (dominio.equals("gmail.com")) {
                        this.dispose();
                        EnviarEmail email = new EnviarEmail();
                        email.setLocationRelativeTo(null);
                        email.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "El dominio seleccionado es incorrecto.", "Dominio incorrecto.", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (rbLive.isSelected()) {
                    if (dominio.equals("live.com")) {
                        this.dispose();
                        EnviarEmail email = new EnviarEmail();
                        email.setLocationRelativeTo(null);
                        email.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "El dominio seleccionado es incorrecto.", "Dominio incorrecto.", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (rbHotmail.isSelected()) {
                    if (dominio.equals("hotmail.com")) {
                        this.dispose();
                        EnviarEmail email = new EnviarEmail();
                        email.setLocationRelativeTo(null);
                        email.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "El dominio seleccionado es incorrecto.", "Dominio incorrecto.", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (rbOutlook.isSelected()) {
                    if (dominio.equals("outlook.com")) {
                        this.dispose();
                        EnviarEmail email = new EnviarEmail();
                        email.setLocationRelativeTo(null);
                        email.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "El dominio seleccionado es incorrecto.", "Dominio incorrecto.", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (rbYahoo.isSelected()) {
                    if (dominio.equals("gmail.com")) {
                        this.dispose();
                        EnviarEmail email = new EnviarEmail();
                        email.setLocationRelativeTo(null);
                        email.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "El dominio seleccionado es incorrecto.", "Dominio incorrecto.", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else {
                txtUsuario.setText("");
                jpClave.setText("");
                JOptionPane.showMessageDialog(rootPane, "La cuenta no es un correo electrónico");
            }
        }
        catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getCause().getLocalizedMessage(), "Error al cargar la ventana.", JOptionPane.ERROR_MESSAGE);
            ex.getStackTrace();
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnComprobarConexiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarConexiónActionPerformed
        verificarConexión();
    }//GEN-LAST:event_btnComprobarConexiónActionPerformed

    private void rbGMailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbGMailMousePressed
        if (conexión) {
            if (evt.getClickCount() == 1) {
                if (rbGMail.isSelected()) {
                    rbHotmail.setSelected(false);
                    rbLive.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbYahoo.setSelected(false);
                    txtUsuario.setEnabled(false);
                    jpClave.setEnabled(false);
                    btnConectar.setEnabled(false);
                }
                else {
                    rbHotmail.setSelected(false);
                    rbLive.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbYahoo.setSelected(false);
                    servidor = 0;
                    txtUsuario.setEnabled(true);
                    jpClave.setEnabled(true);
                    btnConectar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_rbGMailMousePressed

    private void rbHotmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbHotmailMousePressed
        if (conexión) {
            if (evt.getClickCount() == 1) {
                if (rbHotmail.isSelected()) {
                    rbGMail.setSelected(false);
                    rbLive.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbYahoo.setSelected(false);
                    txtUsuario.setEnabled(false);
                    jpClave.setEnabled(false);
                    btnConectar.setEnabled(false);
                }
                else {
                    rbGMail.setSelected(false);
                    rbLive.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbYahoo.setSelected(false);
                    servidor = 0;
                    txtUsuario.setEnabled(true);
                    jpClave.setEnabled(true);
                    btnConectar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_rbHotmailMousePressed

    private void rbOutlookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOutlookMousePressed
        if (conexión) {
            if (evt.getClickCount() == 1) {
                if (rbGMail.isSelected()) {
                    rbHotmail.setSelected(false);
                    rbLive.setSelected(false);
                    rbGMail.setSelected(false);
                    rbYahoo.setSelected(false);
                    txtUsuario.setEnabled(false);
                    jpClave.setEnabled(false);
                    btnConectar.setEnabled(false);
                }
                else {
                    rbHotmail.setSelected(false);
                    rbLive.setSelected(false);
                    rbGMail.setSelected(false);
                    rbYahoo.setSelected(false);
                    servidor = 0;
                    txtUsuario.setEnabled(true);
                    jpClave.setEnabled(true);
                    btnConectar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_rbOutlookMousePressed

    private void rbLiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbLiveMousePressed
        if (conexión) {
            if (evt.getClickCount() == 1) {
                if (rbGMail.isSelected()) {
                    rbHotmail.setSelected(false);
                    rbGMail.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbYahoo.setSelected(false);
                    txtUsuario.setEnabled(false);
                    jpClave.setEnabled(false);
                    btnConectar.setEnabled(false);
                }
                else {
                    rbHotmail.setSelected(false);
                    rbGMail.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbYahoo.setSelected(false);
                    servidor = 0;
                    txtUsuario.setEnabled(true);
                    jpClave.setEnabled(true);
                    btnConectar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_rbLiveMousePressed

    private void rbYahooMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbYahooMousePressed
        if (conexión) {
            if (evt.getClickCount() == 1) {
                if (rbGMail.isSelected()) {
                    rbHotmail.setSelected(false);
                    rbLive.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbGMail.setSelected(false);
                    txtUsuario.setEnabled(false);
                    jpClave.setEnabled(false);
                    btnConectar.setEnabled(false);
                }
                else {
                    rbHotmail.setSelected(false);
                    rbLive.setSelected(false);
                    rbOutlook.setSelected(false);
                    rbGMail.setSelected(false);
                    servidor = 0;
                    txtUsuario.setEnabled(true);
                    jpClave.setEnabled(true);
                    btnConectar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_rbYahooMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobarConexión;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngGrupoBotones;
    private javax.swing.JPasswordField jpClave;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblEstadoConexión;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rbGMail;
    private javax.swing.JRadioButton rbHotmail;
    private javax.swing.JRadioButton rbLive;
    private javax.swing.JRadioButton rbOutlook;
    private javax.swing.JRadioButton rbYahoo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void verificarConexión() {
        ComprobarConexión comprobar_conexión = new ComprobarConexión();
        conexión = comprobar_conexión.comprobar();
        System.out.println(conexión);
        rbGMail.setEnabled(conexión);
        rbHotmail.setEnabled(conexión);
        rbLive.setEnabled(conexión);
        rbOutlook.setEnabled(conexión);
        rbYahoo.setEnabled(conexión);
        if (conexión) {
            lblEstadoConexión.setForeground(Color.GREEN);
            lblEstadoConexión.setText("Conexión establecida.");
            txtUsuario.setEnabled(true);
            jpClave.setEnabled(true);
            btnConectar.setEnabled(true);
        }
        else {
            lblEstadoConexión.setForeground(Color.RED);
            lblEstadoConexión.setText("No se ha podido establecer una conexión a Internet.");
            txtUsuario.setText("");
            jpClave.setText("");
            txtUsuario.setEnabled(false);
            jpClave.setEnabled(false);
            btnConectar.setEnabled(false);
        }
    }
}