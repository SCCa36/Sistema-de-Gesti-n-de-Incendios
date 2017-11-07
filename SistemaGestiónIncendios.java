package sistemagestiónincendios;

import Ventanas.Bienvenida;
import Ventanas.Principal;


public class SistemaGestiónIncendios {

    
    public static void main(String[] args) {
        Bienvenida intro = new Bienvenida();
        intro.setLocationRelativeTo(null);
        intro.setVisible(true);
        for (int i = 0; i <= 100; i ++) {
            try {
                Thread.sleep(75);
            }
            catch(InterruptedException ex) {
                ex.getStackTrace();
            }
            intro.barraProgreso.setValue(i);
        }
        intro.dispose();
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
}
