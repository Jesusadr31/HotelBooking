
package list;

import client.Client;
import client.Rooms;


/**
 * Una lista enlazada simple para almacenar objetos de tipo Client y Rooms.
 */
public class List {
    private NodeList head; // El primer nodo de la lista
    private int size; // El tamaño de la lista
    
    
    /**
     * Constructor para crear una lista vacía.
     */
    public List(){
        head = null;
    }
    
    
    /**
     * Verifica si la lista está vacía.
     * 
     * @return true si la lista está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
        return head == null;
    }
    
    
    /**
     * Inserta un cliente al principio de la lista.
     * 
     * @param client El cliente a insertar.
     */
    public void insertarInicio(Client client){
        NodeList newNodo = new NodeList(client);
        if(isEmpty()){
            head = newNodo;
 
        }else{
            newNodo.setNext(head);
            head = newNodo;
        }
        size ++;
    }
    
    
    /**
     * Inserta un cliente al final de la lista.
     * 
     * @param client El cliente a insertar.
     */
    public void insertarFinal(Client client){
        NodeList newNode = new NodeList(client);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    /**
     * Inserta una habitación al final de la lista.
     * 
     * @param rooms La habitación a insertar.
     */
    public void insertarFinalRooms(Rooms rooms){
        NodeList newNode = new NodeList(rooms);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    /**
     * Inserta un número de habitación al final de la lista.
     * 
     * @param roomNum El número de habitación a insertar.
     */
    public void insertarFinalRoomsNum(int roomNum){
        NodeList newNode = new NodeList(roomNum);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    /**
     * Imprime los datos de los clientes en la lista.
     * 
     * @return Una cadena que contiene los datos de los clientes.
     */
    public String printClient(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Nombre y apellido: " + currentNodo.getClient().getName() + " " + currentNodo.getClient().getLastname()+ "\n";
            result += "Cédula: " + currentNodo.getClient().getCi() + "\n";
            result += "Email: " + currentNodo.getClient().getMail() + "\n";
            result += "Género: " + currentNodo.getClient().getGender() + "\n";
            result += "Salida " + currentNodo.getClient().getArriveDate() + "\n";
            result += "Num_habitacion: " + currentNodo.getClient().getRoomNum() + "\n"+"\n";
            
            currentNodo = currentNodo.getNext();
            
        }return result;
    }
    
    
    /**
     * Imprime los datos de los clientes con su estado.
     * 
     * @return Una cadena que contiene los datos de los clientes con su estado.
     */
    public String printClientStatus(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Numero de Habitacion:" + currentNodo.getClient().getRoomNum() + "\n";
            result += "Nombre y apellido: " + currentNodo.getClient().getName() + " " + currentNodo.getClient().getLastname()+ "\n";
            result += "Email: " + currentNodo.getClient().getMail() + "\n";
            result += "Género: " + currentNodo.getClient().getGender() + "\n";
            result += "Celular: " + currentNodo.getClient().getPhoneNumber() + "\n";
            result += "Salida " + currentNodo.getClient().getArriveDate() + "\n";
            
            
            currentNodo = currentNodo.getNext();
            
        }return result;
    }
    
    
    /**
     * Imprime los datos de las habitaciones en la lista.
     * 
     * @return Una cadena que contiene los datos de las habitaciones.
     */
    public String printRooms(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Numero de Habitacion:" + currentNodo.getRooms().getRoomNum() + "\n";
            result += "Tipo de habitacion: " + currentNodo.getRooms().getRoomType() + "\n";
            result += "Piso:" + currentNodo.getRooms().getFloor() + "\n"+"\n";

            currentNodo = currentNodo.getNext();
            
        }return result;
    }
    
    
    /**
     * Imprime las cédulas de los clientes en la lista.
     */
    public void printCi() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getClient().getCi());
            nodoActual = nodoActual.getNext();
        }
    }
    
    /**
     * Imprime los números de habitación en la lista.
     */
    public void print() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getRoomNum());
            nodoActual = nodoActual.getNext();
        }
    }

    
    // Métodos getters y setters
    
    /**
     * Devuelve el primer nodo de la lista.
     * 
     * @return El primer nodo de la lista.
     */
    public NodeList getHead() {
        return head;
    }

    
    /**
     * Devuelve el tamaño de la lista.
     * 
     * @return El tamaño de la lista.
     */
    public int getSize() {
        return size;
    }

    
    /**
     * Establece el primer nodo de la lista.
     * 
     * @param head El nuevo primer nodo de la lista.
     */
    public void setHead(NodeList head) {
        this.head = head;
    }

    
    /**
     * Establece el tamaño de la lista.
     * 
     * @param size El nuevo tamaño de la lista.
     */
    public void setSize(int size) {
        this.size = size;
    }

}
