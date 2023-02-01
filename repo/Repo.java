package repo;

import entity.Stock;

import java.util.List;

public interface Repo {

   public List<Stock> SearchByMemberId ();
   public List<Stock> SearchByName();

   public List<Stock>SearchByUpperCapPrice();
    public void addToWishList();
    public boolean addMemberStockInfoToDb();
    public List<Stock>getWatchList(int id);





}
