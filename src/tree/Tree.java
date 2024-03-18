
package tree;

import client.Client;
import client.Rooms;
import list.List;
import list.NodeList;

/**
 *
 * @author chris
 */
//Utilizando un Arbol Binario de Busqueda para guardar el historial de habitaciones
public class Tree {
    private NodeTree root;
    private int size;
    
    
    public Tree() {
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    // Metodo para agregar un cliente al la lista de reservaciones
    public void addClientReservation(int ci, Client client){
        root = insertReservation(root,ci,client);
        size++;
    }
    
    //Metodo privado recursivo de insertar un nodo al arbol
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
    
    //Falta agregar las habitaciones
    public void addClientH(int[] numRooms,List clienth,List rooms){
        root = insertClient(numRooms,0,numRooms.length-1,clienth,rooms);
        size++;
    }
    // Metodo para agregar un cliente en habitaciones agarrando un arreglo
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

    
    // Metodo para buscar clientes que se han hospedado en una habitacion
    public Client searchClients(int ci){
        return search(root,ci);
    }
    //Metodo privado recursivo de buscar un nodo en el arbol
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
    
    // Metodo para buscar clientes que se han hospedado en una habitacion
    public List searchClientsHistory(int num){
        return searchHistory(root,num);
    }
    //Metodo privado recursivo de buscar un nodo en el arbol
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
    
    public Rooms searchRooms(int num){
        return searchRoom(root,num);
    }
    //Metodo privado recursivo de buscar un nodo en el arbol
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
    
    public void inorder() {
        inorderRec(root);
    }
    
    private void inorderRec(NodeTree root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getNum() + " ");
            inorderRec(root.getRight());
        }
    }
    
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
    
    public Rooms objroom(List rooms,int roomNum){
        NodeList currentNode = rooms.getHead();
        while(currentNode != null){
            if(currentNode.getRooms().getRoomNum() == roomNum+1)return currentNode.getRooms();  
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    //Eliminar un nodo del arbol recursivamente
    public void delete(int num){
        root = deleteNode(root, num);
    }
    
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

    private int foundMini(NodeTree nodo) {
        while (nodo.getLeft() != null) {
            nodo = nodo.getLeft();
        }
        return nodo.getNum();
    }
    public int getSize() {
        return size;
    }
    
}

