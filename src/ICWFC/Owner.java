/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICWFC;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author THAMINA PRITY
 */
public class Owner extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Owner
     */
    public Owner() {
        initComponents();
        conn = connectDb.ConnercrDB();
        OwnerInfo();
    }
    
    private void OwnerInfo(){
        try {
        String sql = "SELECT\n" +
                    "owner.ownername,\n" +
                    "owner.owneraddress,\n" +
                    "owner.ownerphone,\n" +
                    "owner.owneremail\n" +
                    "FROM\n" +
                    "owner";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()){       
            
            String ownerName = rs.getString("ownername"); 
            txt_OwnerName.setText(ownerName);
            
            String ownerAddress = rs.getString("owneraddress"); 
            txt_OwnerAddress.setText(ownerAddress);
            
            String ownerPhone = rs.getString("ownerphone");
            txt_OwnerPhone.setText(ownerPhone);
            
            String ownerEmail = rs.getString("owneremail");
            txt_OwnerEmail.setText(ownerEmail);                
            
            
           // String driver = rs.getString("drivername");
            //ComboBox_drivername.addItem(driver);
            
            
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    finally{
            try {
                //Close the database connection
                rs.close();
                pst.close();
                
            } catch (Exception e) {
            }
        }
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_OwnerName = new javax.swing.JTextField();
        txt_OwnerAddress = new javax.swing.JTextField();
        txt_OwnerPhone = new javax.swing.JTextField();
        txt_OwnerEmail = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Phone:");

        jLabel4.setText("Email:");

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Close.setText("Close");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });

        btn_Add.setText("Add");

        btn_Edit.setText("Edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btn_Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Close))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_OwnerPhone)
                            .addComponent(txt_OwnerAddress)
                            .addComponent(txt_OwnerName)
                            .addComponent(txt_OwnerEmail))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_OwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_OwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_OwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_OwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Update)
                    .addComponent(btn_Close)
                    .addComponent(btn_Add)
                    .addComponent(btn_Edit))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        try {        
        String ownerNameUpdate = txt_OwnerName.getText();
        String ownerAddressUpdate = txt_OwnerAddress.getText();
        String ownerPhoneUpdate = txt_OwnerPhone.getText();
        String ownerEmailUpdate = txt_OwnerEmail.getText();
        
        String sql = "UPDATE owner SET ownername='"+ownerNameUpdate+"',owneraddress='"+ownerAddressUpdate+"',ownerphone='"+ownerPhoneUpdate+"',owneremail='"+ownerEmailUpdate+"'";
               
        pst = conn.prepareStatement(sql);
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Updated");
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    finally{
            try {
                //Close the database connection
                rs.close();
                pst.close();
                
            } catch (Exception e) {
            }
        }
        
        
    }//GEN-LAST:event_btn_UpdateActionPerformed
    
    public void close(){
            WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        }
    
    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseActionPerformed
        close();
    }//GEN-LAST:event_btn_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_OwnerAddress;
    private javax.swing.JTextField txt_OwnerEmail;
    private javax.swing.JTextField txt_OwnerName;
    private javax.swing.JTextField txt_OwnerPhone;
    // End of variables declaration//GEN-END:variables
}
