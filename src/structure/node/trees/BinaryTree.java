package structure.node.trees;

import structure.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    
    private int peso;

    //CONSTRUCTOR
    

    public Node<T> getRoot() {
        return root;
    }

    public BinaryTree() {
        this.root = null;
        this.peso = 0;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
    

    public void setRoot(T value){
        Node<T> node = new Node<T>(value);
        this.root = node;
    }


    public void add(T value){
        Node<T> node = new Node<T>(value);
        root = addRecursivo(root, node);
        peso++;
    }


    private Node<T> addRecursivo(Node<T> actual, Node <T> nodeInsertar){
        if(actual == null){
            return nodeInsertar;
        }
        if(actual.getValue().compareTo(nodeInsertar.getValue())>0 ){
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

    public void preOrderRecursivo(Node<T> actual) {
      if(actual == null)
        return;
    
        System.out.print(actual+ ",");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }
    public void posOrder(){
        posOrderRecursivo(root);
    }

    public void posOrderRecursivo(Node<T> actual) {
        if(actual == null)
            return;
    
        
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual+ ",");
    }

    public void inOrder(){
        inOrderRecursivo(root);
    }

    public void inOrderRecursivo(Node<T> actual) {
        if(actual == null)
            return;
    
        
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual+ ",");
        inOrderRecursivo(actual.getRight());
        
    }
    
    public int getHeight(){
        return getHeightRecursivo(root);

    }

    private int getHeightRecursivo(Node<T> actual) {
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
}
