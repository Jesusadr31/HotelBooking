
package hashtable;

import client.ClientStatus;
import hotelbookingproyect.Global;
import list.List;
import tree.Tree;

/**
 *
 * @author chris
 */
public class StatusHashTable {
    //List clients = Global.getList();
    //Tree roomNum = Global.getRoomNum();
    private ClientStatus [] clientTable;
    private int capacity;
    private List disponibles;
    
    
    public StatusHashTable(int capacity){
        this.capacity = capacity;
        clientTable = new ClientStatus[capacity];
    }
    
    /**
     * Metodo que retorna el indice el de hash
     * @param name
     * @param lastname
     * @return 
     */
    // Metodo para calcular el indice hash
    public int getHashIndex(String name, String lastname){
        // Suma los valores de ASCII de los caracteres del nombre y el apellido
        int characterSum = 0;
        for (char c : (name + lastname).toCharArray()){
            characterSum += (int) c;
        }
        //Devuelve el modulo de la suma de los caracteres con la capacidad de la tabla
        return characterSum % capacity;
    }

    //Metodo para agregar un cliente al registro
    public void addClientTable(String roomnum,String name,String lastname,String mail,String gender,String phoneNumber,String arrivalDate){
        int index = getHashIndex(name,lastname);
        clientTable[index]= new ClientStatus(roomnum,name,lastname,mail,gender,phoneNumber,arrivalDate);
    }
    
    // Método para buscar un cliente por nombre y apellido
    public ClientStatus searchClient(String name,String lastname){
        int index = getHashIndex(name,lastname);
        return clientTable[index];
    }
    
    public ClientStatus setRoom(String name,String lastname,String RoomNum){
        int index = getHashIndex(name,lastname);
        return clientTable[index];
    }
}
