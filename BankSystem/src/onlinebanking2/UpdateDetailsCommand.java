/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebanking2;

import javax.swing.JOptionPane;



public class UpdateDetailsCommand implements Command {
    private Details details;
    private String phoneNumber;
    private String pin;
    private String name;
    private String address;
    private JDBC db;  // Add db as a field

    // Modify constructor to accept db as a parameter
    public UpdateDetailsCommand(Details details, String phoneNumber, String pin, String name, String address, JDBC db) {
        this.details = details;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.name = name;
        this.address = address;
        this.db = db;  // Store the passed db object
    }

    @Override
    public void execute() {
        // Constructing the SQL query
        String updateQuery = "UPDATE tb_signup SET fd_PhoneNumber='" + phoneNumber + "', fdPinCode='" + pin + 
                             "', fdName='" + name + "', fd_Address='" + address + "' WHERE fdSNo='" + details.getId() + "'";
        
        try {
            // Executing the SQL update statement using the passed db object
            db.stm.executeUpdate(updateQuery);
            JOptionPane.showMessageDialog(null, "Details Updated Successfully!");
        } catch (Exception e) {
            // Handling any exceptions during the database update
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating details: " + e.getMessage());
        }
    }
}
