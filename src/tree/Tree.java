
package tree;

import client.ClientReservation;
import client.Rooms;
import list.List;

/**
 *
 * @author chris
 */
public class Tree {
    private NodeTree root;
    private int size;
    
    
    public Tree() {
        root = null;
    }
    
    // Metodo para agregar un cliente al la lista de reservaciones
    public void addClientReservation(int ci, ClientR client){
        root = insertReservation(root,ci,client);
        size++;
    }
    
    //Metodo privado recursivo de insertar un nodo al arbol
    private NodeTree insertReservation(NodeTree node, int ci, ClientR client) {
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
       
        root = insertClientH(numRooms,0,numRooms.length-1,clienth,rooms);
        size++;
    }
    // Metodo para agregar un cliente en habitaciones agarrando un arreglo
    private NodeTree insertClientH(int[] numRooms, int start, int end,List clienth,List rooms) {
        
        if (start > end) {
            return null;
        }
        // Obtener el elemento medio del arreglo y hacerlo raíz
        int middle = (start + end) / 2;
        NodeTree node = new NodeTree(numRooms[middle],ClientList(clienth,middle),objroom(rooms,middle));
        // Insertar subarbol izquierdo
        node.setLeft(insertClientH(numRooms, start, middle - 1,clienth,rooms));
        // Insertar subarbol derecho
        node.setRight(insertClientH(numRooms, middle + 1,end,clienth,rooms));
        
        return node;
    }
    
    
    // Metodo para buscar clientes que se han hospedado en una habitacion
    public ClientReservation searchClients(int ci){
        return search(root,ci);
    }
    //Metodo privado recursivo de buscar un nodo en el arbol
    private ClientReservation search(NodeTree node, int num){
        if(node == null || node.getNum() == num){
            return node != null ? node.getClientReservation() : null;
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
            if(currentNode.getClienth().getRoomnum() == roomNum+1){
                clientsroomNum.insertarFinalClientH(currentNode.getClienth());
            }
            if(currentNode.getClienth().getRoomnum() == roomNum+2){  
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

    public int getSize() {
        return size;
    }
    
}
