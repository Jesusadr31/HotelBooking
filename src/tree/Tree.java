
package tree;

import client.Client;
import client.Rooms;
import list.List;
import list.NodeList;

/**
 * Utiliza un árbol binario de búsqueda para guardar el historial de habitaciones.
 * Este árbol permite la inserción, búsqueda y eliminación de registros de clientes y habitaciones.
 * Los registros se organizan según el número de identificación del cliente o el número de habitación.
 * 
 * @author chris
 */
public class Tree {
    private NodeTree root;
    private int size;
    
    
    /**
     * Constructor de la clase Tree.
     * Inicializa la raíz del árbol como nula.
     */
    public Tree() {
        root = null;
    }
    
    
    /**
     * Verifica si el árbol está vacío.
     * @return true si el árbol está vacío, false de lo contrario.
     */
    public boolean isEmpty(){
        return root == null;
    }
    
    /**
     * Agrega un cliente a la lista de reservaciones del árbol.
     * @param ci El número de identificación del cliente.
     * @param client Información del cliente.
     */
    public void addClientReservation(int ci, Client client){
        root = insertReservation(root,ci,client);
        size++;
    }
    
    /**
     * Método privado recursivo para insertar un nodo en el árbol de reservaciones.
     * @param node El nodo actual.
     * @param ci El número de identificación del cliente.
     * @param client Información del cliente.
     * @return El nodo actualizado.
     */
    private NodeTree insertReservation(NodeTree node, int ci, Client client) {
        if (node == null) {
            return new NodeTree(ci,client);
        }if (ci < node.getNum()){
            node.setLeft(insertReservation(node.getLeft(),ci,client));
        }else if(ci > node.getNum()){
            node.setRight(insertReservation(node.getRight(),ci,client));
        }
        
        return node;
    }
    
    
    /**
     * Agrega un cliente junto con su historial de habitaciones al árbol.
     * @param numRooms Arreglo de números de habitación.
     * @param clienth Lista de historial de habitaciones del cliente.
     * @param rooms Lista de habitaciones.
     */
    public void addClientH(int[] numRooms,List clienth,List rooms){
        root = insertClient(numRooms,0,numRooms.length-1,clienth,rooms);
        size = numRooms.length;
    }
    
    
    /**
     * Método privado recursivo para insertar un cliente junto con su historial de habitaciones en el árbol.
     * @param numRooms Arreglo de números de habitación.
     * @param start Índice de inicio.
     * @param end Índice final.
     * @param clienth Lista de historial de habitaciones del cliente.
     * @param rooms Lista de habitaciones.
     * @return El nodo actualizado.
     */
    private NodeTree insertClient(int[] numRooms, int start, int end,List clienth,List rooms) {
        
        if (start > end) {
            return null;
        }
        // Obtener el elemento medio del arreglo y hacerlo raíz
        int middle = (start + end) / 2;
        
        NodeTree node = new NodeTree(numRooms[middle],ClientList(clienth,middle),objroom(rooms,middle));
       
        node.setLeft(insertClient(numRooms, start, middle - 1,clienth,rooms));
        node.setRight(insertClient(numRooms, middle + 1,end,clienth,rooms));
        
        return node;
        
    }

    
    /**
     * Busca un cliente por su número de identificación en el árbol de reservaciones.
     * @param ci El número de identificación del cliente a buscar.
     * @return La información del cliente si se encuentra, o null si no se encuentra.
     */
    public Client searchClients(int ci){
        return search(root,ci);
    }
    
    
    /**
     * Método privado recursivo para buscar un cliente por su número de identificación en el árbol de reservaciones.
     * @param node El nodo actual.
     * @param num El número de identificación del cliente a buscar.
     * @return La información del cliente si se encuentra, o null si no se encuentra.
     */
    private Client search(NodeTree node, int num){
        if(node == null || node.getNum() == num){
            return node != null ? node.getClientR() : null;
        }
        if(num < node.getNum()){
            return search(node.getLeft(),num);
        }else{
            return search(node.getRight(),num);
        }
    }
    

    /**
     * Busca el historial de habitaciones de un cliente por su número de habitación.
     * @param num El número de habitación a buscar.
     * @return La lista de historial de habitaciones si se encuentra, o null si no se encuentra.
     */
    public List searchClientsHistory(int num){
        return searchHistory(root,num);
    }
    
    
    /**
     * Método privado recursivo para buscar el historial de habitaciones de un cliente por su número de habitación.
     * @param node El nodo actual.
     * @param num El número de habitación a buscar.
     * @return La lista de historial de habitaciones
     */
    private List searchHistory(NodeTree node, int num){
        if(node == null || node.getNum() == num){
            return node != null ? node.getClientH() : null;
        }
        if(num < node.getNum()){
            return searchHistory(node.getLeft(),num);
        }else{
            return searchHistory(node.getRight(),num);
        }
    }
    
    
    /**
     * Busca información sobre una habitación por su número de habitación.
     * @param num El número de habitación a buscar.
     * @return La información de la habitación si se encuentra, o null si no se encuentra.
     */
    public Rooms searchRooms(int num){
        return searchRoom(root,num);
    }
    
    
    /**
     * Método privado recursivo para buscar información sobre una habitación por su número de habitación.
     * @param node El nodo actual.
     * @param num El número de habitación a buscar.
     * @return La información de la habitación si se encuentra, o null si no se encuentra.
     */
    private Rooms searchRoom(NodeTree node, int num){
        if(node == null || node.getNum() == num){
            return node != null ? node.getRooms() : null;
        }
        if(num < node.getNum()){
            return searchRoom(node.getLeft(),num);
        }else{
            return searchRoom(node.getRight(),num);
        }
    }
    
    
    /**
     * Realiza un recorrido inorder del árbol e imprime los números de identificación de los clientes en orden ascendente.
     */
    public void inorder() {
        inorderRec(root);
    }
    
    
    /**
     * Método privado recursivo para realizar un recorrido inorder del árbol e imprimir los números de identificación de los clientes en orden ascendente.
     * @param root El nodo raíz del subárbol.
     */
    private void inorderRec(NodeTree root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getNum() + " ");
            inorderRec(root.getRight());
        }
    }
    
    
    /**
     * Crea una lista de clientes asociados a un número de habitación específico.
     * @param clienth La lista de historial de habitaciones.
     * @param roomNum El número de habitación.
     * @return La lista de clientes asociados al número de habitación especificado.
     */
    public List ClientList(List clienth,int roomNum){
        List clientsroomNum = new List();
        NodeList currentNode = clienth.getHead();
        while(currentNode != null){
            if(Integer.parseInt(currentNode.getClient().getRoomNum()) == roomNum+1){
                clientsroomNum.insertarFinal(currentNode.getClient());
            }
            if(Integer.parseInt(currentNode.getClient().getRoomNum()) == roomNum+2){  
               return clientsroomNum;
            }
            currentNode = currentNode.getNext();
        }
        return clientsroomNum;
    }
    
    
    /**
     * Obtiene la información de una habitación por su número de habitación.
     * @param rooms La lista de habitaciones.
     * @param roomNum El número de habitación.
     * @return La información de la habitación si se encuentra, o null si no se encuentra.
     */
    public Rooms objroom(List rooms,int roomNum){
        NodeList currentNode = rooms.getHead();
        while(currentNode != null){
            if(currentNode.getRooms().getRoomNum() == roomNum+1)return currentNode.getRooms();  
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    
    
    /**
     * Elimina un nodo del árbol recursivamente.
     * @param num El número de identificación del cliente a eliminar.
     */
    public void delete(int num){
        root = deleteNode(root, num);
    }
    
    
    /**
     * Método privado recursivo para eliminar un nodo del árbol.
     * @param node El nodo actual.
     * @param num El número de identificación del cliente a eliminar.
     * @return El nodo actualizado.
     */
    private NodeTree deleteNode(NodeTree node, int num) {
        if (node == null) {
            return null; 
        }
        if (num < node.getNum()) {
            node.setLeft(deleteNode(node.getLeft(), num));
        } else if (num > node.getNum()) {
            node.setRight(deleteNode(node.getRight(), num));
        } else {
        
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            
            else if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
            // Caso 3: Nodo con dos hijos.
            else {
                node.setNum(foundMini(node.getRight()));  // O encontrarMaximo(nodo.izquierdo).
                node.setRight(deleteNode(node.getRight(), node.getNum()));
            }
        }
        return node;
    }

    
    /**
     * Encuentra el nodo con el número de identificación más pequeño en un subárbol.
     * @param node El nodo raíz del subárbol.
     * @return El número de identificación más pequeño.
     */
    private int foundMini(NodeTree nodo) {
        while (nodo.getLeft() != null) {
            nodo = nodo.getLeft();
        }
        return nodo.getNum();
    }
    
    
    /**
     * Obtiene el tamaño del árbol.
     * @return El tamaño del árbol.
     */
    public int getSize() {
        return size;
    }
    
}

