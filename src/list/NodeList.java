
package list;

import client.Client;
import client.Rooms;

/**
 *
 * @author Jesus
 */
public class NodeList {
    private Rooms rooms;
    private Client client;
    private int roomNum;
    private NodeList next;
    
    public NodeList(Client client){
        this.client = client;
        this.next = null;
    }
   
    
    public NodeList(Rooms rooms){
        this.rooms = rooms;
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
    
    
    public void setNext(NodeList next) {
        this.next = next;
    }


    public Rooms getRooms() {
        return rooms;
    }


    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public Client getClient() {
        return client;
    }

    public NodeList getNext() {
        return next;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
