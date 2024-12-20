/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebanking2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.*;

public class JDBC {
    
    Connection con;
    Statement stm;
    ResultSet rs;
    
    public JDBC() {
        try {
            // MySQL driver is automatically loaded with newer versions, so no need for Class.forName()
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_onlinebanking?useSSL=false&serverTimezone=UTC", "root", "");
            stm = con.createStatement();
        } catch (Exception ex) {
            System.out.println(ex);
        }    
    }
}

