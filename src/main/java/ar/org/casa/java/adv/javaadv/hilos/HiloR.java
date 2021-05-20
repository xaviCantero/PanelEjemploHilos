package ar.org.casa.java.adv.javaadv.hilos;

public class HiloR implements Runnable{
    public String nombre;
    
    public HiloR(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        for(int a = 0; a <= 10; a++){
            System.out.println(nombre+" "+a);
        }
    }
    
}
