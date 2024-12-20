/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinebanking2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Observer Interface
interface Observer {
    void update(String message);
}

public class Transfer extends javax.swing.JFrame implements Subject {

    // List of observers
    private List<Observer> observers = new ArrayList<>();
    
    // Database object
    JDBC db;
    
    // Sender ID and Reciever ID
    String SenderId;
    String Reciever;
    
    // JFrame for dialogs
    JFrame f = new JFrame();

    public Transfer(String id) {
        initComponents();
        this.setBounds(0, 0, 514, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        db = new JDBC();
        
        SenderId = id;
       
        
         TransactionLogger transactionLogger = new TransactionLogger();
        UIUpdater uiUpdater = new UIUpdater();
        
        addObserver(transactionLogger);
        addObserver(uiUpdater);
        
        // Initialize combo box with account IDs
        String s2 = "select * from tb_signup";
        try {
            db.rs = db.stm.executeQuery(s2);
            while (db.rs.next()) {
                String name = db.rs.getString("fd_AccountId");
                jComboBox1.addItem(name);
                String amount = db.rs.getString("fd_Amount");
                jLabel5.setText(amount);
            }
        } catch (Exception ec) {
            System.out.println(ec);
        }
        
        s2 = "select * from tb_signup where fdSNo='" + SenderId + "'";
        try {
            db.rs = db.stm.executeQuery(s2);
            while (db.rs.next()) {
                String amount = db.rs.getString("fd_Amount");
                jLabel5.setText(amount);
            }
        } catch (Exception ec) {
            System.out.println(ec);
        }
    }
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Transfer completed for account: " + SenderId);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("Account Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 120, 70, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(280, 120, 160, 29);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Amount");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(91, 201, 60, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(277, 201, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("Current Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(91, 164, 100, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 160, 150, 25);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 300, 61, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Transfer Money");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 60, 130, 20);

        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 300, 69, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/26c4cf26ca5e16da5aaf0d9ca52366c9.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Reciever=jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

String amount = jTextField1.getText();
    
    // Get current date and time
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
    String str = formatter.format(date);

    if (amount.equals("")) {
        JOptionPane.showMessageDialog(f, "Empty Field");
    } else {
        String s11 = "Select * from tb_signup where fdSNo='" + SenderId + "'";

        try {
            db.rs = db.stm.executeQuery(s11);
            db.rs.next();
            String s20 = db.rs.getString(12);
            
            int amount11 = Integer.parseInt(amount);
            int s14 = Integer.parseInt(s20);
            
            if (s14 < amount11) {
                JOptionPane.showMessageDialog(f, "Insufficient Amount");
            } else {
                // Show confirmation dialog before proceeding with transfer
                int confirm = JOptionPane.showConfirmDialog(f, 
                    "Are you sure you want to transfer " + amount + " to account " + Reciever + "?",
                    "Confirm Transfer", JOptionPane.YES_NO_OPTION);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    String s8 = "INSERT INTO tb_transactions(fd_SenderId, fd_RecieverId, fd_Amount, fd_DateTime) " +
                                 "VALUES('" + SenderId + "','" + Reciever + "','" + amount + "','" + str + "')";
                    db.stm.executeUpdate(s8);

                    // Update receiver's balance
                    String s2 = "select * from tb_signup where fd_AccountId='" + Reciever + "'";
                    db.rs = db.stm.executeQuery(s2);
                    db.rs.next();
                    int recieverAmount = db.rs.getInt(12);
                    int totalAmount = recieverAmount + Integer.parseInt(amount);
                    String s10 = "Update tb_signup set fd_Amount='" + totalAmount + "' where fd_AccountId='" + Reciever + "'";
                    db.stm.executeUpdate(s10);

                    // Update sender's balance
                    s2 = "select * from tb_signup where fdSNo='" + SenderId + "'";
                    db.rs = db.stm.executeQuery(s2);
                    db.rs.next();
                    int senderAmount = db.rs.getInt(12);
                    int updatedAmount = senderAmount - Integer.parseInt(amount);
                    String s12 = "Update tb_signup set fd_Amount='" + updatedAmount + "' where fdSNo='" + SenderId + "'";
                    db.stm.executeUpdate(s12);

                    // Notify observers after successful transaction
                    notifyObservers();

                    JOptionPane.showMessageDialog(f, "Transfer Successful");
                } else {
                    // Transaction canceled
                    JOptionPane.showMessageDialog(f, "Transaction Canceled");
                }
            }
        } catch (Exception ec) {
            System.out.println(ec);
        }
    }
    
    this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Transfer("SomeSenderId").setVisible(true);
        });
    }
    
    class TransactionLogger implements Observer {
        @Override
        public void update(String message) {
            System.out.println("TransactionLogger: " + message);
            // Here you can log the transaction to a file or database
        }
    }

    class UIUpdater implements Observer {
        @Override
        public void update(String message) {
            System.out.println("UIUpdater: " + message);
            // Update the UI with the success message
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
