
package Metodos.Contactos;

import java.io.Serializable;

public class Contacto implements Serializable{
    private int nGrupo;
    private String nombre;
    private String correo;
    private String telefono;
    private int nUsuario;

    public Contacto(int nGrupo,String nombre, String correo, String telefono, int nUsuario) {
        this.nGrupo = nGrupo;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.nUsuario = nUsuario;
    }

    public Contacto(Contacto nuevoCont) {
        this.nGrupo = nuevoCont.nGrupo;
        this.nombre = nuevoCont.nombre;
        this.correo = nuevoCont.correo;
        this.telefono = nuevoCont.telefono;
        this.nUsuario = nuevoCont.nUsuario;
    }

    public int getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(int nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getnGrupo() {
        return nGrupo;
    }

    public void setnGrupo(int nGrupo) {
        this.nGrupo = nGrupo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nGrupo=" + nGrupo + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", nUsuario=" + nUsuario + '}';
    }

    
    
        
}
