import javax.swing.*;

public class UseOptionPanes2 {
	public static void main(String[] args) {
		 String ageText = JOptionPane.showInputDialog(null, "How old are you?");
		 int age = 0; 
		 //prevent invalid inputs
		 try {
			 age = Integer.parseInt(ageText);
		 } catch (NumberFormatException nfe) {
			 JOptionPane.showMessageDialog(null, "Invalid integer.");
		 }
		
		 String moneyText = JOptionPane.showInputDialog(null, "How much money do you have?");
		 double money = 0.0;
		 try {
			 money = Double.parseDouble(moneyText);
		 } catch (NumberFormatException nfe) {
			 JOptionPane.showMessageDialog(null, "Invalid double.");
		 }
		 
		 JOptionPane.showMessageDialog(null, "If you can double your money each year,\n" +
				 "You'll have $" + (money * 32) +
				 " at age " + (age + 5) + "!");
	}
}
