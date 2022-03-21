package Metodos;

import java.io.Serializable;

/**
 *
 * @author luisg
 */
public class Usuario implements Serializable{

    private int id;
    private String nombre;
    private String correo;
    private String clave;

    public Usuario(int id, String nombre, String correo, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    Usuario(Usuario nuevoUs) {
        this.id = nuevoUs.id;
        this.nombre = nuevoUs.nombre;
        this.correo = nuevoUs.correo;
        this.clave = nuevoUs.clave;

    }
    public Usuario(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + '}';
    }

    
}
