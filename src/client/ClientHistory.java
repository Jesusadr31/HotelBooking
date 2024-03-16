
package client;

/**
 *
 * @author Jesús
 */
public class ClientHistory {
    private String ci;
    private String name;
    private String lastname;
    private String mail;
    private String gender;
    private String arriveDate;
    private int roomnum;
    
    public ClientHistory(String ci,String name,String lastname,String mail,String gender,String arriveDate,int roomnum){
        this.ci = ci;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.gender = gender;
        this.arriveDate = arriveDate;
        this.roomnum = roomnum;
    }
   
    
    public String showInfo() {
        String result = "";
        result += "Nombre y apellido: " + name + " " + lastname + "\n";
        result += "Cédula: " + ci + "\n";
        result += "Email: " + mail + "\n";
        result += "Género: " + gender + "\n";
        result += "Llegada: " + arriveDate + "\n";
        result += "Num_Hab: " + roomnum + "\n";
        return result;
    }

    public String getCi() {
        return ci;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMail() {
        return mail;
    }

    public String getGender() {
        return gender;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }
    
    
}
