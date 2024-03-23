package hashtable;

import java.util.Random;

import client.Client;
import client.Rooms;
import hotelbookingproyect.Global;

import list.List;
import list.NodeList;
import tree.Tree;

/**
 * Esta clase representa una tabla hash para gestionar el estado de los clientes en un hotel.
 * Permite agregar clientes, buscar clientes por nombre y apellido, realizar el check-out de un cliente,
 * asignar habitaciones, y gestionar la disponibilidad de habitaciones.
 * 
 * @author chris
 */
public class StatusHashTable {
    private Client [] clientTable;
    private int capacity;
    
    /**
     * Constructor para la clase StatusHashTable.
     * 
     * @param capacity La capacidad inicial de la tabla hash.
     */
    public StatusHashTable(int capacity){
        this.capacity = capacity;
        clientTable = new Client[capacity];
    }
    
    /**
     * Método que calcula el índice hash para un nombre y apellido dados.
     * 
     * @param name El nombre del cliente.
     * @param lastname El apellido del cliente.
     * @return El índice hash calculado.
     */
    public int getHashIndex(String name, String lastname){
        // Suma los valores de ASCII de los caracteres del nombre y el apellido
        int characterSum = 0;
        for (char c : (name + lastname).toCharArray()){
            characterSum += (int) c;
        }
        //Devuelve el modulo de la suma de los caracteres con la capacidad de la tabla
        return characterSum % capacity;
    }

    /**
     * Método para agregar un cliente a la tabla hash.
     * 
     * @param roomnum El número de habitación del cliente.
     * @param ci La cédula de identidad del cliente.
     * @param name El nombre del cliente.
     * @param lastname El apellido del cliente.
     * @param mail El correo electrónico del cliente.
     * @param gender El género del cliente.
     * @param RoomType El tipo de habitación reservada por el cliente.
     * @param phoneNumber El número de teléfono del cliente.
     * @param arrivalDate La fecha de llegada del cliente.
     * @param departureDate La fecha de salida del cliente.
     */
    public void addClientTable(String roomnum,String ci,String name,String lastname,String mail,String gender,String RoomType,String phoneNumber,String arrivalDate,String departureDate){
        int index = getHashIndex(name,lastname);
        while (clientTable[index] != null) {
            index = (index + 1) % capacity; // Sondeo lineal para resolver colisiones
        }
        clientTable[index]= new Client(roomnum,ci,name,lastname,mail,gender,RoomType,phoneNumber,arrivalDate,departureDate);
    }
    
    
    /**
     * Método para agregar un cliente rápidamente a la tabla hash.
     * 
     * @param client El cliente a agregar.
     */
    public void addClientFast(Client client){
        int index = getHashIndex(client.getName(),client.getLastname());
        while (clientTable[index] != null) {
            index = (index + 1) % capacity; // Sondeo lineal para resolver colisiones
        }
        clientTable[index]= client;
    }
    
    
    /**
     * Método para buscar clientes por nombre y apellido.
     * 
     * @param name El nombre del cliente a buscar.
     * @param lastname El apellido del cliente a buscar.
     * @return Una lista de clientes con el mismo nombre y apellido.
     */
    public List searchClient(String name,String lastname){
        List personsEquals = new List();
        int index = getHashIndex(name,lastname);
        int startIndex = index; 
        
        while (clientTable[index] != null) {
            if(clientTable[index].getName().equals(name) && clientTable[index].getLastname().equals(lastname)){
                personsEquals.insertarInicio(clientTable[index]);
            }
            index = (index + 1) % capacity; // Seguir buscando en caso de colisión
            
            if(index == startIndex){
                break;
            }
        }
        return personsEquals;
    }
    
    
    /**
     * Método para realizar el check-out de un cliente.
     * 
     * @param name El nombre del cliente a hacer check-out.
     * @param lastname El apellido del cliente a hacer check-out.
     * @param roomNum El número de habitación del cliente a hacer check-out.
     */
    public void CheckOut(String name,String lastname,String roomNum){
        int index = getHashIndex(name,lastname);
        while (clientTable[index] != null && !clientTable[index].getName().equals(name) && !clientTable[index].getLastname().equals(lastname) && !clientTable[index].getRoomNum().equals(roomNum)) {
            index = (index + 1) % capacity; // Seguir buscando en caso de colisión
        }
        clientTable[index]=null;
    }
    
    
    /**
     * Método para asignar una habitación a un cliente.
     * 
     * @param name El nombre del cliente.
     * @param lastname El apellido del cliente.
     * @param RoomNum El número de habitación a asignar.
     * @return El cliente con la habitación asignada.
     */
    public Client setRoom(String name,String lastname,String RoomNum){
        int index = getHashIndex(name,lastname);
        return clientTable[index];
    }
    
    
    
    /**
     * Método para realizar el check-in de un cliente, asignándole una habitación disponible.
     * 
     * @param clientR El cliente que desea hacer check-in.
     * @param RoomsAvailable Lista de habitaciones disponibles.
     * @param roomNum Árbol de habitaciones.
     * @param clientRTree Árbol de clientes.
     * @return El cliente con la habitación asignada.
     */
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
