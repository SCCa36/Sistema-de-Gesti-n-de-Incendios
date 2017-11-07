package Hilos;

import Clases.EnviarMail;
import Clases.EnviarMailComplejo;
import Ventanas.EnviarEmail;
import Ventanas.LoginEmail;
import ds.desktop.notify.DesktopNotify;
import javax.mail.MessagingException;

public class HiloComprobarEnvíoEmail extends Thread {
    private boolean continuar = true;
    public static boolean envío_exitoso = false;
    public void detenerHilo() {
        continuar = false;
    }
    @Override
    public void run() {
        while(continuar) {
            if (EnviarEmail.archivo_adjunto.isEmpty()) {
                EnviarMail email_sin_adjunto = new EnviarMail(LoginEmail.u, LoginEmail.contraseña, EnviarEmail.destinatarios, EnviarEmail.asunto, EnviarEmail.mensaje, LoginEmail.servidor);
                try {
                    email_sin_adjunto.enviarEmail();
                    envío_exitoso = true;
                    String notificación = "Su mensaje fué enviado con éxito a los siguientes contactos:\n";
                    for (String valor : EnviarEmail.destinatarios) {
                        notificación = notificación + "- " + valor + "\n";
                    }
                    EnviarEmail.notificarEnvío(false);
                    DesktopNotify.showDesktopMessage("Aviso de envío de mensaje.", new Object[] {notificación}.toString(), DesktopNotify.SUCCESS);
                }
                catch(MessagingException ex) {
                    DesktopNotify.showDesktopMessage("Error en el envío del mensaje.", ex.getCause().getLocalizedMessage(), DesktopNotify.ERROR);
                    EnviarEmail.notificarEnvío(false);
                    EnviarEmail.vaciar(true);
                    ex.getStackTrace();
                    detenerHilo();
                }
            }
            else {
                EnviarMailComplejo email_con_adjunto = new EnviarMailComplejo(LoginEmail.u, LoginEmail.contraseña, EnviarEmail.destinatarios, EnviarEmail.asunto, EnviarEmail.mensaje, EnviarEmail.adjuntos, LoginEmail.servidor);
                try {
                    email_con_adjunto.enviarEmailComplejo();
                    envío_exitoso = true;
                    String notificación = "Su mensaje fué enviado con éxito a los siguientes contactos:\n";
                    for (String valor : EnviarEmail.destinatarios) {
                        notificación = notificación + "- " + valor + "\n";
                    }
                    EnviarEmail.notificarEnvío(false);
                    EnviarEmail.vaciar(true);
                    DesktopNotify.showDesktopMessage("Aviso de envío del mensaje.", new Object[] {notificación}.toString(), DesktopNotify.SUCCESS);
                }
                catch(MessagingException ex1) {
                    DesktopNotify.showDesktopMessage("Error en el envío del mensaje.", ex1.getCause().getLocalizedMessage(), DesktopNotify.ERROR);
                    EnviarEmail.notificarEnvío(false);
                    ex1.getStackTrace();
                    detenerHilo();
                }
            }
        }
    }
}