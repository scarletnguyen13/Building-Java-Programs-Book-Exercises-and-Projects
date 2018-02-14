import java.awt.*;
import javax.swing.*;

public class Exercise_2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Layout Question");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel northGrid = new JPanel(new GridLayout(1,3));
		northGrid.add(new JButton("hi"));
		northGrid.add(new JButton("longname"));
		northGrid.add(new JButton("bye"));
		
		JPanel north = new JPanel(new BorderLayout());
		north.add(new JLabel("Buttons:"),BorderLayout.WEST);
		north.add(northGrid,BorderLayout.CENTER);
		
		JPanel checkbox = new JPanel(new GridLayout(4,1));
		checkbox.add(new JCheckBox("Bold"));
		checkbox.add(new JCheckBox("Italic"));
		checkbox.add(new JCheckBox("Underline"));
		checkbox.add(new JCheckBox("Strikeout"));
		
		JPanel west = new JPanel(new FlowLayout());
		west.add(checkbox);
		
		JPanel smallGrid = new JPanel(new GridLayout(2,2));
		for (int a = 3; a <= 6; a++) {
			smallGrid.add(new JButton("" + a));
		}
		JPanel bigGrid = new JPanel(new GridLayout(2,2));
		bigGrid.add(new JButton("1"));
		bigGrid.add(new JButton("2"));
		bigGrid.add(smallGrid);
		bigGrid.add(new JButton("7"));
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(west, BorderLayout.WEST);
		frame.add(bigGrid, BorderLayout.CENTER);
		frame.add(new JButton("Cancel"), BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
