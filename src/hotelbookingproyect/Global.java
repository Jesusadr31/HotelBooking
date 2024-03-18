
package hotelbookingproyect;

import hashtable.StatusHashTable;
import list.List;
import tree.Tree;

/**
 *
 * @author JEsus
 */
public class Global {
    private static Tree roomNum = new Tree();
    private static  Tree reservation = new Tree();
    private static  StatusHashTable status = new StatusHashTable(1000);
    private static List AvalaibleRoomNum = new List();
    private static List Rooms = new List();

    public static List getAvalaibleRoomNum() {
        return AvalaibleRoomNum;
    }

    public static List getRooms() {
        return Rooms;
    }

    public static void setAvalaibleRoomNum(List AvalaibleRoomNum) {
        Global.AvalaibleRoomNum = AvalaibleRoomNum;
    }

    public static void setRooms(List Rooms) {
        Global.Rooms = Rooms;
    }    
    
    public static Tree getRoomNum() {
        return roomNum;
    }

    public static void setRoomNum(Tree rooms) {
        Global.roomNum = rooms;
    }
    
    public static Tree getReservation(){
        return reservation;
    }

    public static StatusHashTable getStatus() {
        return status;
    }

    public static void setReservation(Tree reservation) {
        Global.reservation = reservation;
    }

    public static void setStatus(StatusHashTable status) {
        Global.status = status;
    }    
}
