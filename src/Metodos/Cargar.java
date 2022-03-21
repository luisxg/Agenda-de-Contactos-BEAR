
package Metodos;
import javax.swing.JProgressBar;
/**
 * @author Robert
 */
public class Cargar extends Thread{
    JProgressBar progreso;
    
    public Cargar(JProgressBar progreso){
        super();
        this.progreso = progreso;
    }
    @Override
    public void run(){
        for(int i=1; i<=100; i++){             
            progreso.setValue(i);
            pausa(30);
        }
    }
    public void pausa(int miseg){
        try{
            Thread.sleep(miseg);
        }catch(Exception ex){
            
        }
    }
}
