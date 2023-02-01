package entity;
import entity.Stock;

import java.util.List;

public class MemberStockInfo {

    // prefer composition









    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Stock stock;
    private int id;

    public MemberStockInfo(int id, Stock stock) {
        this.id = id;

        this.stock = stock;
    }




}
