/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinebanking2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Deposite extends javax.swing.JFrame {
    JDBC db;
    String id1,s2,s3,currentAmount;
    JFrame f=new JFrame();
    public Deposite(String id){
        initComponents();
        this.setBounds(0,0,600,380);
        this.setLocationRelativeTo(null);
        db=new JDBC();
        id1=id;
     
       
        
        s2="select * from tb_signup where fdSNo='"+id1+"'";
        try
        {
          db.rs=db.stm.executeQuery(s2);
          while(db.rs.next())
          {
             
              currentAmount=db.rs.getString("fd_Amount");
              jLabel5.setText(currentAmount);
              
              String accountId=db.rs.getString("fd_AccountId");
              jLabel6.setText(accountId);
              
          }
        }
        
        catch(Exception ec)
        {
            System.out.println(ec);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Add Money");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 20, 110, 36);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("Account Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Amount");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 149, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 170, 150, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("Current Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 140, 100, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 130, 150, 20);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 300, 55, 25);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 90, 150, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("Pin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 230, 149, 16);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(280, 220, 150, 30);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 300, 71, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/26c4cf26ca5e16da5aaf0d9ca52366c9.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1,s2,s3,s4,pin = null,amount = null;
        
        s1=jTextField1.getText();
        s2=jPasswordField1.getText();
        
        
        if((s1.equals(""))||(s2.equals("")))
        {
          JOptionPane.showMessageDialog(f, "Empty Field");
        }
        else
        {
            
        s3="select * from tb_signup where fdSNo='"+id1+"'";
        try
        {
          db.rs=db.stm.executeQuery(s3);
          while(db.rs.next())
          {
             
              pin=db.rs.getString("fdPinCode");
              
              amount=db.rs.getString("fd_Amount");
          }
        }
        
        catch(Exception ec)
        {
            System.out.println(ec);
        }
        }
        
        System.out.println(pin);
        System.out.println(s2);
        if(!s2.equals(pin))
        {
            JOptionPane.showMessageDialog(f, "Wrong Pin");
        }
        else
        {
            int Amount1=Integer.parseInt(amount);
            int UserEnteredAmount = Integer.parseInt(s1);
            int total_Amount=Amount1+UserEnteredAmount;
            
            String s10 = "Update  tb_signup set fd_Amount='" + total_Amount + "' where fdSNo='" + id1 + "'";
            System.out.println(s10);
            try 
            {
                db.stm.executeUpdate(s10);
            } catch (Exception ec) {
                System.out.println(ec);
            }
            
            JOptionPane.showMessageDialog(f, "Balance Added Successfully");
            this.dispose();
        }
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   
}
