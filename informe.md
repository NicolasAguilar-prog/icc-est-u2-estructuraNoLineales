# Informe practica estructuras no Lineales

## CLASE 1
1. Creacion de arboles de numeros y de personas (17/06/2026)
```
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
```

crear un arbol de tipo entero y luego crear el metodo para poder agregar nodos y que se vaya creando un arbol en orden, menores a izquierda y mayores a derecha, todo esto con recursividad.