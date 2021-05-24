package ar.org.casa.java.ejercicio.empleado;
public class App2 {
    public static void main(String[] args){
        Saludo saludo = new Saludo();
        
        Empleado lorena = new Empleado("Lorena", saludo, false);
        Empleado gaston = new Empleado("Gaston", saludo, false);
        Empleado raul = new Empleado("Raul", saludo, false);
        Empleado fermina = new Empleado("Fermina", saludo, false);
        Empleado jefe = new Empleado("Jefe", saludo, true);
        
        lorena.start();
        gaston.start();
        raul.start();
        fermina.start();
        //domimos el hilo para que todos los empoleados entren antes que el jefe
        try{Thread.sleep(200);}catch(Exception e){}
        jefe.start();
    }
}
