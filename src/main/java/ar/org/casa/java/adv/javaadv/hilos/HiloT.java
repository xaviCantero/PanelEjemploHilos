package ar.org.casa.java.adv.javaadv.hilos;

public class HiloT extends Thread{
    String nombre;
    
    public HiloT(String nombre){
        this.nombre = nombre;   
    }
    
    @Override
    public void run(){
        for(int a = 0; a <= 10; a++){
            System.out.println(nombre+" "+a);
            //try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
