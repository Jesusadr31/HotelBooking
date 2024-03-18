package windows;

import client.Client;
import hashtable.StatusHashTable;
import hotelbookingproyect.Global;
import javax.swing.JOptionPane;
import list.List;
import tree.Tree;

/**
 *
 * @author Jesús
 */
public class CheckOut extends javax.swing.JFrame {
    List RoomsAvailable = Global.getAvalaibleRoomNum();
    List Rooms = Global.getRooms();
    Tree roomNum = Global.getRoomNum();
    StatusHashTable table = Global.getStatus();
    
    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        txtNameClientCheckout = new javax.swing.JTextField();
        btnBackMain = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check-Out");
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 13)); // NOI18N
        jLabel1.setText("Check-out");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 40));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("para finalizar su estadía.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 440, 20));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Nombre del Cliente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, 30));

        txtNameClientCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameClientCheckoutActionPerformed(evt);
            }
        });
        jPanel2.add(txtNameClientCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 290, 30));

        btnBackMain.setBackground(new java.awt.Color(0, 153, 153));
        btnBackMain.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        btnBackMain.setForeground(new java.awt.Color(255, 255, 255));
        btnBackMain.setText("Regresar al Menú");
        btnBackMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMainActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 220, 40));

        btnCheckOut.setBackground(new java.awt.Color(0, 153, 153));
        btnCheckOut.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("CheckOut");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 30));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresa el nombre y apellido del cliente ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 460, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameClientCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameClientCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameClientCheckoutActionPerformed

    private void btnBackMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMainActionPerformed
        Menu vtna = new Menu();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnBackMainActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        String name,lastname;
         
        
         
        try{
            name = txtNameClientCheckout.getText();
            lastname = txtLastNameClientCheckout.getText();
            Client person = table.searchClient(name, lastname);
            
            roomNum.searchClientsHistory(Integer.parseInt(person.getRoomNum())).insertarFinal(person);
            
            table.deletClient(name, lastname);
            
            JOptionPane.showMessageDialog(null, "Se ha realizado el Checkout de manera exitosa.\nEl cliente "+ name + " ha finalizado su estadía en el hotel."
            , "Estadía finalizada", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error, valor inválido");
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMain;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNameClientCheckout;
    // End of variables declaration//GEN-END:variables
}
