
package Correos;

import java.io.Serializable;

/**
 *
 * @author Robert
 */
public class GrupoCorreos implements Serializable{
    private static  Correo[] correosArray;
    private static int numeroCorreo;
    
    static {
        correosArray = new Correo[2];
        numeroCorreo = 2;
    }
    
    public GrupoCorreos(){
        correosArray[0] = new Correo("ejemplo@hormail.com","Aquie se detalla el mensaje enviado, primer correo","asunto 1");
        correosArray[1] = new Correo("ejemplo2@hormail.com","Aquie se detalla el mensaje enviado segundo correo","asunto2");
    }
    //
    public GrupoCorreos(Correo[] correo,String mensaje){
        GrupoCorreos.correosArray = correo;
    }
    //
    public void añadirMensaje(Correo nuevoCorreo) {
        Correo[] contAux;
        if (numeroCorreo == correosArray.length) {
            contAux = new Correo[numeroCorreo + 1];
            //Copia un arreglo a otro
            System.arraycopy(correosArray, 0, contAux, 0, correosArray.length);
            correosArray = contAux;
        }
        correosArray[numeroCorreo] = new Correo(nuevoCorreo);
        numeroCorreo++;
    }
    //
    public String imprimirContactos() {
        String texto = "";
        for (Correo element : correosArray) {
            if (correosArray != null) {
                texto += element + "\n";
            }
        }
        return " Método mostrar mensajes-> \n" + texto;
    }
    //

    public static Correo[] getCorreosArray() {
        return correosArray;
    }

    public static void setCorreosArray(Correo[] correosArray) {
        GrupoCorreos.correosArray = correosArray;
    }

    public static int getNumeroCorreo() {
        return numeroCorreo;
    }

    public static void setNumeroCorreo(int numeroCorreo) {
        GrupoCorreos.numeroCorreo = numeroCorreo;
    }
    //
    public Correo[] ObtenerCorreos(){
        
        return correosArray;
    }
}
