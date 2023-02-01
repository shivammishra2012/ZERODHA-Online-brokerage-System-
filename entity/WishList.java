package entity;

import java.util.List;

public class WishList {
    private int memberId;
    private List<Stock>Stocks;



    public WishList(int memberId, List<Stock> stocks) {
        this.memberId = memberId;
        Stocks = stocks;
    }




    public List<Stock> getStocks() {
        return Stocks;
    }
    public int getMemberId() {
        return memberId;
    }

    public void add(Stock stock)
    {
        this.Stocks.add(stock);
    }


}
