package Clases;

import java.io.IOException;
import java.net.Socket;


public class ComprobarConexión {
    public boolean comprobar() {
        String dirección_web = "http://wwww.google.es";
        int puerto = 80;
        try {
            Socket socket = new Socket(dirección_web, puerto);
            if (socket.isConnected()) {
                System.out.println("Conexión establecida con la dirección " + dirección_web + " a través del puerto " + puerto + ".");
            }
        }
        catch(IOException ex) {
            System.err.println("\nNo se pudo establecer conexión con " + dirección_web + " a través del puerto " + puerto + ".");
            ex.getStackTrace();
            return false;
        }
        return true;
    }
}
