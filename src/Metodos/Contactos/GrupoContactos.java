package Metodos.Contactos;

import Metodos.GrupoUsuarios;
import Metodos.Usuario;
import java.io.Serializable;
import javax.swing.JComboBox;

/**
 *
 * @author luisg
 */
public class GrupoContactos implements Serializable {

    public static Contacto[] contactos;
    private static int numeroContacto;

//    static {
//        contactos = new Contacto[10];
//        numeroContacto = 10;
//    }
    public GrupoContactos(Contacto[] contactos, int numeroContacto) {
        this.contactos = contactos;
        this.numeroContacto = numeroContacto;
    }

    public GrupoContactos() {
        this(new Contacto[10], 10);
        contactos[0] = new Contacto(3, "Luis", "luis@gmail.com", "099088801", 0);          //1 Trabajo
        contactos[1] = new Contacto(1, "Roberth", "root@gmail.com", "0123456789", 0);      //2 Familia
        contactos[2] = new Contacto(1, "Javier", "root@gmail.com", "0123456789", 0);       //3 Amigos
        contactos[3] = new Contacto(2, "Edwart", "root@gmail.com", "0123456789", 0);
        contactos[4] = new Contacto(2, "Juan", "root@gmail.com", "0123456789", 0);
        contactos[5] = new Contacto(3, "Simon", "root@gmail.com", "0123456789", 1);
        contactos[6] = new Contacto(3, "Sebastian", "root@gmail.com", "0123456789", 1);
        contactos[7] = new Contacto(1, "Pancho", "root@gmail.com", "0123456789", 1);
        contactos[8] = new Contacto(1, "Alison", "root@gmail.com", "0123456789", 1);
        contactos[9] = new Contacto(3, "Pepe", "root@gmail.com", "0123456789", 1);
    }

    public void añadirContacto(Contacto nuevoCont) {
        Contacto[] contAux;
        if (numeroContacto == contactos.length) {
            contAux = new Contacto[numeroContacto + 1];
            //Copia un arreglo a otro
            System.arraycopy(contactos, 0, contAux, 0, contactos.length);
            contactos = contAux;
        }
        contactos[numeroContacto] = new Contacto(nuevoCont);
        numeroContacto++;
    }

    public void editarContacto(int id, Contacto nuevoCont) {
        contactos[id] = new Contacto(nuevoCont);
    }

    public void eliminarContacto(int i) {

        Contacto[] contAux;
        contAux = new Contacto[contactos.length - 1];

        //Eliminar cliente, dependiendo de cual queramos
        if (i == 0) {
            //Copia un arreglo a otro
            System.arraycopy(contactos, 1, contAux, 0, contactos.length - 1);
            contactos = contAux;
        } else if (i == contactos.length - 1) {
            System.arraycopy(contactos, 0, contAux, 0, contactos.length - 1);
            contactos = contAux;
        } else if (i > 0 && i < contactos.length - 1) {
            System.arraycopy(contactos, 0, contAux, 0, i);
            System.arraycopy(contactos, i + 1, contAux, i, contactos.length - (i + 1));
            contactos = contAux;
        }
        numeroContacto--;
    }

    public String imprimirContactos() {
        String texto = "";
        for (Contacto element : contactos) {
            if (contactos != null) {
                texto += element + "\n";
            }
        }
        return " Método mostrar contactos-> \n" + texto;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        GrupoContactos.contactos = contactos;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        GrupoContactos.numeroContacto = numeroContacto;
    }

    public Contacto[] getContactosUsuario(int nUsuario) {
        Contacto[] contactosFinal = null;
        contactos = getContactos();
        int conteo = 0;
        if (contactos == null) {
            System.out.println("El arreglo esta vacio");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i].getnUsuario() == nUsuario) {
                    conteo++;
                }
            }

            contactosFinal = new Contacto[conteo];
            conteo = 0;

            for (int j = 0; j < contactos.length; j++) {
                if (contactos[j].getnUsuario() == nUsuario) {
                    contactosFinal[conteo] = contactos[j];
                    conteo++;
                }
            }
        }

        return contactosFinal;
    }

    public Contacto[] getContactosVerificar(String nombreGrupo, JComboBox<String> cbGrupo, String correoUsuario) {
        int posicion = 0;
        int conteo = 0;
        Contacto[] contactosFinal;

        for (int i = 0; i < cbGrupo.getItemCount(); i++) {
            if (nombreGrupo.equals(cbGrupo.getItemAt(i))) {
                posicion = cbGrupo.getSelectedIndex();
            }
        }
        //Obtener el usuario que esta ingresado 

        Usuario[] usuariosAux;
        GrupoUsuarios gUsers = new GrupoUsuarios();
        usuariosAux = gUsers.getUsuarios();

        int nUsuario = 0;
        for (Usuario usuariosAux1 : usuariosAux) {
            if (usuariosAux1.getCorreo().equals(correoUsuario)) {
                nUsuario = usuariosAux1.getId();
            }
        }

        Contacto[] contactosAux = getContactosUsuario(nUsuario);
        if (posicion == 0) {
            contactosFinal = contactosAux;
        } else {
            for (Contacto contactosAux1 : contactosAux) {
                if (contactosAux1.getnGrupo() == posicion) {
                    conteo++;
                }
            }

            contactosFinal = new Contacto[conteo];
            conteo = 0;
            for (Contacto contactosAux1 : contactosAux) {
                if (contactosAux1.getnGrupo() == posicion) {
                    contactosFinal[conteo] = contactosAux1;
                    conteo++;
                }
            }
        }
        return contactosFinal;
    }

    /**
     * Metodo para buscar contacto solo con el nombre string
     *
     * @param buscar
     * @return
     */
    public String[] buscarContacto(String buscar) {
        String[] datos = new String[4];
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equals(buscar)) {
                datos[0] = String.valueOf(contactos[i].getnGrupo());
                datos[1] = contactos[i].getNombre();
                datos[2] = contactos[i].getCorreo();
                datos[3] = contactos[i].getTelefono();
            }
        }
        return datos;
    }

    //validar repetido
    public boolean repetido(Contacto contac, String nombre) {
        boolean repetido = false;
        String nom = contac.getNombre();
        if (contactos == null) {
            System.out.println("El arreglo esta vacio");
            repetido = false;
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i].getNombre().equals(nombre)) {
                    repetido = true;
                }
            }
        }

        return repetido;
    }

}
