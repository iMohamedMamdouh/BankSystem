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
public class CancelCommand implements Command {
    private Details details;

    public CancelCommand(Details details) {
        this.details = details;
    }

    @Override
    public void execute() {
        details.dispose();
    }
}
