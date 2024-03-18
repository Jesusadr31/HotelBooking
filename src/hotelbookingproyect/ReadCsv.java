
package hotelbookingproyect;

import hashtable.StatusHashTable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

import client.Client;
import client.Rooms;
import list.List;
import list.NodeList;
import tree.Tree;

/**
 *
 * @author chris
 */
public class ReadCsv {
    Tree reservations = Global.getReservation();
    StatusHashTable estados = Global.getStatus();
    Tree rooms = Global.getRoomNum();
    
    List Rooms = Global.getRooms();
    
    
    private String [] values_reser;
    private String [] values_status;
    private String [] values_history;
    private String [] values_rooms;
    
    private List ListclientS = new List();
    private List clientHclass = new List();
    private int [] clientSroomNum;
    
    
    private List numRooms = new List();
    
    private String filePathReservations = "C:\\Users\\Jesús\\OneDrive\\Escritorio\\HotelBookingProyect\\Booking_hotel - reservas.csv";
    private String filePathStatus = "C:\\Users\\Jesús\\OneDrive\\Escritorio\\HotelBookingProyect\\Booking_hotel - estado.csv";
    private String filePathHistory = "C:\\Users\\Jesús\\OneDrive\\Escritorio\\HotelBookingProyect\\Booking_hotel - Historico.csv";
    private String filePathRooms= "C:\\Users\\Jesús\\OneDrive\\Escritorio\\HotelBookingProyect\\Booking_hotel - habitaciones.csv";
    private String filePathRooms2= "C:\\Users\\Jesús\\OneDrive\\Escritorio\\HotelBookingProyect\\Booking_hotel - habitaciones.csv";
    String line = "";
    int cont = 0;
    
    
    public void Read()throws FileNotFoundException, IOException{
        //Importar el archivo de reservas
        BufferedReader reser = new BufferedReader(new FileReader(filePathReservations));
        try{  
            while ((line = reser.readLine()) != null) {
                if (cont > 0) {
                    values_reser = line.split(",");
                    
                    reservations.addClientReservation(Ci(values_reser), new Client("",values_reser[0], values_reser[1], values_reser[2], values_reser[3], values_reser[4], values_reser[5], values_reser[6], values_reser[7], values_reser[8]));
                    
                }
                cont += 1;
            }
            cont=0;
            
            //Importar el archivo de estados    
            BufferedReader sta = new BufferedReader(new FileReader(filePathStatus));
            while ((line = sta.readLine()) != null) {
                if (cont > 0) {
                    values_status = line.split(",");
                    ListclientS.insertarFinal(new Client(values_status[0],"",values_status[1], values_status[2],values_status[3], values_status[4],"", values_status[5], values_status[6],""));
                    if(!values_status[0].equals("")){
                        estados.addClientTable(values_status[0],"",values_status[1], values_status[2],values_status[3], values_status[4],"", values_status[5], values_status[6],"");
                    }
                }
                cont += 1;
            }
            cont=0;
            
            clientSroomNum = roomNumAvailable(ListclientS);
            Global.setAvalaibleRoomNum(AvalaibleRoomNum(clientSroomNum));
            
            
            
            //Importar el archivo de historicos   
            BufferedReader his = new BufferedReader(new FileReader(filePathHistory)); 
            while ((line = his.readLine()) != null) {
                if (cont > 0) {
                    values_history = line.split(",");
                    clientHclass.insertarFinal(new Client(values_history[6],values_history[0], values_history[1], values_history[2], values_history[3],"","", values_history[4], values_history[5], ""));
                }
                cont += 1;
            }
            cont=0;
            
            
            //Importar el archivo de habitaciones (Guardando numero de habitaciones en un array)
            BufferedReader ro = new BufferedReader(new FileReader(filePathRooms)); 
            //Guardando los numeros de habitaion en un array
            while ((line = ro.readLine()) != null) {
                if (cont > 0) {
                    values_rooms = line.split(",");
                    numRooms.insertarFinalRoomsNum(Integer.parseInt(values_rooms[0]));
                }
                cont += 1;
            }
            cont = 0;
            
            BufferedReader ro2 = new BufferedReader(new FileReader(filePathRooms2)); 
            //Creando el arbol de habitaciones
            while ((line = ro2.readLine()) != null) {
                if (cont > 0) {
                    values_rooms = line.split(",");
                    Rooms.insertarFinalRooms(new Rooms(Integer.parseInt(values_rooms[0]), values_rooms[1], values_rooms[2]));
                    rooms.addClientH(convertRoomNums(numRooms),clientHclass,Rooms);
                    
                }
                cont += 1;
            }
            
            
            //JOptionPane.showMessageDialog(null, "SE HA IMPORTADO");
        
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }  
     
    }
    public int Ci(String[] values){
        String Str = "";
        String [] client_id = values[0].split("\\.");
        
        for(int i = 0;i < client_id.length;i++){
            Str += client_id[i];
        }
        return Integer.parseInt(Str);  
    }

    public int [] convertRoomNums(List listNums){
        int tamaño = listNums.getSize();
        int[] array = new int[tamaño];
        NodeList currentNode = listNums.getHead();
        int i = 0;
        while (currentNode != null) {
            array[i] = currentNode.getRoomNum();
            currentNode = currentNode.getNext();
            i++;
        }
        return array;
    }
    
    public int [] roomNumAvailable(List listclientS){
        int tamaño = listclientS.getSize();
        int[] array = new int[tamaño];
        NodeList currentNode = listclientS.getHead();
        int i = 0;
        while (currentNode != null) {
            if(!currentNode.getClient().getRoomNum().equals("")){
                array[i] = Integer.parseInt(currentNode.getClient().getRoomNum());
            } 
            currentNode = currentNode.getNext();
            i++;
        }
        return array;
    }

    public List AvalaibleRoomNum(int[] busyRooms) {
        List list = new List();
        // Encuentra el valor máximo y mínimo
        int min = busyRooms[0];
        int max = busyRooms[0];
        for (int i = 1; i < busyRooms.length; i++) {
            if (busyRooms[i] < min) min = busyRooms[i];
            if (busyRooms[i] > max) max = busyRooms[i];
        }

        // Crea un arreglo booleano para marcar los números presentes
        boolean[] marcados = new boolean[max - min + 1];

        // Marca los números presentes
        for (int num : busyRooms) {
            marcados[num - min] = true;
        }
        // Identifica y muestra los números faltantes
        for (int i = 0; i < marcados.length; i++) {
            if (!marcados[i]) {
                list.insertarFinalRoomsNum(i + min);
            }
        }
        return list;
    }
} 

   