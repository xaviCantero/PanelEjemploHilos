package ar.org.casa.java.ejercicio.threadd.collectionss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ThreadCollections {
    public static void main(String[] args) {
        //Diferencias entre Hashtable y HashMap
        /*
        Hashtable: (lagacy) *obsoleto
            -Métodos synchronized.
            -MultiThread.
            -Lento.
        
        HashMap:
            -Métodos no synchronized.
            -No MultiThread.
            -Veloz.
        
        Clase Collections: Provee un factory colecciones  
        parcialmente  synchronized. jdk 7 o mas
        */
        //Hashtable mapa = new Hashtable();
        //HashMap mapa = new HashMap();
        Map<String, String> mapa = Collections.synchronizedMap(new HashMap<String, String>());
        mapa.put("Lu", "Lunes");
        mapa.put("Ma", "Martes");
        mapa.put("Mi", "Miercoles");
        mapa.put("Ju", "Jueves");
        mapa.put("Vi", "Vienes");
        mapa.forEach((k,v)->System.out.println(k+" "+v));  
        
    }
}
