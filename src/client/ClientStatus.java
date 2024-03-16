
package client;

/**
 *
 * @author jesus
 */
public class ClientStatus{
    
    private String roomnum;
    private String name;
    private String lastname;
    private String mail;
    private String gender;
    private String phoneNumber;    
    private String arriveDate;
   
    public ClientStatus(){
    
    }
    
    public ClientStatus(String roomnum,String name,String lastname,String mail,String gender,String phoneNumber,String arriveDate){
        this.roomnum = roomnum;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.arriveDate = arriveDate;
    }
    
    public String showInfo() {
        String result = "";
        result += "Numero Habitacion :" + roomnum + "\n";
        result += "Nombre y apellido: " + name + " " + lastname + "\n";
        result += "Email: " + mail + "\n";
        result += "Género: " + gender + "\n";
        result += "Telefono" + phoneNumber + "\n";
        result += "Llegada: " + arriveDate + "\n";
        return result;
    }


    public String getMail() {
        return mail;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }
    
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }
    
    
}