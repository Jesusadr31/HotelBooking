
package hotelbookingproyect;

import hashtable.StatusHashTable;
import list.List;
import tree.Tree;

/**
 * Clase Global que almacena información global del sistema de reservas de hotel.
 * Incluye árboles para números de habitaciones y reservas, una tabla hash para el estado de los clientes,
 * y listas para habitaciones disponibles y reservadas.
 * 
 * Esta clase proporciona métodos estáticos para acceder y modificar estos datos desde cualquier parte del programa.
 * 
 * @author JEsus
 */
public class Global {
    private static Tree roomNum = new Tree();
    private static  Tree reservation = new Tree();
    private static  StatusHashTable status = new StatusHashTable(1000);
    private static List AvalaibleRoomNum = new List();
    private static List Rooms = new List();

    // Métodos getters y setters
    
    /**
     * Obtiene la lista de números de habitaciones disponibles.
     * 
     * @return La lista de números de habitaciones disponibles.
     */
    public static List getAvalaibleRoomNum() {
        return AvalaibleRoomNum;
    }

    /**
     * Obtiene la lista de todas las habitaciones.
     * 
     * @return La lista de todas las habitaciones.
     */
    public static List getRooms() {
        return Rooms;
    }

    
    /**
     * Establece la lista de números de habitaciones disponibles.
     * 
     * @param AvalaibleRoomNum La nueva lista de números de habitaciones disponibles.
     */
    public static void setAvalaibleRoomNum(List AvalaibleRoomNum) {
        Global.AvalaibleRoomNum = AvalaibleRoomNum;
    }

    
    /**
     * Establece la lista de todas las habitaciones.
     * 
     * @param Rooms La nueva lista de todas las habitaciones.
     */
    public static void setRooms(List Rooms) {
        Global.Rooms = Rooms;
    }    
    
    
    /**
     * Obtiene el árbol de números de habitaciones.
     * 
     * @return El árbol de números de habitaciones.
     */
    public static Tree getRoomNum() {
        return roomNum;
    }

    
    /**
     * Establece el árbol de números de habitaciones.
     * 
     * @param rooms El nuevo árbol de números de habitaciones.
     */
    public static void setRoomNum(Tree rooms) {
        Global.roomNum = rooms;
    }
    
    
    /**
     * Obtiene el árbol de reservas.
     * 
     * @return El árbol de reservas.
     */
    public static Tree getReservation(){
        return reservation;
    }

    
    /**
     * Obtiene la tabla hash para el estado de los clientes.
     * 
     * @return La tabla hash para el estado de los clientes.
     */
    public static StatusHashTable getStatus() {
        return status;
    }

    /**
     * Establece el árbol de reservas.
     * 
     * @param reservation El nuevo árbol de reservas.
     */
    public static void setReservation(Tree reservation) {
        Global.reservation = reservation;
    }

    
    /**
     * Establece la tabla hash para el estado de los clientes.
     * 
     * @param status La nueva tabla hash para el estado de los clientes.
     */
    public static void setStatus(StatusHashTable status) {
        Global.status = status;
    }    
}
