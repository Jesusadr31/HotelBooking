
package windows;

import hotelbookingproyect.ReadCsv;
import javax.swing.JOptionPane;

/**
 * Ventana de menú principal que permite acceder a diferentes funcionalidades del sistema.
 * Desde esta ventana, el usuario puede acceder a la búsqueda de reservaciones, check-out,
 * búsqueda de clientes, historial de habitaciones y check-in.
 * 
 * @author Jesús
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Constructor de la clase Menu.
     * Inicializa los componentes de la interfaz gráfica, centra la ventana y desactiva la capacidad de redimensionamiento.
     */
    public Menu() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSearchClientMain = new javax.swing.JButton();
        btnSearchReservationMain = new javax.swing.JButton();
        btnHistoryRoomMain = new javax.swing.JButton();
        btnCheckinMain = new javax.swing.JButton();
        btnCheckoutMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(760, 558));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 13)); // NOI18N
        jLabel2.setText("Programa Hotel Booking");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ADMINISTRAR RESERVACIONES DE TODOS LOS CLIENTES A HOSPEDAR.");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, 32));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("BIENVENIDO AL SISTEMA DE HOTEL BOOKING QUE LE PERIMITIRÁ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 538, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagen3.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 538, 339));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 490));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchClientMain.setBackground(new java.awt.Color(0, 255, 255));
        btnSearchClientMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchClientMain.setForeground(new java.awt.Color(0, 102, 102));
        btnSearchClientMain.setText("Buscar clientes");
        btnSearchClientMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchClientMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientMainActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearchClientMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 177, 39));

        btnSearchReservationMain.setBackground(new java.awt.Color(0, 255, 255));
        btnSearchReservationMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchReservationMain.setForeground(new java.awt.Color(0, 102, 102));
        btnSearchReservationMain.setText("Busqueda Reservación");
        btnSearchReservationMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchReservationMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchReservationMainActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearchReservationMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 177, 37));

        btnHistoryRoomMain.setBackground(new java.awt.Color(0, 255, 255));
        btnHistoryRoomMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHistoryRoomMain.setForeground(new java.awt.Color(0, 102, 102));
        btnHistoryRoomMain.setText("Historial de Habitaciones");
        btnHistoryRoomMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistoryRoomMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryRoomMainActionPerformed(evt);
            }
        });
        jPanel4.add(btnHistoryRoomMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 177, 34));

        btnCheckinMain.setBackground(new java.awt.Color(0, 255, 255));
        btnCheckinMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckinMain.setForeground(new java.awt.Color(0, 102, 102));
        btnCheckinMain.setText("Check-in");
        btnCheckinMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckinMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckinMainActionPerformed(evt);
            }
        });
        jPanel4.add(btnCheckinMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 177, 38));

        btnCheckoutMain.setBackground(new java.awt.Color(0, 255, 255));
        btnCheckoutMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckoutMain.setForeground(new java.awt.Color(0, 102, 102));
        btnCheckoutMain.setText("Check-out");
        btnCheckoutMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckoutMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutMainActionPerformed(evt);
            }
        });
        jPanel4.add(btnCheckoutMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 176, 36));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 40, 230, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Acción realizada al presionar el botón para buscar reservaciones.
     * Cierra la ventana actual y muestra la ventana de búsqueda de reservaciones.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnSearchReservationMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchReservationMainActionPerformed
       SearchReservation vtna = new SearchReservation();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnSearchReservationMainActionPerformed

    
    /**
     * Acción realizada al presionar el botón para realizar el check-out.
     * Cierra la ventana actual y muestra la ventana de check-out.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnCheckoutMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutMainActionPerformed
        CheckOut vtna = new CheckOut();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnCheckoutMainActionPerformed

    
    /**
     * Acción realizada al presionar el botón para buscar clientes.
     * Cierra la ventana actual y muestra la ventana de búsqueda de clientes.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnSearchClientMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientMainActionPerformed
        
        SearchStatus vtna = new SearchStatus();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnSearchClientMainActionPerformed

    
    /**
     * Acción realizada al presionar el botón para ver el historial de una habitación.
     * Cierra la ventana actual y muestra la ventana de historial de habitaciones.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnHistoryRoomMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryRoomMainActionPerformed
        HistoryRoom vtna = new HistoryRoom();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnHistoryRoomMainActionPerformed

    
    /**
     * Acción realizada al presionar el botón para realizar el check-in.
     * Cierra la ventana actual y muestra la ventana de check-in.
     * 
     * @param evt El evento de acción que desencadena esta acción.
     */
    private void btnCheckinMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckinMainActionPerformed
        Checkin vtna = new Checkin();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_btnCheckinMainActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * Crea y muestra la ventana de menú principal.
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckinMain;
    private javax.swing.JButton btnCheckoutMain;
    private javax.swing.JButton btnHistoryRoomMain;
    private javax.swing.JButton btnSearchClientMain;
    private javax.swing.JButton btnSearchReservationMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
