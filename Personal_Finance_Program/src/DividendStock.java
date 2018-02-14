
public class DividendStock extends Stock{
	
	private double dividends;
	
	//Constructor
	public DividendStock(String symbol, double currentPrice) {
		super(symbol,currentPrice); // call Stock constructor
		dividends = 0.0;
	}
	
	public double getMarketValue() {
		return super.getMarketValue() + dividends;
	}
	
	public double getProfit(double currentPrice) {
		return getMarketValue() - getTotalCost();
	}
	
	public void payDividend(double amountPerShare) {
		dividends += amountPerShare * getTotalShares();
	}
}
