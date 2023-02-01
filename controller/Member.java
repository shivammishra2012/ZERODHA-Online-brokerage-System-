package controller;

import entity.MemberStockInfo;
import entity.Stock;
import repo.MemberInfoRepo;
import repo.Repo;
import service.Search.SearchRepo;
import service.Transction.DepositMoney;
import service.Transction.Transction;
import service.Transction.TransctionByCheck;
import service.notifications.Notification;

import java.util.List;

public class Member extends Account {

    // builder design pattern
    private SearchRepo searchRepo;
    private Transction transction;
    private Repo repo;
    private Notification notification;
    public void searchStocksByName(Stock stock)
    {

    }
    public List<Stock> searchStocksByNameWithLowerCap(Stock stock,int price)
    {
        if(price>0)
        {
            return searchRepo.Search();
        }
        else
        {
            return null;
        }

    }
    public List<Stock> searchStocksByNameWithUpperCap(Stock stock,int price )
    {
        if(price>0)
        {
            return searchRepo.Search();
        }
        else
        {
            return null;
        }
    }

    public Boolean sellStocks(Stock stock,int id)
    {
            // simliarly if money get deposited successfully in userAccount then call notifaction service

        return true;

    }

    public Boolean buyStock(Stock stock,int id)
    {
        // creating tranction using differnt methods
       Transction transction= new TransctionByCheck("12345", "23456",stock);
       DepositMoney depositMoney=new DepositMoney(transction);
        if(depositMoney.depositMoney())
        {
            // call notification service and add stock and id info to member info db



            Repo repo=new MemberInfoRepo(id,stock);
            repo.addMemberStockInfoToDb();

            //  call notification service and add stock and id info to member info db
            notification.sendNotifications();
            return true;
        }
        else
        {
            return false;
        }
    }
    public List<Stock> getListOfStocksforUserId(int id)
    {
        return repo.SearchByMemberId();

    }


    @Override
    public boolean resetPassword() {
        return false;
    }
}
