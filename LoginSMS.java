package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class LoginSMS extends javax.swing.JFrame {
    private static final long serialVersionUID = 2922088437158361342L;
    ImageIcon fondo;
    Icon icono_fondo;
    public LoginSMS() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/bandera_de_Galicia.png")).getImage());
        fondo = new ImageIcon(getClass().getResource("/Imágenes/paisaje_gallego.jpg"));
        icono_fondo = new ImageIcon(fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono_fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTítulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        jpContraseña = new javax.swing.JPasswordField();
        btnIniciarSesión = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Incendios - Login SMS");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(0, 204, 0));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("LOGIN SMS");
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 376, 97));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 127, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 127, 292, -1));

        lblClave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblClave.setForeground(new java.awt.Color(255, 255, 255));
        lblClave.setText("Clave:");
        getContentPane().add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 163, -1, -1));
        getContentPane().add(jpContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 163, 292, -1));

        btnIniciarSesión.setBackground(new java.awt.Color(0, 0, 255));
        btnIniciarSesión.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIniciarSesión.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesión.setText("Iniciar Sesión");
        btnIniciarSesión.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        btnIniciarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesiónActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 237, 147, 51));

        btnSalir.setBackground(new java.awt.Color(0, 51, 255));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 237, 125, 51));

        lblError.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 199, 376, 20));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesiónActionPerformed
        try {
            if (txtUsuario.getText().equals("") && jpContraseña.getText().equals("")) {
                lblError.setText("Debes introducir tu usuario y tu contraseña.");
            }
            else if (txtUsuario.getText().equals("") || jpContraseña.getText().equals("")) {
                if (txtUsuario.getText().equals("")) {
                    lblError.setText("Debe de introducir su nombre de usuario.");
                    txtUsuario.setFocusable(true);
                }
                if (jpContraseña.getText().equals("")) {
                    lblError.setText("Debe de introducir su contraseña.");
                    jpContraseña.setFocusable(true);
                }
            }
            else {
                EnviarSMS sms = new EnviarSMS();
                sms.setLocationRelativeTo(null);
                sms.setVisible(true);
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getCause().getLocalizedMessage(), "Error al iniciar sesión.", JOptionPane.ERROR_MESSAGE);
            ex.getStackTrace();
        }
    }//GEN-LAST:event_btnIniciarSesiónActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesión;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}