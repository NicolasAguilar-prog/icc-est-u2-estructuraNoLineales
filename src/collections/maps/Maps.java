package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {

    //Set<V>

    //Map<K, V>
    //Map<tipoClave,tipoValor>
    //Map <String, Integer>
    public Map<String, Integer> contruirMap(){
        Map<String, Integer> m = new HashMap<>();
        //Al ser hash no guarda un orden
        m.put("A", 10);
        m.put("B", 20);
        m.put("C", 30);
        m.put(  "A", 50);
        System.out.println(m.size());
        System.out.println(m);
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.values().toArray()[i]);
        }
        for (String key : m.keySet()) {
            System.out.println(key);
        }

        System.out.println(m.get("A"));
        System.out.println(m.get("B"));
        System.out.println(m.get("F"));

        m.putIfAbsent("F", 100);
        m.putIfAbsent("A", 200);
        System.out.println(m);
        return m;
    }
    public Map<String, Integer> clinkedHasMap(){
        Map<String, Integer> mapa = new LinkedHashMap<>();
        //Orden en el que fueron ingresados
        mapa.put("J", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put(  "A", 50);
        System.out.println("LINKEDMAP: "+mapa);
        return mapa;    
    }
    public Map<String, Integer>  cTreeMap(){
        Map<String, Integer> mapa = new TreeMap<>();
        //El tree ordena segun las key
        mapa.put("a", 10);
        mapa.put("AB", 20);
        mapa.put("A", 30);
        mapa.put(  "aA", 50);
        System.out.println("TreeMap:"+mapa);
        return mapa;    
    }

    public Set<Contacto> ordenarUnicos(List<Contacto>contactos){
        //Retornar contactos UNICOS
        //Unicos->Nombre
        Set<Contacto> nueva = new TreeSet<>((c1,c2)->{
            int comparacion= c1.getNombre().compareTo(c2.getNombre());
            if (comparacion !=0) return comparacion;
            int comparacionn= c1.getApellido().compareTo(c2.getApellido());
            return comparacionn;
        });
        return null;
        


        //Ordene segun el Apellido de manera descendente
    }
}
