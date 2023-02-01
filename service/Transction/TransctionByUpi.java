package service.Transction;

import entity.Stock;

public class TransctionByUpi implements Transction {

    private String fromAccount;
    private String toAccount;
    private Stock stock;

    public  TransctionByUpi(String fromAccount, String toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.stock = stock;
    }




    @Override
    public boolean initiateTransction() {
        // if pay is successfull it will notify user using notification service
        return false;
    }
}
