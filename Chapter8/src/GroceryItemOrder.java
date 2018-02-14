
public class GroceryItemOrder {
	private String name;
	private int quantity;
	private double pricePerUnit;
	
	//Constructs an item order to purchase the item with 
	//the given name, in the given quantity, which costs 
	//the given price per unit.
	public GroceryItemOrder(String name, int quantity, 
			double pricePerUnit) {
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	
	//Returns the total cost of this item in its given 
	//quantity. For example, four boxes of cookies that 
	//cost 2.30 per unit have a total cost of 9.20.
	public double getCost() {
		return (double) this.quantity * this.pricePerUnit;
	}
	
	//Sets this grocery item’s quantity to be the given value.
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
