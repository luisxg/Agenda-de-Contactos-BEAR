package Metodos;

import java.io.Serializable;

/**
 *
 * @author luisg
 */
public class GrupoUsuarios implements Serializable{

    private static Usuario[] usuarios;
    private static int numeroUsuarios;

    static {
        usuarios = new Usuario[2];
        numeroUsuarios = 2;
    }

    public GrupoUsuarios() {
        usuarios[0] = new Usuario(0, "Luis", "luisgx14@gmail.com", "12345");
        usuarios[1] = new Usuario(1, "Roberth", "luisgx15@gmail.com", "01111");
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        GrupoUsuarios.usuarios = usuarios;
    }

    public int getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public void setNumeroUsuarios(int numeroUsuarios) {
        GrupoUsuarios.numeroUsuarios = numeroUsuarios;
    }

    public void añadirUsuario(Usuario nuevo) {
        Usuario[] Aux;
        if (numeroUsuarios == usuarios.length) {
            Aux = new Usuario[numeroUsuarios + 1];
            //Copia un arreglo a otro
            System.arraycopy(usuarios, 0, Aux, 0, numeroUsuarios);
            usuarios = Aux;
        }
        usuarios[numeroUsuarios] = new Usuario(nuevo);
        numeroUsuarios++;
    }

    public void editarUsuario(int id, Usuario nuevo) {
        usuarios[id] = new Usuario(nuevo);
    }

    public static String imprimirUsuarios() {
        String texto = "";
        for (Usuario element : usuarios) {
            if (usuarios != null) {
                texto += element + "\n";
            }
        }
        return "Usuarios:\n" + texto;
    }
    //validar repetido
    public boolean repetido(Usuario user, String nombre){
        boolean repetido = false;
        //String nom = user.getNombre();
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                repetido = true;
            }
        }
        return repetido;
    }
    
}
