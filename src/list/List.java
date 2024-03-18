
package list;

import client.Client;
import client.Rooms;

public class List {
    private NodeList head;
    private int size;
    
    public List(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertarInicio(Client client){
        NodeList newNodo = new NodeList(client);
        if(isEmpty()){
            head = newNodo;
 
        }else{
            newNodo.setNext(head);
            head = newNodo;
        }
        size ++;
    }
    
    public void insertarFinal(Client client){
        NodeList newNode = new NodeList(client);
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
    
    
    public String printClient(){
        NodeList currentNodo = head;
        String result = "";
        while(currentNodo != null){
            result += "Nombre y apellido: " + currentNodo.getClient().getName() + " " + currentNodo.getClient().getLastname()+ "\n";
            result += "Cédula: " + currentNodo.getClient().getCi() + "\n";
            result += "Email: " + currentNodo.getClient().getMail() + "\n";
            result += "Género: " + currentNodo.getClient().getGender() + "\n";
            result += "Salida " + currentNodo.getClient().getArriveDate() + "\n";
            result += "Num_habitacion: " + currentNodo.getClient().getRoomNum() + "\n"+"\n";
            
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
    
    public void printCi() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getClient().getCi());
            nodoActual = nodoActual.getNext();
        }
    }
    public void print() {
        NodeList nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.getRoomNum());
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
