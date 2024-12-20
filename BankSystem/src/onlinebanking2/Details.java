/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinebanking2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details extends javax.swing.JFrame {
    private String id;
    private JDBC db;
    private String name, phoneNumber, pin, accountId, address, gender, nationality, dob;

    public Details(String id) {
        initComponents();
        this.setBounds(0, 0, 630, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.id = id;
        db = new JDBC();

        fetchData();

        // Set up buttons with commands
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(evt -> new CancelCommand(Details.this).execute());
    }

    private void fetchData() {
        String query = "select * from tb_signup where fdSNo='" + this.id + "'";
        try {
            db.rs = db.stm.executeQuery(query);
            if (db.rs.next()) {
                name = db.rs.getString(2);
                phoneNumber = db.rs.getString(3);
                pin = db.rs.getString(5);
                accountId = db.rs.getString(11);
                address = db.rs.getString(7);
                gender = db.rs.getString(8);
                nationality = db.rs.getString(9);
                dob = db.rs.getString(10);

                // Set the data in the GUI components
                jLabel14.setText(name);
                jTextField1.setText(phoneNumber);
                jLabel7.setText(pin);
                jLabel3.setText(accountId);
                jTextField3.setText(name);
                jTextField4.setText(address);
                jLabel9.setText(gender);
                jLabel11.setText(nationality);
                jLabel13.setText(dob);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 80, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 80, 20);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 70, 157, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("User Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 80, 70, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 120, 50, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 210, 50, 20);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 210, 157, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Nationality");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 160, 70, 16);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 160, 157, 22);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Date Of Birth");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 250, 90, 16);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(190, 250, 157, 24);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(300, 20, 183, 25);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 320, 73, 25);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 320, 71, 25);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Phone Number");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 110, 107, 22);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Pin");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 160, 107, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 110, 160, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(440, 70, 160, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(440, 110, 160, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 160, 150, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/26c4cf26ca5e16da5aaf0d9ca52366c9.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 640, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String phoneNumber = jTextField1.getText();
    String pin = jLabel7.getText();
    String name = jTextField3.getText();
    String address = jTextField4.getText();

    // Check if any field is empty
    if (phoneNumber.isEmpty() || pin.isEmpty() || name.isEmpty() || address.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the fields.");
    } else {
        // Construct SQL query to update user details
        String updateQuery = "UPDATE tb_signup SET fd_PhoneNumber='" + phoneNumber + "', fdPinCode='" + pin + 
                             "', fdName='" + name + "', fd_Address='" + address + "' WHERE fdSNo='" + id + "'";
        try {
            db.stm.executeUpdate(updateQuery);
            // Show success message after update
            JOptionPane.showMessageDialog(this, "Details updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating details: " + e.getMessage());
        }
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details("12345").setVisible(true); // Example user ID
            }
        });
    }
    
    public String getId() {
        return id;
    }

    public JDBC getDb() {
        return db;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    
}
