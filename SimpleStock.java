import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;
/**
 * Simple Stock class
 * 
 * @author (Adeel Hashmi) 
 * @version (1.0)
 */
public class SimpleStock
{
    public static void main(String[] args) {
        
        List<Stock> stockList = new ArrayList<Stock>();
        Stock stock1 = new Stock("TEA", 10.0, 0.0, 100, 20, StockType.COMMON);
        stockList.add(stock1);
        Stock stock2 = new Stock("TEU", 10.0, 1.0, 100, 80, StockType.COMMON);
        stockList.add(stock2);
        
        //PE Ratio
        System.out.println(stock1.calculatePERatio());
        //Dividend calculation
        System.out.println(stock1.calculateDividend());
        
        List<Trade> tradeList = new ArrayList<Trade>();
        tradeList.add(new Trade(DateUtil.minusXMinutesToDate(5), 2, TradeType.BUY, 10.50));
        tradeList.add(new Trade(DateUtil.minusXMinutesToDate(20), 5, TradeType.BUY, 30.50));
        tradeList.add(new Trade(new Date(), 2, TradeType.SELL, 5.0));
        
        Collections.sort(tradeList);
        
        //stock price calculation
        double stockPrice = 0.0;
        int shareQuantity = 0;
        for (Trade trade: tradeList) {
            if(DateUtil.isDateInXMinutesRange(trade.getTradeTimestamp(), 15)) {
                stockPrice = stockPrice + (trade.getSharePrice() * trade.getShareQuantity());
                shareQuantity = shareQuantity + trade.getShareQuantity();
            } else {
                continue;
            }
            System.out.println("Stock Price: " + stockPrice/shareQuantity);
        }
        
        //GBCE calculation
        double mean = 1.0;
        for (Stock stock: stockList) {
            mean = mean * stock.getTickerPrice();
        }
        mean = Math.pow(mean,(1/stockList.size()));
        System.out.println("GBCE: " + mean);
    }
}

