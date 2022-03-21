package Validaciones;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que contiene la validación de los datos
 *
 */
public class ValidarDatos implements Serializable{

    /**
     * Este método permite validar que inicie con mayúscula y solo letras Usando
     * expresiones regulares Con clases Pattern y Marcher
     *
     * @param nombre
     * @return true en el caso de que la validación sea correcta
     */
    public boolean validarNombre(String nombre) {
        Pattern pat = Pattern.compile("^[A-Z][a-z]{3,10}$");
        Matcher mat = pat.matcher(nombre);
        boolean b = mat.matches();
        return b;
    }

    /**
     * Este método permite validar que contenga solo 10 números Usando
     * expresiones regulares Con clases Pattern y Marcher
     *
     * @param numero
     * @return true en el caso de que la validación sea correcta
     */
    public boolean validarClave(String numero) {
        Pattern pat = Pattern.compile("[0-9]{5}$");
        Matcher mat = pat.matcher(numero);
        boolean b = mat.matches();
        return b;
    }

    /**
     * Este método permite validar que contenga solo 1 número Usando expresiones
     * regulares Con clases Pattern y Marcher
     *
     * @param numero
     * @return true en el caso de que la validación sea correcta
     */
    public boolean validarUnNumero(String numero) {
        Pattern pat = Pattern.compile("[0-9]{1}$");
        Matcher mat = pat.matcher(numero);
        boolean b = mat.matches();
        return b;
    }

    /**
     * Este método permite validar que contenga solo 10 números Usando
     * expresiones regulares Con clases Pattern y Marcher
     *
     * @param numero
     * @return true en el caso de que la validación sea correcta
     */
    public boolean validarTelefono(String numero) {
        Pattern pat = Pattern.compile("[0-9]{10}$");
        Matcher mat = pat.matcher(numero);
        boolean b = mat.matches();
        return b;
    }

    /**
     * Este método permite validar el formato del correo electronico Usando
     * expresiones regulares Con clases Pattern y Marcher
     *
     * @param correo
     * @return true en el caso de que la validación sea correcta
     */
    public boolean validarCorreo(String correo) {
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(correo);
        boolean b = mat.matches();
        return b;
    }
    
}
