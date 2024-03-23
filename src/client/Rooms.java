
package client;

/**
 * Esta clase representa una habitación en un hotel.
 * Contiene información sobre el número de habitación, el tipo de habitación y el piso.
 * 
 * @author chris
 */
public class Rooms {
   private int roomNum;
   private String roomType;
   private String floor;
   
   
   /**
     * Constructor para la clase Rooms.
     * 
     * @param roomNum Número de la habitación.
     * @param roomType Tipo de habitación.
     * @param floor Piso donde se encuentra la habitación.
     */
   public Rooms(int roomNum,String roomType,String floor){
       this.roomNum = roomNum;
       this.roomType = roomType;
       this.floor = floor;
   }
   
   // Métodos getters y setters
   
   /**
     * Obtiene el número de habitación.
     * 
     * @return El número de la habitación.
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * Obtiene el tipo de habitación.
     * 
     * @return El tipo de habitación.
     */
    public String getRoomType() {
        return roomType;
    }

    
    /**
     * Obtiene el piso donde se encuentra la habitación.
     * 
     * @return El piso donde se encuentra la habitación.
     */
    public String getFloor() {
        return floor;
    }

    
    /**
     * Establece el número de habitación.
     * 
     * @param roomNum El nuevo número de habitación.
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    
    /**
     * Establece el tipo de habitación.
     * 
     * @param roomType El nuevo tipo de habitación.
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    
    /**
     * Establece el piso donde se encuentra la habitación.
     * 
     * @param floor El nuevo piso donde se encuentra la habitación.
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }
   
}
