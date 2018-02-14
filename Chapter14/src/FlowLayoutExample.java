import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Type your ZIP code: ");
		JTextField field = new JTextField(5);
		JButton button = new JButton("Submit");
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(field);
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
	}
}
