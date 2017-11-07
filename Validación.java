package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validación {
    public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static boolean validarEmail(String email) {
        try {
            Pattern p = Pattern.compile(EMAIL_PATTERN);
            Matcher m = p.matcher(email);
            return m.matches();
        }
        catch(Exception ex) {
            ex.getStackTrace();
        }
        return false;
    }
}