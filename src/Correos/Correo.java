package Correos;

import java.io.Serializable;

/**
 *
 * @author Robert
 */
public class Correo implements Serializable{
    private String correo;
    private String mensaje;
    private String asunto;
    
    public Correo(){
        
    }
    public Correo(String correo, String mensaje, String asunto){
        this.correo = correo;
        this.mensaje = mensaje;
        this.asunto = asunto;
    }
    public Correo(Correo nuevoCorreo){/// no olvidadar llenar esto para realizar l=metodos de agregar o eliminar
        this.correo = nuevoCorreo.correo;
        this.mensaje = nuevoCorreo.mensaje;
        this.asunto = nuevoCorreo.asunto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "Correo{" + "correo=" + correo + ", mensaje=" + mensaje + '}';
    }
    
}
