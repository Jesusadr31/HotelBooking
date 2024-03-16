
package tree;

import client.ClientReservation;
import client.Rooms;
import list.List;

/**
 *
 * @author chris
 */
public class NodeTree {
    private int num;
    private ClientReservation clientR;
    private List clientH = new List();
    private Rooms rooms;
    private NodeTree left,right;
    
    public NodeTree(int id,ClientReservation client){
        this.num = id;
        this.clientR = client;
        this.left = this.right = null;
    }
    
    public NodeTree(int roomnum,List clienth,Rooms rooms){
        this.num = roomnum;
        this.rooms = rooms;
        this.clientH = clienth;
        this.left = this.right = null;
    }

    public List getClientH() {
        return clientH;
    }

    public void setClientH(List clientH) {
        this.clientH = clientH;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int id) {
        this.num = id;
    }

    public void setClientReservation(ClientReservation client) {
        this.clientR = client;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
     
    public ClientReservation getClientReservation() {
        return clientR;
    }
    
    public NodeTree getLeft() {
        return left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }
    
}
