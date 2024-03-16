
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
    private static List list = new List();

    public static List getList() {
        return list;
    }

    public static void setList(List list) {
        Global.list = list;
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
