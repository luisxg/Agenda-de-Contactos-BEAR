
package Metodos;

import java.applet.AudioClip;

/**
 * @author Robert
 */
public class Sonidos {
    AudioClip music;
    public void apagar(){
        music.stop();
    } 
    public void musicaInicio(){
        music = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Sonido_de_xbox_one.wav"));
        music.play();
    }
    public void musicaError(){
        music = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/sonido-de-error.wav"));
        music.play();
    }
}
