package service.Transction;

public class DepositMoney {
    public DepositMoney(Transction transction) {
        this.transction = transction;
    }

    private Transction transction;

    public boolean depositMoney()
    {
        return transction.initiateTransction();
    }

}
