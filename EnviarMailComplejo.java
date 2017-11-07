package Clases;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviarMailComplejo {
    public static String correo_personal;
    public static String password_personal;
    String servidor_SMTP;
    String puerto_envío;
    String[] destinatarios;
    String asunto;
    String cuerpo = null;
    public static String[] archivo_adjunto;
    int servidor;
    public EnviarMailComplejo(String[] destinatarios, String asunto, String mensaje, String[] archivo, int servidor) {
       this.destinatarios = destinatarios;
       this.asunto = asunto;
       cuerpo = mensaje;
       archivo_adjunto = archivo;
       this.servidor = servidor;
       configurarServidor();
    }
    public EnviarMailComplejo(String usuario, String password, String[] destinatarios, String asunto, String mensaje, String[] archivo, int servidor) {
        this(destinatarios, asunto, mensaje, archivo, servidor);
        correo_personal = usuario;
        password_personal = password;
    }
    public final void configurarServidor() {
        if (this.servidor == 0) {
            servidor_SMTP = "smtp.gmail.com";
        }
        if (this.servidor == 1) {
            servidor_SMTP = "smtp.live.com";
        }
        if (this.servidor == 2) {
            servidor_SMTP = "smtp.mail.yahoo.com";
        }
    }
    public void enviarEmailComplejo() throws MessagingException {
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", servidor_SMTP);
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.user", correo_personal);
        propiedades.setProperty("mail.smtp.auth", "true");
        SecurityManager seguridad = System.getSecurityManager();
        Session sesión = Session.getInstance(propiedades, new GMailAuthenticator(correo_personal, password_personal));
        BodyPart texto = new MimeBodyPart();
        texto.setText(cuerpo);
        BodyPart[] adjunto = new BodyPart[archivo_adjunto.length];
        for (int i = 0; i < archivo_adjunto.length; i ++) {
            adjunto[i] = new MimeBodyPart();
            adjunto[i].setDataHandler(new DataHandler(new FileDataSource(archivo_adjunto[i])));
            String[] ruta_archivo = archivo_adjunto[i].split("/");
            int nombre = ruta_archivo.length - 1;
            adjunto[i].setFileName(ruta_archivo[nombre]);
        }
        MimeMultipart multiparte = new MimeMultipart();
        multiparte.addBodyPart(texto);
        for (BodyPart auxiliar : adjunto) {
            multiparte.addBodyPart(auxiliar);
        }
        MimeMessage mensaje = new MimeMessage(sesión);
        mensaje.setFrom(new InternetAddress(correo_personal));
        Address[] destinos = new Address[destinatarios.length];
        for (int j = 0; j < destinos.length; j ++) {
            destinos[j] = new InternetAddress(destinatarios[j]);
        }
        mensaje.addRecipients(Message.RecipientType.TO, destinos);
        mensaje.setSubject(asunto);
        mensaje.setContent(multiparte);
        Transport protocolo_transporte = sesión.getTransport("smtp");
        protocolo_transporte.connect(correo_personal, password_personal);
        protocolo_transporte.sendMessage(mensaje, mensaje.getAllRecipients());
        protocolo_transporte.close();
    }
    private class GMailAuthenticator extends Authenticator {
        String usuario, password;
        public GMailAuthenticator(String correo_personal, String password_personal) {
            super();
            usuario = correo_personal;
            password = password_personal;
        }
        public PasswordAuthentication obtenerAutentificaciónDePassword() {
            return new PasswordAuthentication(usuario, password);
        }
    }
}