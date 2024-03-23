
package list;

import client.Client;
import client.Rooms;

/**
 * Nodo de una lista enlazada simple que puede contener objetos de tipo Client, 
 * Rooms o un número de habitación.
 *
 * @author Jesus
 */
public class NodeList {
    private Rooms rooms; // Habitación asociada al nodo
    private Client client; // Cliente asociado al nodo
    private int roomNum; // Número de habitación asociado al nodo
    private NodeList next; // Referencia al siguiente nodo en la lista
    
    
    /**
     * Constructor para crear un nodo con un objeto Client.
     * 
     * @param client El cliente asociado al nodo.
     */
    public NodeList(Client client){
        this.client = client;
        this.next = null;
    }
   
    /**
     * Constructor para crear un nodo con un objeto Rooms.
     * 
     * @param rooms La habitación asociada al nodo.
     */
    public NodeList(Rooms rooms){
        this.rooms = rooms;
        this.next = null;
    }
    
    
    /**
     * Constructor para crear un nodo con un número de habitación.
     * 
     * @param roomNum El número de habitación asociado al nodo.
     */
    public NodeList(int roomNum){
        this.roomNum = roomNum;
        this.next = null;
    }

    
    // Métodos getters y setters
    
    /**
     * Obtiene el número de habitación asociado al nodo.
     * 
     * @return El número de habitación asociado al nodo.
     */
    public int getRoomNum() {
        return roomNum;
    }

    
    /**
     * Establece el número de habitación asociado al nodo.
     * 
     * @param roomNum El nuevo número de habitación asociado al nodo.
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    
    
    /**
     * Establece el siguiente nodo en la lista.
     * 
     * @param next El siguiente nodo en la lista.
     */
    public void setNext(NodeList next) {
        this.next = next;
    }

    
    /**
     * Obtiene la habitación asociada al nodo.
     * 
     * @return La habitación asociada al nodo.
     */
    public Rooms getRooms() {
        return rooms;
    }

    
    /**
     * Establece la habitación asociada al nodo.
     * 
     * @param rooms La nueva habitación asociada al nodo.
     */
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    
    /**
     * Obtiene el cliente asociado al nodo.
     * 
     * @return El cliente asociado al nodo.
     */
    public Client getClient() {
        return client;
    }

    
    /**
     * Obtiene el siguiente nodo en la lista.
     * 
     * @return El siguiente nodo en la lista.
     */
    public NodeList getNext() {
        return next;
    }

    
    /**
     * Establece el cliente asociado al nodo.
     * 
     * @param client El nuevo cliente asociado al nodo.
     */
    public void setClient(Client client) {
        this.client = client;
    }
}
