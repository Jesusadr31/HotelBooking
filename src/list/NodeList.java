
package list;

import client.ClientHistory;
import client.ClientStatus;
import client.Rooms;

/**
 *
 * @author Jesus
 */
public class NodeList {
    private ClientHistory clienth;
    private Rooms rooms;
    private ClientStatus clients;
    private int roomNum;
    private NodeList next;
    
    public NodeList(ClientHistory clienth){
        this.clienth = clienth;
        this.next = null;
    }
   
    
    public NodeList(Rooms rooms){
        this.rooms = rooms;
        this.next = null;
    }
    
    public NodeList(ClientStatus clients){
        this.clients = clients;
        this.next = null;
    }
    
    public NodeList(int roomNum){
        this.roomNum = roomNum;
        this.next = null;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    
    
    public ClientHistory getClienth() {
        return clienth;
    }

    public NodeList getNext() {
        return next;
    }

    public void setClienth(ClientHistory clienth) {
        this.clienth = clienth;
    }

    public void setNext(NodeList next) {
        this.next = next;
    }


    public Rooms getRooms() {
        return rooms;
    }


    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public ClientStatus getClients() {
        return clients;
    }
    
}
