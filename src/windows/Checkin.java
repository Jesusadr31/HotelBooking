
package windows;

import client.Client;
import hashtable.StatusHashTable;
import hotelbookingproyect.Global;
import javax.swing.JOptionPane;
import list.List;
import tree.Tree;

/**
 * Ventana de Check-In para registrar la entrada de un cliente.
 * Permite asignar una habitación disponible a un cliente previamente registrado en una reserva.
 * Después de realizar el check-in, se actualizan las estructuras de datos globales.
 * Se implementa la interfaz gráfica utilizando Java Swing.
 * 
 * @author Jesús
 */
public class Checkin extends javax.swing.JFrame {
   List RoomsAvailable = Global.getAvalaibleRoomNum(); // Lista de habitaciones disponibles
    List Rooms = Global.getRooms(); // Lista de todas las habitaciones
    Tree roomNum = Global.getRoomNum(); // Árbol binario de búsqueda para gestionar el historial de habitaciones
    Tree reser = Global.getReservation(); // Árbol binario de búsqueda para gestionar las reservas
    StatusHashTable table = Global.getStatus(); // Tabla de hash para gestionar el estado de las habitaciones
    
    /**
     * Constructor de la clase Checkin.
     * Inicializa los componentes de la interfaz gráfica.
     */
    public Checkin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCIClientCheckin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBackMain = new javax.swing.JButton();
        btnAssignment = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCheckin = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check-in");
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 13)); // NOI18N
        jLabel1.setText("Check-in");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ingresa la cédula del cliente y el número de ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 20));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Habitación que se le asignará.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 350, 30));
        jPanel2.add(txtCIClientCheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 30));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Cédula del Cliente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 30));

        btnBackMain.setBackground(new java.awt.Color(0, 153, 153));
        btnBackMain.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        btnBackMain.setForeground(new java.awt.Color(255, 255, 255));
        btnBackMain.setText("Regresar al menú");
        btnBackMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMainActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 200, 40));

        btnAssignment.setBackground(new java.awt.Color(0, 153, 153));
        btnAssignment.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        btnAssignment.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignment.setText("Asignar");
        btnAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignmentActionPerformed(evt);
            }
        });
        jPanel2.add(btnAssignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 370));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaCheckin.setColumns(20);
        txtAreaCheckin.setRows(5);
        jScrollPane1.setViewportView(txtAreaCheckin);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 280));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 280, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Acción realizada al presionar el botón "Regresar al Menú".
     * Regresa al menú principal de la aplicación.
     * @param evt Evento que desencadena la acción.
     */
    private void btnBackMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMainActionPerformed
        Menu vtna = new Menu();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnBackMainActionPerformed

    
    /**
     * Acción realizada al presionar el botón "Asignación".
     * Realiza el check-in de un cliente, asignándole una habitación disponible.
     * Actualiza las estructuras de datos globales después del check-in.
     * @param evt Evento que desencadena la acción.
     */
    private void btnAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignmentActionPerformed
        String name,lastname;
        
        try{
            if(txtCIClientCheckin.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Porfavor introduzca un nombre y apellido");
            }
            int id = Integer.parseInt(txtCIClientCheckin.getText());
            name = reser.searchClients(id).getName();
            lastname =reser.searchClients(id).getLastname();
            
            table.addClientFast(table.CheckIn(reser.searchClients(id),RoomsAvailable,roomNum,reser));
            reser.delete(id);
            
           txtAreaCheckin.setText(table.searchClient(name, lastname).printClientStatus());
           
           JOptionPane.showMessageDialog(null, "Se ha realizado el Check-in exitosamente al cliente " + name + " " + lastname
            , "CheckIn Realizado", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error, valor inválido");
        }
    }//GEN-LAST:event_btnAssignmentActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignment;
    private javax.swing.JButton btnBackMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaCheckin;
    private javax.swing.JTextField txtCIClientCheckin;
    // End of variables declaration//GEN-END:variables
}
