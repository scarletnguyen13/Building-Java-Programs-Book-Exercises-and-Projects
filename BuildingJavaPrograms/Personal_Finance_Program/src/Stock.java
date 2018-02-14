// A Stock object represents purchases of shares of a stock.

public class Stock extends ShareAsset{
		
	private int totalShares; // total shares purchased
	
	// initializes a new Stock with no shares purchased
	// pre: symbol != null
	public Stock(String theSymbol, double currentPrice) {
		super(theSymbol,currentPrice);
		totalShares = 0;
	}
	
	// returns the market value of this stock, which is
	// the number of total shares times the share price
	public double getMarketValue() {
		return totalShares * getCurrentPrice();
	}
	
	// returns the total shares purchased of this stock
	public int getTotalShares() {
		return totalShares;
	}
		
	// records purchase of the given shares at the given price
	// pre: shares >= 0 && pricePerShare >= 0.0
	public void purchase(int shares, double pricePerShare) {
		if (shares < 0 || pricePerShare < 0.0) {
			throw new IllegalArgumentException();
		}
		
		totalShares += shares;
		addCost(shares * pricePerShare);
	}
}