
public abstract class ShareAsset implements Asset {
	
	private String symbol; // stock symbol, e.g. "YHOO"
	private double totalCost; // total cost for all shares
	private double currentPrice;
	
	public ShareAsset(String theSymbol, double currentPrice) {
		if (theSymbol == null) {
			throw new NullPointerException();
		}
		
		this.symbol = theSymbol;
		this.currentPrice = currentPrice;
		this.totalCost = 0.0;
	}
	
	public void addCost(double cost) {
		this.totalCost += cost;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public double getTotalCost() {
		return this.totalCost;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	// returns the profit earned on shares of this asset
	public double getProfit() {
		// calls an abstract getMarketValue method
		// (the subclass will provide its implementation)
		return getMarketValue() - totalCost;
	}
	
	// returns the current market value of this asset
	public abstract double getMarketValue();
}
