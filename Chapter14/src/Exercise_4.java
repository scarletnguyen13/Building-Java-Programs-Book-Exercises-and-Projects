import java.awt.*;
import javax.swing.*;
public class Exercise_4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("I Dig Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel numberNtext = new JPanel(new BorderLayout());
		numberNtext.add(new JButton("1"), BorderLayout.WEST);
		numberNtext.add(new JTextField("text"), BorderLayout.CENTER);
		JPanel north = new JPanel(new GridLayout(3,1));
		north.add(new JButton("" + 2));
		north.add(numberNtext);
		north.add(new JButton("" + 3));
		
		JPanel horizontal = new JPanel(new BorderLayout());
		horizontal.add(new JButton("5"), BorderLayout.SOUTH);
		JPanel block = new JPanel(new FlowLayout());
		block.add(new JButton("6"));
		block.add(new JButton("7"));
		JPanel moveUp = new JPanel(new BorderLayout());
		moveUp.add(block, BorderLayout.NORTH);
		JPanel center = new JPanel(new GridLayout(2,2));
		center.add(new JButton("4"));
		center.add(horizontal);
		center.add(moveUp);
		center.add(new JButton("8"));
		
		JPanel south = new JPanel(new BorderLayout());
		south.add(new JLabel("Pretty tricky!"), BorderLayout.WEST);
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(center, BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
