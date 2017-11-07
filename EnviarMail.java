package Clases;

import java.awt.HeadlessException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EnviarMail {
    String correo_personal;
    String password_personal;
    String servidor_SMTP;
    String[] destinatarios;
    String asunto = null;
    String cuerpo = null;
    String puerto_envío;
    int servidor;
    public EnviarMail(String[] receptor, String asunto, String cuerpo, int servidor) {
        destinatarios = receptor;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.servidor = servidor;
        configurarServidor();
    }
    public EnviarMail(String usuario, String password, String[] receptor, String asunto, String cuerpo, int servidor) {
        this(receptor, asunto, cuerpo, servidor);
        correo_personal = usuario;
        password_personal = password;
    }
    public final  void configurarServidor() {
        if (this.servidor == 0) {
            this.servidor_SMTP = "smtp.gmail.com";
            this.puerto_envío = "587";
        }
        if (this.servidor == 1) {
            this.servidor_SMTP = "smtp.live.com";
            this.puerto_envío = "587";
        }
        if (this.servidor == 2) {
            this.servidor_SMTP = "smtp.mail.yahoo.com";
            this.puerto_envío = "587";
        }
    }
    public void enviarEmail() throws MessagingException {
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.user", correo_personal);
        propiedades.put("mail.smtp.host", servidor_SMTP);
        propiedades.put("mail.smtp.port", puerto_envío);
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.socketFactory.port", puerto_envío);
        propiedades.put("mail.smtp.port", "587");
        SecurityManager seguridad = System.getSecurityManager();
        Authenticator autentificador = new autentificadorSMTP();
        Session sesión = Session.getInstance(propiedades, autentificador);
        sesión.setDebug(true);
        MimeMessage mensaje = new MimeMessage(sesión);
        mensaje.setText(cuerpo);
        mensaje.setSubject(asunto);
        mensaje.setFrom(new InternetAddress(correo_personal));
        Address[] destinos = new Address[destinatarios.length];
        for (int i = 0; i < destinos.length; i ++) {
            destinos[i] = new InternetAddress(destinatarios[i]);
        }
        mensaje.addRecipients(Message.RecipientType.TO, destinos);
        try {
            Transport protocolo_transporte = sesión.getTransport();
            protocolo_transporte.connect(correo_personal, password_personal);
            protocolo_transporte.sendMessage(mensaje, mensaje.getAllRecipients());
            JOptionPane.showMessageDialog(null, "El correo electrónico ha sido enviado con éxito.");
            protocolo_transporte.close();
        }
        catch(HeadlessException | MessagingException ex) {
            JOptionPane.showMessageDialog(null, ex.getCause().getLocalizedMessage(), "Mensaje de error de " + seguridad.toString() + ":", JOptionPane.ERROR_MESSAGE);
            ex.getStackTrace();
            throw new AuthenticationFailedException();
        }
    }
    private class autentificadorSMTP extends Authenticator {

        public autentificadorSMTP() {
        }
        public PasswordAuthentication obtenerAutentificaciónDeContraseña() {
            return new PasswordAuthentication(EnviarMail.this.correo_personal, EnviarMail.this.password_personal);
        }
    }
}