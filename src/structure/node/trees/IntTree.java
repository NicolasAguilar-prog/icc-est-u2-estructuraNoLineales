package structure.node.trees;

import structure.node.Node;

//CLASE DE ARBOL SOLO DE ENTEROS
public class IntTree {

    private Node<Integer> root;
    private int peso;

    //CONSTRUCTOR
    public IntTree() {
        this.root = null;
        this.peso = 0;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }
    

    public void setRoot(int value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }
    public void add(int value){
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
        peso++;
    }
    private Node<Integer> addRecursivo(Node<Integer> actual, Node <Integer> nodeInsertar){
        if(actual == null){
            return nodeInsertar;
        }
        if(actual.getValue()> nodeInsertar.getValue()){
            //izq
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else{
            //der
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void preOrder(){
        preOrderRecursivo(root);
    }

    public void preOrderRecursivo(Node<Integer> actual) {
      if(actual == null)
        return;
    
        System.out.print(actual+ ",");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }
    public void posOrder(){
        posOrderRecursivo(root);
    }

    public void posOrderRecursivo(Node<Integer> actual) {
        if(actual == null)
            return;
    
        
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual+ ",");
    }

    public void inOrder(){
        inOrderRecursivo(root);
    }

    public void inOrderRecursivo(Node<Integer> actual) {
        if(actual == null)
            return;
    
        
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual+ ",");
        inOrderRecursivo(actual.getRight());
        
    }
    
    public int getHeight(){
        return getHeightRecursivo(root);

    }

    private int getHeightRecursivo(Node<Integer> actual) {
        if(actual == null)
            return 0;

        int heightLeft= getHeightRecursivo(actual.getLeft());
        int heightRight= getHeightRecursivo(actual.getRight());
        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto+1;
    }

    public int getWeight(){
        return peso;

    }

    // public int getWeightRecursivo(Node<Integer> actual) {
    //         if(actual == null)
    //             return 0;

    //         int weightLeft= getWeightRecursivo(actual.getLeft());
    //         int weightRight= getWeightRecursivo(actual.getRight());
    //         int peso= weightLeft+weightRight;
    //         return peso+1;
    // }
    



    
}
