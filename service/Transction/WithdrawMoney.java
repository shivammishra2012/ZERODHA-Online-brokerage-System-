package service.Transction;

public class WithdrawMoney {

    public WithdrawMoney(Transction transction) {
        this.transction = transction;
    }

    private Transction transction;

    public boolean withDrawMoney()
    {
        return transction.initiateTransction();
    }

}
