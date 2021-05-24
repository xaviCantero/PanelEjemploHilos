package ar.org.casa.java.ejercicio.cajero;

public class Cliente extends Thread{
    private Cuenta cuenta;
    
    public Cliente(Cuenta cuenta){this.cuenta = cuenta;}
    

    @Override
    public synchronized void run(){
        cuenta.devitar(2000);
        System.out.println("Saldo: "+cuenta.getaSaldo());
    }
}
