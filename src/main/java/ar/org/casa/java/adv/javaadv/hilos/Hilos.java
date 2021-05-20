package ar.org.casa.java.adv.javaadv.hilos;

public class Hilos {
    public static void main(String[] args) {
        System.out.println("Java versión: "+System.getProperty("java.version"));
        System.out.println("Cantidad de nucleos: "+Runtime.getRuntime().availableProcessors());
        
        HiloT hiloT1 = new HiloT("hiloT1");
        HiloT hiloT2 = new HiloT("hiloT2");
        HiloT hiloT3 = new HiloT("hiloT3");
        HiloT hiloT4 = new HiloT("hiloT4");
        
        //metodo run
        //hiloT1.run();
        //hiloT2.run();
        //hiloT3.run();
        //hiloT4.run();
        
        //El metodo star() ejecuta el metodo run en un nuevo hilo
        //hiloT1.start();
        //hiloT2.start();
        //hiloT3.start();
        //hiloT4.start();
        //new HiloT("hiloT5").run();
        
        HiloR hiloR1 = new HiloR("hiloR1");
        HiloR hiloR2 = new HiloR("hiloR2");
        HiloR hiloR3 = new HiloR("hiloR3");
        HiloR hiloR4 = new HiloR("hiloR4");
        
        Thread t1 = new Thread(hiloR1);
        Thread t2 = new Thread(hiloR2);
        Thread t3 = new Thread(hiloR3);
        Thread t6 = new Thread(new HiloR("hiloR6"));
        
        t1.start();
        t2.start();
        t3.start();
        new Thread(new HiloR("hiloR5")).start();
        new Thread(hiloR4).start();
        t6.start();
    }
}
