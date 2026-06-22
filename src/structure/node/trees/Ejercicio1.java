package structure.node.trees;



public class Ejercicio1 {

    //insertar cada numero
    public void insert(int[]numeros){
        BinaryTree<Integer> tree = new BinaryTree<>();
        for(int numero : numeros){
            tree.add(numero);
        }
        
        tree.prinTree();

    }
    //imprimir arbol


}

