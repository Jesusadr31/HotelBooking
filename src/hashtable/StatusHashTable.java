package hashtable;

import java.util.Random;

import client.Client;
import client.Rooms;
import hotelbookingproyect.Global;

import list.List;
import list.NodeList;
import tree.Tree;

/**
 *
 * @author chris
 */
public class StatusHashTable {
    private Client [] clientTable;
    private int capacity;
    
    
    public StatusHashTable(int capacity){
        this.capacity = capacity;
        clientTable = new Client[capacity];
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
    public void addClientTable(String roomnum,String ci,String name,String lastname,String mail,String gender,String RoomType,String phoneNumber,String arrivalDate,String departureDate){
        int index = getHashIndex(name,lastname);
        while (clientTable[index] != null) {
            index = (index + 1) % capacity; // Sondeo lineal para resolver colisiones
        }
        clientTable[index]= new Client(roomnum,ci,name,lastname,mail,gender,RoomType,phoneNumber,arrivalDate,departureDate);
    }
    
    public void addClientFast(Client client){
        int index = getHashIndex(client.getName(),client.getLastname());
        while (clientTable[index] != null) {
            index = (index + 1) % capacity; // Sondeo lineal para resolver colisiones
        }
        clientTable[index]= client;
    }
    
    // Método para buscar un cliente por nombre y apellido
    public Client searchClient(String name,String lastname){
        int index = getHashIndex(name,lastname);
        while (clientTable[index] != null && !clientTable[index].getName().equals(name) && !clientTable[index].getLastname().equals(lastname)) {
            index = (index + 1) % capacity; // Seguir buscando en caso de colisión
        }
        return clientTable[index];
    }
    
    // Método para buscar un cliente por nombre y apellido
    public void deletClient(String name,String lastname){
        int index = getHashIndex(name,lastname);
        while (clientTable[index] != null && !clientTable[index].getName().equals(name) && !clientTable[index].getLastname().equals(lastname)) {
            index = (index + 1) % capacity; // Seguir buscando en caso de colisión
        }
        clientTable[index]=null;
    }
    
    public Client setRoom(String name,String lastname,String RoomNum){
        int index = getHashIndex(name,lastname);
        return clientTable[index];
    }
    
    //Le asignamos una habitacion adecuada a su tipo de habitacion
    public Client CheckIn(Client clientR,List RoomsAvailable,Tree roomNum,Tree clientRTree){
        String typeRoom = clientR.getRoomType();
        int cont=0;
        while(cont < roomNum.getSize()) {           
            Random random = new Random();
            int randomNum = random.nextInt(0,roomNum.getSize());
            
            Rooms roo = roomNum.searchRooms(randomNum);
            NodeList currentNode = RoomsAvailable.getHead();
            while(currentNode!=null){
                if(roo.getRoomType().equals(typeRoom) && currentNode.getRoomNum() == roo.getRoomNum()){
                    clientR.setRoomNum(Integer.toString(randomNum)); 
                    return clientR;            
                }
                currentNode = currentNode.getNext();
            }
            cont++;
        }
        return clientR;
    }
}   
