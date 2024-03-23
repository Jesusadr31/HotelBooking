
package tree;

import client.Client;
import client.Rooms;
import list.List;


/**
 * Nodo para un árbol, que puede contener información sobre un cliente, 
 * una habitación o una lista de clientes.
 * 
 * Este nodo se puede usar para construir árboles que almacenen información 
 * sobre clientes, habitaciones u otras entidades.
 *
 * @author chris
 */
public class NodeTree {
    private int num; // Identificador numérico del nodo
    private Client clientR; // Cliente asociado al nodo (si corresponde)
    private List clientH = new List(); // Lista de clientes asociados al nodo (si corresponde)
    private Rooms rooms; // Habitación asociada al nodo (si corresponde)
    private NodeTree left, right; // Referencias al hijo izquierdo y al hijo derecho del nodo
    
    
    /**
     * Constructor para crear un nodo con un identificador y un cliente asociado.
     * 
     * @param id El identificador numérico del nodo.
     * @param client El cliente asociado al nodo.
     */
    public NodeTree(int id,Client client){
        this.num = id;
        this.clientR = client;
        this.left = this.right = null;
    }
    
    /**
     * Constructor para crear un nodo con un número de habitación, una lista de clientes y una habitación asociados.
     * 
     * @param roomnum El número de habitación asociado al nodo.
     * @param clienth La lista de clientes asociada al nodo.
     * @param rooms La habitación asociada al nodo.
     */
    public NodeTree(int roomnum,List clienth,Rooms rooms){
        this.num = roomnum;
        this.rooms = rooms;
        this.clientH = clienth;
        this.left = this.right = null;
    }

    
    // Métodos getters y setters

    /**
     * Obtiene la lista de clientes asociada al nodo.
     * 
     * @return La lista de clientes asociada al nodo.
     */
    public List getClientH() {
        return clientH;
    }

    
    /**
     * Establece la lista de clientes asociada al nodo.
     * 
     * @param clientH La lista de clientes a establecer.
     */
    public void setClientH(List clientH) {
        this.clientH = clientH;
    }

    
    /**
     * Obtiene el identificador numérico del nodo.
     * 
     * @return El identificador numérico del nodo.
     */
    public int getNum() {
        return num;
    }

    /**
     * Establece el identificador numérico del nodo.
     * 
     * @param id El identificador numérico a establecer.
     */
    public void setNum(int id) {
        this.num = id;
    }

    
    /**
     * Establece el cliente asociado al nodo.
     * 
     * @param client El cliente a establecer.
     */
    public void setClientR(Client client) {
        this.clientR = client;
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
     * @param rooms La habitación a establecer.
     */
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
     
    
    /**
     * Obtiene el cliente asociado al nodo.
     * 
     * @return El cliente asociado al nodo.
     */
    public Client getClientR() {
        return clientR;
    }
    
    
    /**
     * Obtiene el hijo izquierdo del nodo.
     * 
     * @return El hijo izquierdo del nodo.
     */
    public NodeTree getLeft() {
        return left;
    }

    
    /**
     * Obtiene el hijo derecho del nodo.
     * 
     * @return El hijo derecho del nodo.
     */
    public NodeTree getRight() {
        return right;
    }

    
    /**
     * Establece el hijo izquierdo del nodo.
     * 
     * @param left El nodo que se establecerá como hijo izquierdo.
     */
    public void setLeft(NodeTree left) {
        this.left = left;
    }

    
    /**
     * Establece el hijo derecho del nodo.
     * 
     * @param right El nodo que se establecerá como hijo derecho.
     */
    public void setRight(NodeTree right) {
        this.right = right;
    }
    
}
