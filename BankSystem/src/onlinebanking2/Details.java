package onlinebanking2;

import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Details extends javax.swing.JFrame {

    
    String id;
    JDBC db;
    String s2,name,Phone_Number,Pin,AccountId,Address,Gender,Nationality,dob;
    public Details(String id) {
        initComponents();
        this.setBounds(0,0,630,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.id=id;
        db=new JDBC();
        
        DecimalFormat df=new DecimalFormat("#,###.00");
        
        s2="select * from tb_signup where fdSNo='"+this.id+"'";
        try
        {
          db.rs=db.stm.executeQuery(s2);
          db.rs.next();
          name = db.rs.getString(2);
          Phone_Number = db.rs.getString(3);
          Pin = db.rs.getString(5);
          AccountId= db.rs.getString(11);
          Address= db.rs.getString(7);
          Gender= db.rs.getString(8);
          Nationality= db.rs.getString(9);
          dob= db.rs.getString(10);
          
          
          
          jLabel14.setText(name);
          jTextField1.setText(Phone_Number);
          jLabel7.setText(Pin);
          jLabel3.setText(AccountId);
          jTextField3.setText(name);
          jTextField4.setText(Address);
          jLabel9.setText(Gender);
          jLabel11.setText(Nationality);
          jLabel13.setText(dob);
        }
        catch(Exception ec)
        {
            System.out.println(ec);
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
        JFrame f=new JFrame();
        String s1,s2,s3,s4,s10;
        
        s1=jTextField1.getText();
        s2=jLabel7.getText();
        s3=jTextField3.getText();
        s4=jTextField4.getText();
        
        
        if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals(""))
        {
            JOptionPane.showMessageDialog(f, "Empty Field");
        }else{
        s10="Update  tb_signup set fd_PhoneNumber='"+s1+"',fdPinCode='"+s2+"',fdName='"+s3+"',fd_Address='"+s4+"' WHERE fdSNo='"+id+"'";
        System.out.println(s10);
        try
        {
            db.stm.executeUpdate(s10);

        }catch(Exception ec)
        {
            System.out.println(ec);
        }
      
        this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
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
