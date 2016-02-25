import java.util.Date;

/**
 * Write a description of class Trade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trade implements Comparable<Trade>
{
    // instance variables - replace the example below with your own
    private Date tradeTimestamp;
    private int shareQuantity;
    private TradeType tradeType;
    private double sharePrice;

    public Trade(Date tradeTimestamp, int shareQuantity, TradeType tradeType, double sharePrice) {
        this.tradeTimestamp = tradeTimestamp;
        this.shareQuantity = shareQuantity;
        this.tradeType = tradeType;
        this.sharePrice = sharePrice;
    }
    
    public void setTradeTimestamp(Date tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
    }
    
    public Date getTradeTimestamp() {
        return tradeTimestamp;
    }
    
    public void setShareQuantity(int shareQuantity) {
        this.shareQuantity = shareQuantity;
    }
    
    public int getShareQuantity() {
        return shareQuantity;
    }
    
    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }
    
    public TradeType getTradeType() {
        return tradeType;
    }
    
    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
    
    public double getSharePrice() {
        return sharePrice;
    }
    
    @Override
    public int compareTo(Trade t) {
        return tradeTimestamp.compareTo(t.getTradeTimestamp());
    }
    
}
