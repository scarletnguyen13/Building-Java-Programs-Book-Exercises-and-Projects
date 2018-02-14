import java.awt.List;
import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<GroceryItemOrder> items;
	private double currentCost;
	
	//Constructs a new empty grocery list
	public GroceryList() {
		items = new ArrayList<GroceryItemOrder>();
		currentCost = 0;
	}
	
	//Adds the given item order to this list if the list has 
	//fewer than 10 items
	public void add(GroceryItemOrder item) {
		items.add(item);
		currentCost += item.getCost();
	}
	
	//Returns the total sum cost of all grocery item orders 
	//in this list
	public double getTotalCost() {
		return currentCost;
	}
}
