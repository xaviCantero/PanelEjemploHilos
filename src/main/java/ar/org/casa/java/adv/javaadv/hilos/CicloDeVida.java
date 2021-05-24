package ar.org.casa.java.adv.javaadv.hilos;

public class CicloDeVida {
    public static void main(String[] args) {
        
        //creamos el objeto y por constructor le indicamos 
        //la prioridad de cada hilo (da resultado mas exactos)
        HiloT hiloT1 = new HiloT("HiloT1");
        HiloT hiloT2 = new HiloT("HiloT2",600);
        HiloT hiloT3 = new HiloT("HiloT3",400);
        HiloT hiloT4 = new HiloT("HiloT4",200);
        
        System.out.println(hiloT1.getId());
        System.out.println(hiloT1.getName());
        System.out.println(hiloT1.getState());
        
        //fijamos prioridades de ejecucion a los hilos. (No de resultados exactos)
        /*hiloT1.setPriority(Thread.MIN_PRIORITY);
        hiloT2.setPriority(Thread.MAX_PRIORITY);
        hiloT3.setPriority(Thread.NORM_PRIORITY);
        hiloT4.setPriority(Thread.NORM_PRIORITY);
        */
        try{
        //En este caso con el metodo join 
        //enfocamos cada  hilo hasta que se termine de ejecutar 
        hiloT1.start();
        //hiloT1.join();
        hiloT2.start();
        //hiloT2.join();
        hiloT3.start();
        //hiloT3.join();
        hiloT4.start();
        //hiloT4.join();
        
        //con join enfocamos los hilos hasta que se terminen de ejecutar 
        hiloT1.join();
        hiloT2.join();
        hiloT3.join();
        hiloT4.join();
        }catch(Exception e){}
        
        //matamos el hilo
        //hiloT2.stop();
        //try{Thread.sleep(200);}catch(Exception e){}
        //System.out.println(hiloT2.getState());
        //try{Thread.sleep(1200);}catch(Exception e){}
        System.out.println("---Fin Del Programa---");
        
    }
}
