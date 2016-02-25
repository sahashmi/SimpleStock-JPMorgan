
/**
 * Stock class
 * 
 * @author (Adeel) 
 * @version (1.0)
 */
public class Stock
{
    private String symbol;
    private double lastDividend;
    private double fixedDividend;
    private double parValue;
    private double tickerPrice;
    private StockType stockType;

    public Stock(String symbol, double lastDividend, double fixedDividend, double parValue, double tickerPrice, StockType stockType) {
        this.symbol = symbol;
        this.lastDividend = lastDividend;
        this.fixedDividend = fixedDividend;
        this.parValue = parValue;
        this.tickerPrice = tickerPrice;
        this.stockType = stockType;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public void setLastDividend(double lastDividend) {
        this.lastDividend = lastDividend;
    }
    
    public double getLastDividend() {
        return lastDividend;
    }
    
    public void setFixedDividend(double FixedDividend) {
        this.fixedDividend = fixedDividend;
    }
    
    public double getFixedDividend() {
        return fixedDividend;
    }
    
    public void setParValue(double parValue) {
        this.parValue= parValue;
    }
    
    public double getParValue() {
        return parValue;
    }

    public void setTickerPrice(double tickerPrice) {
        this.tickerPrice = tickerPrice;
    }
    
    public double getTickerPrice() {
        return tickerPrice;
    }

    public void setStockType(StockType stockType) {
        this.stockType = stockType;
    }
    
    public StockType getStockType() {
        return stockType;
    }
    
    @Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", Stock type=" + stockType + ", lastDividend="
				+ lastDividend + ", fixedDividend=" + fixedDividend
				+ ", parValue=" + parValue + "]";
	}
	
	public double calculateDividend() {
	    double dividend = 0.0;
	    switch(stockType) {
	        case COMMON:
	           dividend = tickerPrice > 0.0 ? lastDividend/tickerPrice : 0.0;
	         break;
	         case PREFERRED:
	           dividend = tickerPrice > 0.0 ? (fixedDividend * parValue/ tickerPrice) : 0.0;
	         break;
	    }
	    return dividend;
	}
	
	public double calculatePERatio() {
	    return fixedDividend > 0.0 ? tickerPrice/fixedDividend : 0.0; 
	}
}
