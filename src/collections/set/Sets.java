package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {
    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();     
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");  
        return hashSet;
    }


    public Set<String> construirLinkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();     
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");  
        return linkedHashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> treeSet = new TreeSet<>();     
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");  
        return treeSet;
    }

    public Set<Contacto> construirHashSetCOntacto(){
        Set<Contacto> hCSet= new HashSet();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 =new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 =new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 =new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 =new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 =new Contacto("Juan", "Lopez", "123456789");

        System.out.println(c1.hashCode());
        System.out.println(c5.hashCode());
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);
        return hCSet;
    }


    public Set<Contacto> construirTreeSetContacto() {
        Set<Contacto> tCSet= new TreeSet<>((c1,c2)->{
            int comparacion= c1.getNombre().compareTo(c2.getNombre());
            if (comparacion !=0) return comparacion;
            int comparacionn= c1.getApellido().compareTo(c2.getApellido());
            return comparacionn;
        });
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        tCSet.add(new Contacto("Juan", "Lopez", "123456789"));

        return tCSet;
    }
}
