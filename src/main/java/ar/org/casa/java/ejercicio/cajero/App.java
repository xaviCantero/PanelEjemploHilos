package ar.org.casa.java.ejercicio.cajero;

public class App {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();
        
        Cliente cliente1 = new Cliente(cuenta);
        Cliente cliente2 = new Cliente(cuenta);
        
        cliente1.start();
        cliente2.start();
    }
}
