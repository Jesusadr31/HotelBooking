
package hotelbookingproyect;

import hashtable.StatusHashTable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

import client.ClientHistory;
import client.ClientReservation;
import client.ClientStatus;
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
    List ListclientS = Global.getList();
    
    private String [] values_reser;
    private String [] values_status;
    private String [] values_history;
    private String [] values_rooms;
    
    private List clientHclass = new List();
    private List roomsclass = new List();
    
    
    private List numRooms = new List();
    
    private String filePathReservations = "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - reservas.csv";
    private String filePathStatus = "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - estado.csv";
    private String filePathHistory = "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - Historico.csv";
    private String filePathRooms= "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - habitaciones.csv";
    private String filePathRooms2= "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - habitaciones.csv";
    String line = "";
    int cont = 0;
    
    
    public void Read()throws FileNotFoundException, IOException{
        //Importar el archivo de reservas
        BufferedReader reser = new BufferedReader(new FileReader(filePathReservations));
        try{  
            while ((line = reser.readLine()) != null) {
                if (cont > 0) {
                    values_reser = line.split(",");
                    ClientReservation client = new ClientReservation(values_reser[0], values_reser[1], values_reser[2], values_reser[3], values_reser[4], values_reser[5], values_reser[6], values_reser[7], values_reser[8]);
                    reservations.addClientReservation(Ci(values_reser), client);
                }
                cont += 1;
            }
            cont=0;
            
            //Importar el archivo de estados    
            BufferedReader sta = new BufferedReader(new FileReader(filePathStatus));
            while ((line = sta.readLine()) != null) {
                if (cont > 0) {
                    values_status = line.split(",");
                    ListclientS.insertarFinalClientS(new ClientStatus(values_status[0], values_status[1], values_status[2], values_status[3], values_status[4], values_status[5], values_status[6]));
                    estados.addClientTable(values_status[0], values_status[1], values_status[2], values_status[3], values_status[4], values_status[5], values_status[6]);
                }
                cont += 1;
            }
            cont=0;
            
            //Importar el archivo de historicos   
            BufferedReader his = new BufferedReader(new FileReader(filePathHistory)); 
            while ((line = his.readLine()) != null) {
                if (cont > 0) {
                    values_history = line.split(",");
                    clientHclass.insertarFinalClientH(new ClientHistory(values_history[0], values_history[1], values_history[2], values_history[3], values_history[4], values_history[5], Integer.parseInt(values_history[6])));
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
                    roomsclass.insertarFinalRooms(new Rooms(Integer.parseInt(values_rooms[0]), values_rooms[1], values_rooms[2]));
                    rooms.addClientH(convertRoomNums(numRooms),clientHclass,roomsclass);
                    
                }
                cont += 1;
            }
            
            
            JOptionPane.showMessageDialog(null, "SE HA IMPORTADO");
        
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "NO SE PUDO IMPORTAR");
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
} 

