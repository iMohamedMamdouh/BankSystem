
package onlinebanking2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    private static Login instance; 

    private JDBC db;
    private String password;
    private int id;

   
    private Login() {
        initComponents();
        this.setBounds(0, 0, 600, 380);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        db = new JDBC();
    }

    
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome To Banking System");
        jLabel1.setToolTipText("Online Banking");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 260, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Pin ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 130, 80, 30);

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 220, 61, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Don't Have Account? Create New Account");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 290, 240, 16);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(270, 130, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank(1).png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 40, 64, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/26c4cf26ca5e16da5aaf0d9ca52366c9.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String s1 = jPasswordField1.getText();
        JFrame f = new JFrame();

        if (s1.equals("")) {
            JOptionPane.showMessageDialog(f, "Empty Field");
        } else {
            String s2 = "select * from tb_signup where fdPinCode='" + s1 + "'";
            try {
                db.rs = db.stm.executeQuery(s2);
                db.rs.next();
                id = db.rs.getInt(1);
                password = db.rs.getString(5);

            } catch (Exception ec) {
                System.out.println(ec);
            }

            if (!s1.equals(password)) {
                JOptionPane.showMessageDialog(f, "Wrong PIN");
            } else {
                JOptionPane.showMessageDialog(f, "Login Successful");
                String id1 = String.valueOf(id);

                Home home = new Home(id1);
                home.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         CreateAccount ca = new CreateAccount();
        ca.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
