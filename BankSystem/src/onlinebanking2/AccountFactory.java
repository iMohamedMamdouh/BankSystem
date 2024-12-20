package onlinebanking2;

import java.util.Random;
import javax.swing.JOptionPane;

public class AccountFactory {

    public static void createAccount(JDBC db, String name, String phone, String pan, String pin, String rePin, String address, 
                                     String gender, String nationality, String dob, String amount, String accountType) {

        
        if(name.equals("") || phone.equals("") || pan.equals("") || pin.equals("") || rePin.equals("") || address.equals("") 
           || gender.equals("") || nationality.equals("") || dob.equals("") || amount.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Field");
            return;
        }

        
        String query = "INSERT INTO tb_signup(fdName, fd_PhoneNumber, fdPan, fdPinCode, fdAccountType, fd_Address, " +
                       "fd_Gender, fd_Nationality, fd_Dob, fd_AccountId, fd_Amount) VALUES ('" + name + "','" + phone + "','" +
                       pan + "','" + pin + "','" + accountType + "','" + address + "','" + gender + "','" + nationality + "','" +
                       dob + "','" + generateRandomAccountId() + "','" + amount + "')";

        try {
            
            db.stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    private static String generateRandomAccountId() {
        Random rand = new Random();
        int randomInt = rand.nextInt(9999);
        return String.valueOf(randomInt);
    }
}
