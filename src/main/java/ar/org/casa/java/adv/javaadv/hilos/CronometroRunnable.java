package ar.org.casa.java.adv.javaadv.hilos;

import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CronometroRunnable implements Runnable {
    private JTextField txt;
    int cont;
    boolean correr = false;
    private DecimalFormat df = new DecimalFormat("000000");
    
    public CronometroRunnable(JTextField txt){
        this.txt = txt;
    }
    @Override
    public void run() {
        while(true){
            if(correr){
            cont++;
            txt.setText(df.format(cont));
            }
        try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
    
    public void start(){correr = true;}
    public void pause(){correr = false;}
    public void stop(){
        correr = false;
        cont = 0;
        txt.setText(df.format(cont));
    }
}
