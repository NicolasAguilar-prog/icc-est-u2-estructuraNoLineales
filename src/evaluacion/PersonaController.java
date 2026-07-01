package evaluacion;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

    public class PersonaController {
        public Set<Personaa> filtrarYOrdenar(List<Personaa> personas, int edadUmbral){
            Set<Personaa> personasFiltradas = new TreeSet<>((p1, p2) -> {


                if (p1.getEdad() == p2.getEdad()
                        && p1.getNombre().equalsIgnoreCase(p2.getNombre())) {
                    return 0;
                }
                int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());

                if (compEdad != 0) {
                    return compEdad;
                }

                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            });
            
            for (Personaa p : personas) {
                if (p.getEdad() >= edadUmbral) {
                    personasFiltradas.add(p);
                }
            }

            return personasFiltradas;
        }

        // String nombre = "Juan Perez";
        // String[] palabras = nombre.split(" ");
        // String primerNombre = palabras[0];
        // // ["Juan", "Perez"]
        // return null;


    public Map<String, Set<String>> agruparPorEdad(List<Personaa>personas){
        Map<String, Set<String>> mapa = new TreeMap<>();
        mapa.put("JOVEN", new LinkedHashSet<>());
        mapa.put("ADULTO", new LinkedHashSet<>());
        mapa.put("MAYOR", new LinkedHashSet<>());

        for(Personaa p : personas){

            String[] palabras = p.getNombre().split(" ");
            String primerNombre = palabras[0];

            if(p.getEdad() < 30){
                mapa.get("JOVEN").add(primerNombre);
            }
            else if(p.getEdad() < 60){
                mapa.get("ADULTO").add(primerNombre);
            }
            else{
                mapa.get("MAYOR").add(primerNombre);
            }
        }

        return mapa;
        
        

    }
}
