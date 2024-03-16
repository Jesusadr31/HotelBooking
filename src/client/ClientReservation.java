
package client;

/**
 *
 * @author chris
 */
public class ClientReservation {
    private String ci;
    private String name;
    private String lastname;
    private String mail;
    private String gender;
    private String roomType;
    private String phoneNumber;
    private String arriveDate;
    private String departureDate;
    
    public ClientReservation(String ci,String name,String lastname,String mail,String gender,String roomType,String phoneNumber,String arriveDate,String departureDate){
        this.ci = ci;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.gender = gender;
        this.roomType= roomType;
        this.phoneNumber = phoneNumber;
        this.arriveDate = arriveDate;
        this.departureDate = departureDate;
    }
   
    
    public String showInfo() {
        String result = "";
        result += "Nombre y apellido: " + name + " " + lastname + "\n";
        result += "Cédula: " + ci + "\n";
        result += "Email: " + mail + "\n";
        result += "Género: " + gender + "\n";
        result += "Tipo de habitación: " + roomType + "\n";
        result += "Telefono" + phoneNumber + "\n";
        result += "Llegada: " + arriveDate + "\n";
        result += "Salida: " + departureDate + "\n";
        return result;
    }

    public String getCi() {
        return ci;
    }

    public String getMail() {
        return mail;
    }

    public String getGender() {
        return gender;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
    
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}
