package evaluacion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

    public class PersonaController {
        public Set<Personaa> filtrarYOrdenar(List<Personaa> personas, int edadUmbral){
            Set<Personaa> personasFiltradas = new TreeSet<>((p1, p2) -> {

                int compEdad = Integer.compare(p1.getEdad(), p2.getEdad());

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


    public Map<String, Set<String>> agruparPorEdad(List<Personaa>personas){
        String nombre = "Juan Perez";
        String[] palabras = nombre.split(" ");
        String primerNombre = palabras[0];
        // ["Juan", "Perez"]
        return null;
    }
}
