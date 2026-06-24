package structure.node.trees;

import structure.node.Node;

public class Ejercicio3 {

    public void imprimirNiveles(Node<Integer> root){

        int altura = profundidadMax(root);

        for(int nivel = 1; nivel <= altura; nivel++){

            imprimirNivel(root, nivel);

            System.out.println();
        }
    }

    private void imprimirNivel(Node<Integer> root, int nivel){

        if(root == null){
            return;
        }

        if(nivel == 1){
            System.out.print(root.getValue() + " ");
        }
        else{
            imprimirNivel(root.getLeft(), nivel - 1);
            imprimirNivel(root.getRight(), nivel - 1);
        }
    }

    private int profundidadMax(Node<Integer> root){

        if(root == null){
            return 0;
        }

        int izquierda = profundidadMax(root.getLeft());
        int derecha = profundidadMax(root.getRight());

        return Math.max(izquierda, derecha) + 1;
    }
}