package repo;

import controller.Member;
import entity.MemberStockInfo;
import entity.Stock;

import java.util.List;

public class MemberInfoRepo implements  Repo{
    public MemberInfoRepo(int memberId, Stock stock) {
        this.memberId = memberId;
        this.stock = stock;
    }

    private int memberId;
    private Stock stock;


    @Override
    public List<Stock> SearchByMemberId() {
        return null;
    }

    @Override
    public List<Stock> SearchByName() {
        return null;
    }

    @Override
    public List<Stock> SearchByUpperCapPrice() {
        return null;
    }

    @Override
    public void addToWishList() {

        // to db
        // create watching

        // create object of watchlist and add to db

    }

    @Override
    public boolean addMemberStockInfoToDb() {

        // create MemberInfodb


        // add to db entity (memberinfodb)

        //MemberStockInfo memberStockInfo=new MemberStockInfo()
        return false;
    }

    @Override
    public List<Stock> getWatchList(int id) {
        // query the db and get the list of stocks for a particular memberId

        return null;
    }
}
