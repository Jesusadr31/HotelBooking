
package client;

/**
 * Esta clase representa a un cliente de un hotel.
 * Contiene información sobre el cliente y métodos para mostrar diferentes detalles.
 * 
 * @author chris
 */
public class Client {
    private String roomNum;
    private String ci;
    private String name;
    private String lastname;
    private String mail;
    private String gender;
    private String roomType;
    private String phoneNumber;
    private String arriveDate;
    private String departureDate;
    
    
    /**
     * Constructor para la clase Client.
     * 
     * @param roomNum Número de habitación del cliente.
     * @param ci Cédula de identidad del cliente.
     * @param name Nombre del cliente.
     * @param lastname Apellido del cliente.
     * @param mail Correo electrónico del cliente.
     * @param gender Género del cliente.
     * @param roomType Tipo de habitación reservada por el cliente.
     * @param phoneNumber Número de teléfono del cliente.
     * @param arriveDate Fecha de llegada del cliente.
     * @param departureDate Fecha de salida del cliente.
     */
    public Client(String roomNum,String ci,String name,String lastname,String mail,String gender,String roomType,String phoneNumber,String arriveDate,String departureDate){
        this.roomNum = roomNum;
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
    
    
    /**
     * Muestra el historial del cliente.
     * 
     * @return Una cadena que contiene información del historial del cliente.
     */
    public String showHistory() {
        String result = "";
        result += "Nombre y apellido: " + name + " " + lastname + "\n";
        result += "Cédula: " + ci + "\n";
        result += "Email: " + mail + "\n";
        result += "Género: " + gender + "\n";
        result += "Llegada: " + arriveDate + "\n";
        result += "Num_Hab: " + roomNum + "\n";
        return result;
    }
    
    /**
     * Muestra la reserva del cliente.
     * 
     * @return Una cadena que contiene información de la reserva del cliente.
     */
    public String showReservation() {
        String result = "";
        result += "Cédula: " + ci + "\n";
        result += "Nombre y apellido: " + name + " " + lastname + "\n";
        result += "Email: " + mail + "\n";
        result += "Género: " + gender + "\n";
        result += "Tipo de habitación: " + roomType + "\n";
        result += "Telefono: " + phoneNumber + "\n";
        result += "Llegada: " + arriveDate + "\n";
        result += "Salida: " + departureDate + "\n";
        return result;
    }
    
    /**
     * Muestra el estado actual del cliente.
     * 
     * @return Una cadena que contiene información del estado actual del cliente.
     */
    public String showStatus() {
        String result = "";
        result += "Numero Habitacion: " + roomNum + "\n";
        result += "Nombre y apellido: " + name + " " + lastname + "\n";
        result += "Email: " + mail + "\n";
        result += "Género: " + gender + "\n";
        result += "Telefono: " + phoneNumber + "\n";
        result += "Llegada: " + arriveDate + "\n";
        return result;
    }
    
    // Métodos getters y setters
    
    /**
     * Obtiene el número de habitación del cliente.
     * 
     * @return El número de habitación del cliente.
     */
    public String getRoomNum() {
        return roomNum;
    }

    
    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getCi() {
        return ci;
    }

    
    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getName() {
        return name;
    }

    
    /**
     * Obtiene el apellido del cliente.
     * 
     * @return El apellido del cliente.
     */
    public String getLastname() {
        return lastname;
    }

    
    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getMail() {
        return mail;
    }

    
    /**
     * Obtiene el género del cliente.
     * 
     * @return El género del cliente.
     */
    public String getGender() {
        return gender;
    }

    
    /**
     * Obtiene el tipo de habitación reservada por el cliente.
     * 
     * @return El tipo de habitación reservada por el cliente.
     */
    public String getRoomType() {
        return roomType;
    }

    
    
    /**
     * Obtiene el número de teléfono del cliente.
     * 
     * @return El número de teléfono del cliente.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    
    /**
     * Obtiene la fecha de llegada del cliente.
     * 
     * @return La fecha de llegada del cliente.
     */
    public String getArriveDate() {
        return arriveDate;
    }

    
    
    /**
     * Obtiene la fecha de salida del cliente.
     * 
     * @return La fecha de salida del cliente.
     */
    public String getDepartureDate() {
        return departureDate;
    }

    
    
    /**
     * Establece el número de habitación del cliente.
     * 
     * @param roomNum El nuevo número de habitación del cliente.
     */
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    
    
    /**
     * Establece la cédula de identidad del cliente.
     * 
     * @param ci La nueva cédula de identidad del cliente.
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    
    /**
     * Establece el nombre del cliente.
     * 
     * @param name El nuevo nombre del cliente.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * Establece el apellido del cliente.
     * 
     * @param lastname El nuevo apellido del cliente.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    /**
     * Establece el correo electrónico del cliente.
     * 
     * @param mail El nuevo correo electrónico del cliente.
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    
    /**
     * Establece el género del cliente.
     * 
     * @param gender El nuevo género del cliente.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    /**
     * Establece el tipo de habitación reservada por el cliente.
     * 
     * @param roomType El nuevo tipo de habitación reservada por el cliente.
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    
    /**
     * Establece el número de teléfono del cliente.
     * 
     * @param phoneNumber El nuevo número de teléfono del cliente.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    /**
     * Establece la fecha de llegada del cliente.
     * 
     * @param arriveDate La nueva fecha de llegada del cliente.
     */
    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    
    /**
     * Establece la fecha de salida del cliente.
     * 
     * @param departureDate La nueva fecha de salida del cliente.
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }    
}
   

