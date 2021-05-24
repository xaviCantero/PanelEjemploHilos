package ar.org.casa.java.ejercicio.empleado;
//"Saludo al jefe". trata de representar un ambiente laboral en donde los distintos 
//empleados llegan. Luego llega el jefe y lo saludan.
public class Saludo {
    public synchronized void saludar(String nombre, boolean esJefe){
        if(esJefe){
            System.out.println("Jefe: Hola llegue!!");
            ////con notify(); notificamos solamente un hilo que este pasuado wait();
            //y destrabamos ese hilo.
            notify();
            try{Thread.sleep(100);}catch(Exception e){}
            notify();
            try{Thread.sleep(100);}catch(Exception e){}
            notify();
            try{Thread.sleep(100);}catch(Exception e){}
            notify();
            try{Thread.sleep(100);}catch(Exception e){}
            notify();
            try{Thread.sleep(100);}catch(Exception e){}
            //con notifyAll(); notificamos a todos los hilos que tiene pasuado wait();
            //y destrabamos esa cola de hilos
            notifyAll();
        }else{
            System.out.println("Leego: "+nombre);
            //con wait(); pausamos este hilo de ejecucion  hasta que alguien notifique de continuar
            try{wait();}catch(Exception e){}
            System.out.println(nombre+": hola Jefe!!");
        }
    }
}
