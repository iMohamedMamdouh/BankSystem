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
public class TransactionHistoryLoggerDecorator extends TransactionHistoryDecorator {

    public TransactionHistoryLoggerDecorator(TransactionHistory decoratedTransactionHistory) {
        super(decoratedTransactionHistory);
    }

    @Override
    public void fetchTransactionHistory() {
        // Log before fetching the transaction history
        System.out.println("Logging: Fetching transaction history for user ID: " + decoratedTransactionHistory.id1);

        // Call the original fetchTransactionHistory method to fetch data
        super.fetchTransactionHistory();

        // Log after fetching the transaction history
        System.out.println("Logging: Finished fetching transaction history for user ID: " + decoratedTransactionHistory.id1);
    }
}
