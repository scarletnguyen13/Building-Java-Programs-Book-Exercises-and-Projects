import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreditCard implements ActionListener{
	public static void main(String[] args) {
		CreditCard card1 = new CreditCard();
	}
	
	//Field
	private JFrame frame;
	private JTextField numberField;
	private JButton verifyButton;
	private JLabel testValidLabel;
	
	//Constructor
	public CreditCard() {
		//Add Components
		numberField = new JTextField(16);
		verifyButton = new JButton("Verify CC Number");
		testValidLabel = new JLabel("Not Yet Verified");
		
		//Add ActionListener
		verifyButton.addActionListener(this);
		
		//set frame
		frame = new JFrame("Credit Card Number Verifier");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 100);
		frame.setLayout(new FlowLayout());
		frame.add(numberField);
		frame.add(verifyButton);
		frame.add(testValidLabel);
		frame.setVisible(true);
	}
	// returns whether the given string can be a valid Visa
	// card number according to the Luhn checksum algorithm
	public static boolean isValidCC(String text) {
		int sum = 0;
		for (int i = text.length() - 1; i >= 0; i--) {
			int digit = Integer.parseInt(text.substring(i, i + 1));
			if (i % 2 == 0) { // double even digits
				digit *= 2;
			}
			sum += (digit / 10) + (digit % 10);
		}
		// valid numbers add up to a multiple of 10
		return sum % 10 == 0 && text.startsWith("4");
	}
	
	public void actionPerformed (ActionEvent event) {
		String text = numberField.getText();
		if (isValidCC(text)) {
			testValidLabel.setText("Valid number!");
		} else {
			testValidLabel.setText("Invalid number!");
		}
	}
}
