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
public interface BankAccountAdapter {
    String getAccountAmount(String accountId);
    boolean verifyPin(String accountId, String pin);
    void updateAccountAmount(String accountId, int newAmount);
}


