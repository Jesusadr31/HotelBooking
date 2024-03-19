
package hotelbookingproyect;

import javax.swing.JOptionPane;
import windows.Menu;

/**
 *
 * @author Jesús
 */
public class HotelBookingProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadCsv doc = new ReadCsv();
        try{
        
            doc.Read();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo importar");
        }
        Menu vtna = new Menu();
        vtna.show();
    }
    
}
