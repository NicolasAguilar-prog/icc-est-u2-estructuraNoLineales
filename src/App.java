import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import evaluacion.PersonaController;
import evaluacion.Personaa;
import models.Contacto;
import models.Persona;
import structure.node.Node;
import structure.node.trees.BinaryTree;
import structure.node.trees.Ejercicio1;
import structure.node.trees.Ejercicio2;
import structure.node.trees.Ejercicio3;
import structure.node.trees.Ejercicio4;


public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runBinaryTree();
        // runEjercicios();
        // runSets();
        runEvaluacion();
    }

    private static void runEvaluacion(){

        //EJERCICIO 1
        List<Personaa> lista = new ArrayList<>();
        lista.add(new Personaa("Nicolas", 18));
        lista.add(new Personaa("Nicolas", 18));
        lista.add(new Personaa("Juan", 17));
        lista.add(new Personaa("Carlos", 20));
        lista.add(new Personaa("Ricardo", 25));
        PersonaController pers= new PersonaController();
        System.out.println(pers.filtrarYOrdenar(lista, 18));

        //EJERCICIO 2
        List<Personaa> lisst = new ArrayList<>();
        lisst.add(new Personaa("Nicolas Aguilar", 28));
        lisst.add(new Personaa("Nicolas Aguirre", 38));
        lisst.add(new Personaa("Juan Medina", 77));
        lisst.add(new Personaa("Carlos Tello", 60));
        lisst.add(new Personaa("Ricardo Uzhca", 25));
        PersonaController perso= new PersonaController();
        System.out.println(perso.agruparPorEdad(lisst));

    }



    private static void runSets() {
        Sets sets = new Sets();

        //Implementacion -> HashSet hashcode
        System.out.println("* HashCode");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size= "+ hashSet.size());
        System.out.println(hashSet.contains("F"));

        //Implementacion -> LinkedHashSet hashcode
        System.out.println("* HashCode");
        Set<String> linkedHashSet = sets.construirLinkedHashSet();
        System.out.println(linkedHashSet);
        System.out.println("Size= "+ linkedHashSet.size());
        System.out.println(linkedHashSet.contains("F"));

        //Implementacion -> TreeSet hashcode
        System.out.println("* HashCode");
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Size= "+ treeSet.size());
        System.out.println(treeSet.contains("F"));

        //EJ
        System.out.println("* HashCode");
        Set<Contacto> hCSet = sets.construirHashSetCOntacto();
        System.out.println(hCSet);
        System.out.println("Size= "+ hCSet.size());


        //Implementacion -> TreeContactoSet hashcode
        System.out.println("* HashCode");
        Set<Contacto> cTreeSet = sets.construirTreeSetContacto();
        System.out.println(cTreeSet);
        System.out.println("Size= "+ cTreeSet.size());
        

        System.out.println("MAP");
        Maps m = new Maps();
        m.contruirMap();
        m.cTreeMap();
    }

    private static void runEjercicios(){
        //ejercicio 1
        System.out.println("EJERCICIO 1: ");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[]numeros =new int[] {5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);

        //ejercicio 2
        System.out.println("EJERCICIO 2");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = new int[]{5,3,7,2,4,6,8};
        BinaryTree<Integer> tree2 = new BinaryTree<>();
        for(int numero : numeros2){
            tree2.add(numero);
        }
        Node<Integer> root = tree2.getRoot();
        ejercicio2.invertTree(root);

        //Ejercicio 3
        System.out.println("EJERCICIO 3");
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.imprimirNiveles(tree2.getRoot());

        //ejercicio 4
        System.out.println("EJERCICIO 4");
        Ejercicio4 ejercicio4 = new Ejercicio4();

        System.out.println("PROFUNDIDAD MAXIMA:");
        System.out.println(ejercicio4.profundidadMax(tree2.getRoot()));
    }

    // private static void runBinaryTree() {
    //    BinaryTree<String> arbolString= new BinaryTree<>();
    //    BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
    //    arbolPersonas.add(new Persona("Pablo", 30));
    //    arbolPersonas.add(new Persona("Ana", 25));
    //    arbolPersonas.add(new Persona("Luis", 35));
    //    arbolPersonas.add(new Persona("Maria", 28));

    // }


    // private static void runIntTree(){
    //     IntTree arbolNumero= new IntTree();
    //     // Node<Integer> node1= new Node(50);
    //     // arbolNumero.setRoot(node1);
    //     // Node<Integer> node2= new Node(10);
    //     // Node<Integer> node3= new Node(30);
    //     // node1.setRight(node2);
    //     // node2.setLeft(node3);
    //     arbolNumero.add(50);
    //     arbolNumero.add(10);
    //     arbolNumero.add(30);
    //     arbolNumero.add(60);
    //     arbolNumero.add(75);
    //     arbolNumero.add(55);

    //     System.out.println("PosOrder: ");
    //     arbolNumero.posOrder();
    //     System.out.println("");
    //     System.out.println("PreOrder: ");
    //     arbolNumero.preOrder();
    //     System.out.println("");
    //     System.out.println("InOrder: ");
    //     arbolNumero.inOrder();
    //     System.out.println("");
    //     System.out.println("Altura: ");
    //     System.out.println(arbolNumero.getHeight());
    //     System.out.println("Peso: ");
    //     System.out.println(arbolNumero.getWeight());
    // }
}
