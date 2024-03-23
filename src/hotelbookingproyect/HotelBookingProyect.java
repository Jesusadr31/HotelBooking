
package hotelbookingproyect;

import javax.swing.JOptionPane;
import windows.Menu;

/**
 * Clase principal que inicia la aplicación de reserva de hotel.
 * 
 * Esta clase carga los datos desde un archivo CSV al inicio de la aplicación
 * y luego muestra la ventana de menú principal.
 * 
 * @author Jesús
 */
public class HotelBookingProyect {

    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        ReadCsv doc = new ReadCsv(); // Objeto para leer datos desde un archivo CSV
        try{
        
            doc.Read(); // Lee los datos desde el archivo CSV
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }
        Menu vtna = new Menu(); // Crea una instancia de la ventana de menú principal
        vtna.show(); // Muestra la ventana de menú
    }
    
}
