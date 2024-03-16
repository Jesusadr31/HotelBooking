
package list;

import client.ClientHistory;
import client.ClientStatus;
import client.Rooms;

/**
 *
 * @author Jesus
 */
public class List {
    private NodeList head;
    private int size;
    
    public List(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertarInicio(ClientHistory clienth){
        NodeList newNodo = new NodeList(clienth);
        if(isEmpty()){
            head = newNodo;
 
        }else{
            newNodo.setNext(head);
            head = newNodo;
        }
        size ++;
    }
    
    public void insertarFinalClientH(ClientHistory clienth){
        NodeList newNode = new NodeList(clienth);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    public void insertarFinalClientS(ClientStatus clienth){
        NodeList newNode = new NodeList(clienth);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    
    public void insertarFinalRooms(Rooms rooms){
        NodeList newNode = new NodeList(rooms);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    public void insertarFinalRoomsNum(int roomNum){
        NodeList newNode = new NodeList(roomNum);
        if(isEmpty()){
            head = newNode;
        }
        else{
            NodeList currentNodo = head;
            while(currentNodo.getNext() != null){
                currentNodo = currentNodo.getNext();
            }
            currentNodo.setNext(newNode);
        }
        size++;
    }
    
    
    public String printClientH(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Nombre y apellido: " + currentNodo.getClientHistory().getName() + " " + currentNodo.getClientHistory().getLastname()+ "\n";
            result += "Cédula: " + currentNodo.getClientHistory().getCi() + "\n";
            result += "Email: " + currentNodo.getClientHistory().getMail() + "\n";
            result += "Género: " + currentNodo.getClientHistory().getGender() + "\n";
            result += "Salida " + currentNodo.getClientHistory().getArriveDate() + "\n";
            result += "Num_habitacion: " + currentNodo.getClientHistory().getRoomnum() + "\n"+"\n";
            
            currentNodo = currentNodo.getNext();
            
        }return result;
    }
    
    public String printRooms(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Numero de Habitacion:" + currentNodo.getRooms().getRoomNum() + "\n";
            result += "Tipo de habitacion: " + currentNodo.getRooms().getRoomType() + "\n";
            result += "Piso:" + currentNodo.getRooms().getFloor() + "\n"+"\n";

            currentNodo = currentNodo.getNext();
            
        }return result;
    }
    
    public void print() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getClientHistory().getCi());
            nodoActual = nodoActual.getNext();
        }
    }

    public NodeList getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void setHead(NodeList head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
