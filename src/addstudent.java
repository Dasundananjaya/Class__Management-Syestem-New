/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.security.auth.Subject;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class addstudent extends javax.swing.JFrame {

    /**
     * Creates new form addstudent
     */
    public addstudent() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        TPNO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ST = new javax.swing.JTable();
        Viwe = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("TP NO");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icn\\ADD.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "TP NO"
            }
        ));
        jScrollPane1.setViewportView(ST);

        Viwe.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icn\\view.png")); // NOI18N
        Viwe.setText("View");
        Viwe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViweActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icn\\delete.png")); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icn\\update.png")); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icn\\back.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Student's Details.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jButton1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TPNO)
                                            .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(Name)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(Viwe)
                                        .addGap(30, 30, 30)
                                        .addComponent(Delete)
                                        .addGap(18, 18, 18)
                                        .addComponent(Update))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(TPNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Viwe)
                    .addComponent(Delete)
                    .addComponent(Update))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
        Class.forName("com.mysql.jdbc.Driver");            
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_management", "root", "");
        String Query = "insert into Student(Name, Address, `TP NO`) values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(Query);
        pst.setString(1, Name.getText());
        pst.setString(2, Address.getText());
        pst.setString(3, TPNO.getText());

        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Insert successful");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViweActionPerformed
        // TODO add your handling code here:
         try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_management", "root", "");
        String Query = "SELECT * FROM Student";
        PreparedStatement pst = con.prepareStatement(Query);
        ResultSet rs = pst.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) ST.getModel();
        model.setRowCount(0); // Clear existing data in the table
        
        while(rs.next()) {
            Object[] row = {rs.getString("Name"), rs.getString("Address"), rs.getString("TP NO")};
            model.addRow(row);
        }
        
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_ViweActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
         int selectedRow = ST.getSelectedRow();
    if (selectedRow != -1) {
        // Get the student name from the selected row (assuming Name is the first column)
        String studentName = (String) ST.getValueAt(selectedRow, 0);
        
        try {
            // Establish connection to the database
            Class.forName("com.mysql.jdbc.Driver");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_management", "root", "");
            
            // Create the SQL delete statement
            String Query = "DELETE FROM Student WHERE Name=?";
            PreparedStatement pst = con.prepareStatement(Query);
            pst.setString(1, studentName);
            
            // Execute the delete statement
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Delete successful");
                
                // Remove the row from the table model
                DefaultTableModel model = (DefaultTableModel) ST.getModel();
                model.removeRow(selectedRow);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to delete");
    }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = ST.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get the student name from the selected row (assuming Name is the first column)
        String originalName = (String) ST.getValueAt(selectedRow, 0);
        
        // Get the updated values from the text fields
        String updatedName = Name.getText();
        String updatedAddress = Address.getText();
        String updatedTPNO = TPNO.getText();
        
        try {
            // Establish connection to the database
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_management", "root", "");
            
            // Create the SQL update statement
            String Query = "UPDATE Student SET Name=?, Address=?, `TP NO`=? WHERE Name=?";
            PreparedStatement pst = con.prepareStatement(Query);
            pst.setString(1, updatedName);
            pst.setString(2, updatedAddress);
            pst.setString(3, updatedTPNO);
            pst.setString(4, originalName);
            
            // Execute the update statement
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?", "Update Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update successful");
                
                // Update the row in the table model
                DefaultTableModel model = (DefaultTableModel) ST.getModel();
                model.setValueAt(updatedName, selectedRow, 0);
                model.setValueAt(updatedAddress, selectedRow, 1);
                model.setValueAt(updatedTPNO, selectedRow, 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to update");
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new dashboard().setVisible(true);        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Name;
    private javax.swing.JTable ST;
    private javax.swing.JTextField TPNO;
    private javax.swing.JButton Update;
    private javax.swing.JButton Viwe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}