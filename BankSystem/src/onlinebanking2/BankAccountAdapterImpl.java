/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebanking2;

/**
 *
 * @author Administrator
 */
import java.sql.*;

public class BankAccountAdapterImpl implements BankAccountAdapter {
    private JDBC db;

    public BankAccountAdapterImpl() {
        db = new JDBC();  // Assuming JDBC is a class that connects to your database
    }

    @Override
    public String getAccountAmount(String accountId) {
        String amount = null;
        String query = "SELECT fd_Amount FROM tb_signup WHERE fdSNo='" + accountId + "'";
        try {
            db.rs = db.stm.executeQuery(query);
            if (db.rs.next()) {
                amount = db.rs.getString("fd_Amount");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return amount;
    }

    @Override
    public boolean verifyPin(String accountId, String pin) {
        String storedPin = null;
        String query = "SELECT fdPinCode FROM tb_signup WHERE fdSNo='" + accountId + "'";
        try {
            db.rs = db.stm.executeQuery(query);
            if (db.rs.next()) {
                storedPin = db.rs.getString("fdPinCode");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return storedPin != null && storedPin.equals(pin);
    }

    @Override
    public void updateAccountAmount(String accountId, int newAmount) {
        String updateQuery = "UPDATE tb_signup SET fd_Amount='" + newAmount + "' WHERE fdSNo='" + accountId + "'";
        try {
            db.stm.executeUpdate(updateQuery);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
