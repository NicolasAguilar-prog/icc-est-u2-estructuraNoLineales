package structure.node.trees;

import structure.node.Node;

public class Ejercicio2 {

    public void invertTree(Node<Integer>root){
        System.out.println("ORIGINAL");
        prinTree(root);
        invertTreeRecursivo(root);
        System.out.println("INVERTIDO");
        prinTree(root);
    }
    public void invertTreeRecursivo(Node<Integer> root) {

        if(root == null){
            return;
        }
        //INVERTIMOS
        Node<Integer> aux = root.getLeft();
        Node<Integer> der = root.getRight();
        root.setLeft(der);
        root.setRight(aux);
        //recursividad
        invertTreeRecursivo(root.getLeft());
        invertTreeRecursivo(root.getRight());

    }


    public void prinTree(Node<Integer> root){
        printTreeRecursivo(root, 0);
    }
    public void printTreeRecursivo(Node<Integer> actual, int nivel){
        if(actual == null)
            return;
        printTreeRecursivo(actual.getRight(),nivel+1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t"); 
        }
        System.out.println(actual);  
        printTreeRecursivo(actual.getLeft(),nivel+1);
          
    }
}
