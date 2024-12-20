/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinebanking2;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class CreateAccount extends javax.swing.JFrame {
    
        public class JDBC {
    public Connection connection;

    public JDBC() {
        try {
            // Initialize the connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_onlinebanking?useSSL=false&serverTimezone=UTC", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    JDBC db;
    String box1;
    public CreateAccount() {
        initComponents();
        this.setBounds(0,0,650,380);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        db=new JDBC();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 30, 190, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(120, 80, 190, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(120, 120, 190, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(120, 160, 190, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 40, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 85, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Pan Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Pin");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 30, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Re-Enter Pin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 70, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(120, 200, 190, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Account Type:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 170, 80, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Saving");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(420, 170, 80, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Current");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(520, 170, 70, 20);

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 310, 112, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 250, 50, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(120, 240, 190, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 290, 50, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female", "Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 280, 190, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Nationality");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(340, 50, 70, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(420, 40, 190, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Date Of Birth");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 90, 80, 16);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(420, 80, 190, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Amount");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(340, 130, 50, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(420, 120, 190, 30);

        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 310, 69, 25);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/26c4cf26ca5e16da5aaf0d9ca52366c9.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 640, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFrame f = new JFrame();
    
    // Get text field values
    String name = jTextField1.getText();
    String phone = jTextField2.getText();
    String pan = jTextField3.getText();
    String pin = jTextField4.getText();
    String rePin = jTextField5.getText();
    String address = jTextField6.getText();
    String nationality = jTextField7.getText();
    String dob = jTextField8.getText();
    String amount = jTextField9.getText();
        
        jRadioButton1.setActionCommand("Saving");
        jRadioButton2.setActionCommand("Current");
        String s6=buttonGroup1.getSelection().getActionCommand();
        
                box1 = jComboBox1.getSelectedItem().toString();

        
       
        
        
        if (name.isEmpty() || phone.isEmpty() || pan.isEmpty() || pin.isEmpty() || rePin.isEmpty() || address.isEmpty() || 
        nationality.isEmpty() || dob.isEmpty() || amount.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please fill in all fields");
        return;
    }

    // Ensure Pin and Re-Enter Pin match
    if (!pin.equals(rePin)) {
        JOptionPane.showMessageDialog(f, "Pins do not match");
        return;
    }
    
     String accountType = buttonGroup1.getSelection().getActionCommand();
     
     String gender = jComboBox1.getSelectedItem().toString();
    if (gender.equals("Select Gender")) {
        JOptionPane.showMessageDialog(f, "Please select a gender");
        return;
    }
     Random rand = new Random();
    String accountId = String.format("%04d", rand.nextInt(10000));

    // Prepare SQL query
    String query = "INSERT INTO tb_signup (fdName, fd_PhoneNumber, fdPan, fdPinCode, fdAccountType, fd_Address, " +
                   "fd_Gender, fd_Nationality, fd_Dob, fd_AccountId, fd_Amount) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try {
        // Prepare the statement and set parameters
        PreparedStatement pst = db.connection.prepareStatement(query);
        pst.setString(1, name);
        pst.setString(2, phone);
        pst.setString(3, pan);
        pst.setString(4, pin);
        pst.setString(5, accountType);
        pst.setString(6, address);
        pst.setString(7, gender);
        pst.setString(8, nationality);
        pst.setString(9, dob);
        pst.setString(10, accountId);
        pst.setString(11, amount);
        
        // Execute update
        pst.executeUpdate();
        
        // Show success message
        JOptionPane.showMessageDialog(f, "Account Created Successfully");
        this.dispose(); // Close the form
    } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(f, "Error creating account, please try again.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        box1=jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}


