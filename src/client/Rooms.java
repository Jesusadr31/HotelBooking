
package client;

/**
 *
 * @author chris
 */
public class Rooms {
   private int roomNum;
   private String roomType;
   private String floor;
   
   public Rooms(int roomNum,String roomType,String floor){
       this.roomNum = roomNum;
       this.roomType = roomType;
       this.floor = floor;
   }
   
   public Rooms(){
   
   }

    public int getRoomNum() {
        return roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getFloor() {
        return floor;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
   
}
