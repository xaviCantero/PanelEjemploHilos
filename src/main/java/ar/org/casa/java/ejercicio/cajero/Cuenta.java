package ar.org.casa.java.ejercicio.cajero;

public class Cuenta {
    private double saldo = 2000;
    //cuando alguien esta trabajando en un metodo synchronized,
    //pruduce un bloqueo en los demas metodos que contengan synchronized.
    
    public synchronized void depositar(double monto){
        saldo += monto;
    }
    public void devitar(double monto){
        
        System.out.println("---Iniciando operación devito");
        //Utilizando synchronized parcial en este bloque deja pasar un  hilo y 
        //pone en esperaa a los otros hilos,
        synchronized(this){// jdk 7 o superior
        if(saldo >= monto){
            try{Thread.sleep(2000);}catch(Exception e){}
                saldo-=monto;
        }else{System.out.println("*Ingrese una cantidad valida*");
        }
        }
            System.out.println("---Fin de la operación debito---");
    }
    
    //synchronized en este metodo deja pasar un  hilo y pone en esperaa a los otros hilos,
    //formando asi como cola de espera 
    public synchronized double getaSaldo(){
        return saldo;
    }
}
