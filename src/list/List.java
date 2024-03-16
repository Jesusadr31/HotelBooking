/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            result += "Nombre y apellido: " + currentNodo.getClienth().getName() + " " + currentNodo.getClienth().getLastname()+ "\n";
            result += "Cédula: " + currentNodo.getClienth().getCi() + "\n";
            result += "Email: " + currentNodo.getClienth().getMail() + "\n";
            result += "Género: " + currentNodo.getClienth().getGender() + "\n";
            result += "Salida " + currentNodo.getClienth().getArriveDate() + "\n";
            result += "Num_habitacion: " + currentNodo.getClienth().getRoomnum() + "\n"+"\n";
            
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
            System.out.println(nodoActual.getClienth().getCi());
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
