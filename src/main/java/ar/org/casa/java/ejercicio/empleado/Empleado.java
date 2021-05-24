package ar.org.casa.java.ejercicio.empleado;

public class Empleado extends Thread{
    private String nombre;
    private Saludo saludo;
    private boolean esJefe;
    
    public Empleado(String nombre, Saludo saludo,boolean esJefe){
        this.nombre = nombre;
        this.saludo = saludo;
        this.esJefe = esJefe;
    }
    @Override
    public void run(){
        saludo.saludar(nombre, esJefe);
    }
}
