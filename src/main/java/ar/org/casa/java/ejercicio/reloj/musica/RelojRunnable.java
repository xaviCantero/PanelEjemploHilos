package ar.org.casa.java.ejercicio.reloj.musica;

import java.text.DecimalFormat;
import java.time.LocalTime;
import javax.swing.JTextField;

public class RelojRunnable implements Runnable{
    private JTextField txt;
    
    public RelojRunnable(JTextField txt){
        this.txt = txt;
    }
    
    @Override
    public void run() {
        DecimalFormat df = new DecimalFormat("00");
        while(true){
            LocalTime lt = LocalTime.now();
            String hora = df.format(lt.getHour())+":"+
                    df.format(lt.getMinute())+":"+
                    df.format(lt.getSecond());
            txt.setText(hora);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
    
}
