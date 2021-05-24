package ar.org.casa.java.ejercicio.reloj.musica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ReproductorRunnable implements Runnable{
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        //new Player(new FileInputStream("anaranjado.mp3")).play();
    }
    
    public ReproductorRunnable(){}
    @Override
    public void run() {
        try{
        new Player(new FileInputStream("anaranjado.mp3")).play();
        }catch(Exception e){e.printStackTrace();}
    }
    

    
}
