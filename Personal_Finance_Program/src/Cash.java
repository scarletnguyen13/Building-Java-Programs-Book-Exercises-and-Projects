
public class Cash implements Asset{
	private double amount; //amount of money held
	
	public Cash(double amount) {
		this.amount = amount;
	}
	
	public double getMarketValue() {
		return amount;
	}
	
	public double getProfit() {
		return 0.0;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
