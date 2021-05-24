package ar.org.casa.java.adv.javaadv.hilos;

public class HiloT extends Thread{
    String nombre;
    int time = 1000;
    
    public HiloT(String nombre){
        this.nombre = nombre;   
    }
    
    //creamos un contructor sobrecargado para dar prioridad a ciertos hilos
    public HiloT(String nombre, int time){
        this.nombre = nombre;
        this.time = time;
    } 
    
    @Override
    public void run(){
        for(int a = 0; a <= 10; a++){
            System.out.println(nombre+" "+a);
            try{Thread.sleep(time);}catch(Exception e){}
        }
    }
}
