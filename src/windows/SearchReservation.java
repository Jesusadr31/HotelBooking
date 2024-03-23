
package windows;

import hotelbookingproyect.Global;
import javax.swing.JOptionPane;
import tree.Tree;

/**
 * Ventana para buscar reservaciones por número de cédula de identidad.
 * Permite al usuario buscar una reservación por su número de cédula de identidad y ver los detalles de la reservación.
 * 
 * @author Jesús
 */
public class SearchReservation extends javax.swing.JFrame {
    Tree reser = Global.getReservation();
    
    
    /**
     * Constructor de la clase SearchReservation.
     * Inicializa los componentes de la interfaz gráfica, centra la ventana y desactiva la capacidad de redimensionamiento.
     */
    public SearchReservation() {
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
        txtCIReservation = new javax.swing.JTextField();
        btnSearchReservation = new javax.swing.JButton();
        btnBackMain = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReservation = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 13)); // NOI18N
        jLabel1.setText("Búsqueda de Reservaciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 290, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Conoce los datos de una Reservación");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 360, 40));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Ingresa el número de cédula del cliente");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 400, 40));
        jPanel2.add(txtCIReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 30));

        btnSearchReservation.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchReservation.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        btnSearchReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchReservation.setText("Buscar");
        btnSearchReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchReservationActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearchReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 120, 30));

        btnBackMain.setBackground(new java.awt.Color(0, 153, 153));
        btnBackMain.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        btnBackMain.setForeground(new java.awt.Color(255, 255, 255));
        btnBackMain.setText("Regresar al menú");
        btnBackMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMainActionPerformed(evt);
            }
        });
        jPanel2.add(btnBackMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 210, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 450));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaReservation.setColumns(20);
        txtAreaReservation.setRows(5);
        jScrollPane1.setViewportView(txtAreaReservation);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 310, 320));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos de la Reserva");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 230, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Acción realizada al presionar el botón para regresar al menú principal.
     * Cierra la ventana actual y muestra la ventana del menú principal.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnBackMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMainActionPerformed
        Menu vtna = new Menu();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnBackMainActionPerformed

    
    /**
     * Acción realizada al presionar el botón para buscar una reservación.
     * Busca una reservación por número de cédula de identidad y muestra los detalles de la reservación si existe.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnSearchReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchReservationActionPerformed
        int ci = Integer.parseInt(txtCIReservation.getText());
        try{
            
            
            txtAreaReservation.setText(reser.searchClients(ci).showReservation());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Valor introducido inválido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchReservationActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * Crea y muestra la ventana de búsqueda de reservaciones.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en esta aplicación).
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
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMain;
    private javax.swing.JButton btnSearchReservation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaReservation;
    private javax.swing.JTextField txtCIReservation;
    // End of variables declaration//GEN-END:variables
}
