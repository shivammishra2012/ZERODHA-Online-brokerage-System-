package service.Search;

import entity.Stock;
import service.Search.SearchRepo;

import java.util.List;

public class SearchByUpperCapPrice implements SearchRepo
{

    public SearchByUpperCapPrice(String upperCapPrice) {
        UpperCapPrice = upperCapPrice;
    }

    private String UpperCapPrice;

    @Override
    public List<Stock> Search() {
        return null;
    }
}
