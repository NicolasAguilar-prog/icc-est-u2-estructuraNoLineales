import models.Persona;
import structure.node.Node;
import structure.node.trees.BinaryTree;
import structure.node.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
    }


    private static void runBinaryTree() {
       BinaryTree<String> arbolString= new BinaryTree<>();
       BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
       arbolPersonas.add(new Persona("Pablo", 30));
       arbolPersonas.add(new Persona("Ana", 25));
       arbolPersonas.add(new Persona("Luis", 35));
       arbolPersonas.add(new Persona("Maria", 28));

    }


    private static void runIntTree(){
        IntTree arbolNumero= new IntTree();
        // Node<Integer> node1= new Node(50);
        // arbolNumero.setRoot(node1);
        // Node<Integer> node2= new Node(10);
        // Node<Integer> node3= new Node(30);
        // node1.setRight(node2);
        // node2.setLeft(node3);
        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);
        arbolNumero.add(60);
        arbolNumero.add(75);
        arbolNumero.add(55);

        System.out.println("PosOrder: ");
        arbolNumero.posOrder();
        System.out.println("");
        System.out.println("PreOrder: ");
        arbolNumero.preOrder();
        System.out.println("");
        System.out.println("InOrder: ");
        arbolNumero.inOrder();
        System.out.println("");
        System.out.println("Altura: ");
        System.out.println(arbolNumero.getHeight());
        System.out.println("Peso: ");
        System.out.println(arbolNumero.getWeight());
    }
}
