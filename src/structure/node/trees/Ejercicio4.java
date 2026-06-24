package structure.node.trees;

import structure.node.Node;

public class Ejercicio4 {
    public int profundidadMax(Node<Integer> root){

        if(root == null){
            return 0;
        }

        int izquierda = profundidadMax(root.getLeft());
        int derecha = profundidadMax(root.getRight());

        return Math.max(izquierda, derecha) + 1;
    }
}
