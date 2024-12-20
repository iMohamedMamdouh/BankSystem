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
import java.lang.reflect.Method;

public abstract class TransactionHistoryDecorator extends TransactionHistory {
    protected TransactionHistory decoratedTransactionHistory;

    public TransactionHistoryDecorator(TransactionHistory decoratedTransactionHistory) {
        super(decoratedTransactionHistory.id1); // Pass user ID to the parent constructor
        this.decoratedTransactionHistory = decoratedTransactionHistory;
    }

    public void initComponents() {
        try {
            // Use reflection to access the private initComponents method
            Method method = decoratedTransactionHistory.getClass().getDeclaredMethod("initComponents");
            method.setAccessible(true);  // Make the private method accessible
            method.invoke(decoratedTransactionHistory);  // Invoke the method
        } catch (Exception e) {
            e.printStackTrace();  // Handle any reflection exceptions here
        }
    }

    @Override
    public void fetchTransactionHistory() {
        decoratedTransactionHistory.fetchTransactionHistory();  // Call the original fetch method
    }
}
