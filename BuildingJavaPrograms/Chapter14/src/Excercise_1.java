import java.awt.*;
import javax.swing.*;

public class Excercise_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Good thing I studied!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel north = new JPanel(new GridLayout(1,3));
		for (int a = 1; a <= 3; a++) {
			north.add(new JButton("Button" + a));
		}
		
		JPanel centre = new JPanel (new GridLayout(2,2));
		for (int a = 4; a <= 7; a++) {
			centre.add(new JButton("Button" + a));
		}
		
		JPanel south = new JPanel(new FlowLayout());
		south.add(new JLabel("Type stuff: "));
		south.add(new JTextField(8));
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(centre, BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH);
		
		frame.setSize(285, 200);;
		frame.setVisible(true);
	}
}
