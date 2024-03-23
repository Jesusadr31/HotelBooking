
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
 * Clase encargada de leer datos desde archivos CSV y cargarlos en las estructuras de datos correspondientes.
 * 
 * Esta clase importa datos de reservas, estados, históricos y habitaciones desde archivos CSV y los carga en las
 * estructuras de datos globales del sistema.
 * 
 * Además, esta clase identifica las habitaciones disponibles y las almacena en una lista.
 * 
 * @author chris
 */
public class ReadCsv {
    // Declaración de estructuras de datos globales
    Tree reservations = Global.getReservation();
    StatusHashTable estados = Global.getStatus();
    Tree rooms = Global.getRoomNum();
    
    List Rooms = Global.getRooms();
    
    // Arreglos para almacenar temporalmente los datos leídos de los archivos CSV
    private String [] values_reser;
    private String [] values_status;
    private String [] values_history;
    private String [] values_rooms;
    
    // Listas para almacenar temporalmente los datos de los clientes y números de habitación
    private List ListclientS = new List();
    private List clientHclass = new List();
    private int [] clientSroomNum;
    
    private List numRooms = new List();
    
    // Rutas de los archivos CSV
    private String filePathReservations = "..\\..\\..\\Booking_hotel - reservas.csv";
    private String filePathStatus = "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - estado.csv";
    private String filePathHistory = "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - Historico.csv";
    private String filePathRooms= "C:\\Users\\chris\\OneDrive\\Escritorio\\BorradorHotelBooking\\Booking_hotel - habitaciones.csv";
    
    String line = ""; // Variable para almacenar cada línea leída de los archivos
    int cont = 0; // Contador para controlar el proceso de lectura
    
    
    /**
     * Método para leer los datos desde los archivos CSV y cargarlos en las estructuras de datos.
     * 
     * @throws FileNotFoundException Si no se encuentra alguno de los archivos CSV.
     * @throws IOException Si ocurre algún error de lectura de los archivos.
     */
    public void Read()throws FileNotFoundException, IOException{
        //Importar el archivo de reservas
        BufferedReader reser = new BufferedReader(new FileReader(filePathReservations));
        try{  
            while ((line = reser.readLine()) != null) {
                if (cont > 0) {
                    values_reser = line.split(",");
                    
                    // Agrega la reserva al árbol de reservas
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
                    
                    // Inserta el cliente en la lista de clientes y agrega su estado a la tabla hash
                    ListclientS.insertarFinal(new Client(values_status[0],"",values_status[1], values_status[2],values_status[3], values_status[4],"", values_status[5], values_status[6],""));
                    if(!values_status[0].equals("")){
                        estados.addClientTable(values_status[0],"",values_status[1], values_status[2],values_status[3], values_status[4],"", values_status[5], values_status[6],"");
                    }
                }
                cont += 1;
            }
            cont=0;
            
            
            // Obtiene los números de habitación ocupados por los clientes y los almacena en un arreglo
            clientSroomNum = roomNumAvailable(ListclientS);
            
            // Obtiene los números de habitación disponibles
            Global.setAvalaibleRoomNum(AvalaibleRoomNum(clientSroomNum));
            
            
            
            //Importar el archivo de historicos   
            BufferedReader his = new BufferedReader(new FileReader(filePathHistory)); 
            while ((line = his.readLine()) != null) {
                if (cont > 0) {
                    values_history = line.split(",");
                    
                    // Inserta el cliente en la lista de históricos
                    clientHclass.insertarFinal(new Client(values_history[6],values_history[0], values_history[1], values_history[2], values_history[3],"","", values_history[4], values_history[5], ""));
                }
                cont += 1;
            }
            cont=0;
            
            
            // Importar el archivo de habitaciones y guardar los números de habitación en una lista
            BufferedReader ro = new BufferedReader(new FileReader(filePathRooms)); 
            while ((line = ro.readLine()) != null) {
                if (cont > 0) {
                    values_rooms = line.split(",");
                    numRooms.insertarFinalRoomsNum(Integer.parseInt(values_rooms[0]));
                    Rooms.insertarFinalRooms(new Rooms(Integer.parseInt(values_rooms[0]), values_rooms[1], values_rooms[2]));
                }
                cont += 1;
            }
            cont = 0;
            
            // Agrega los datos de las habitaciones al árbol de habitaciones
            rooms.addClientH(convertRoomNums(numRooms),clientHclass,Rooms);
        
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }  
     
    }
    
    
    /**
     * Método para convertir una cadena de números de cédula separados por puntos en un número entero.
     * 
     * @param values El arreglo de cadenas de números de cédula.
     * @return El número de cédula como un entero.
     */
    public int Ci(String[] values){
        String Str = "";
        String [] client_id = values[0].split("\\.");
        
        for(int i = 0;i < client_id.length;i++){
            Str += client_id[i];
        }
        return Integer.parseInt(Str);  
    }

    
    /**
    * Método para convertir una lista de números de habitación en un arreglo de enteros.
    * 
    * @param listNums La lista de números de habitación.
    * @return Un arreglo de enteros que representa los números de habitación.
    */
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
    
    
    /**
    * Método para obtener los números de habitación ocupados por los clientes.
    * 
    * @param listclientS La lista de clientes.
    * @return Un arreglo de enteros que representa los números de habitación ocupados.
    */
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

    
    
    /**
    * Método para encontrar y almacenar los números de habitación disponibles.
    * 
    * @param busyRooms Los números de habitación ocupados.
    * @return Una lista de números de habitación disponibles.
    */
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

   