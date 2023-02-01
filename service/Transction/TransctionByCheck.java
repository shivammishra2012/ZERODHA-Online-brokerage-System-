package service.Transction;

import entity.Stock;

public class TransctionByCheck implements Transction{

    private String fromAccount;

    public TransctionByCheck(String fromAccount, String toAccount,Stock stock) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.stock = stock;
    }

    private String toAccount;
    private Stock stock;



    @Override
    public boolean initiateTransction() {

        // if pay is successful it will notify user using notification service
        return false;
    }
}
