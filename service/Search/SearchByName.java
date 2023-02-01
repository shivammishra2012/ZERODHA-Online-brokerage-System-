package service.Search;

import entity.Stock;
import service.Search.SearchRepo;

import java.util.List;

public class SearchByName implements SearchRepo {

    public SearchByName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public List<Stock> Search() {
        //extract list of stocks by name from database stock that have active list of stocks
        return null;
    }
}
