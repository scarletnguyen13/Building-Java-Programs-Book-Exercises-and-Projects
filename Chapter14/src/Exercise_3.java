import java.awt.*;
import javax.swing.*;

public class Exercise_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Midterm on Thursday!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel west = new JPanel();
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		west.add(new JButton("Now Playing"));
		west.add(new JButton("Media Guide"));
		west.add(new JButton("Library"));
		west.add(new JButton("Help & Info"));
		west.add(new JButton("Services"));
		
		JPanel numberGrid = new JPanel(new GridLayout(2,2));
		for (int a = 0; a < 4; a++) {
			numberGrid.add(new JButton("" + a));
		}
		
		JPanel east = new JPanel (new BorderLayout());
		east.add(numberGrid, BorderLayout.NORTH);
		east.add(new JButton("OK"), BorderLayout.CENTER);
		
		JPanel south = new JPanel (new FlowLayout());
		south.add(new JLabel("Movies          "));
		south.add(new JLabel("Music           "));
		south.add(new JLabel("Videos          "));
		south.add(new JLabel("DVD             "));
		south.add(new JLabel("Webpages"));
		
		frame.add(west, BorderLayout.WEST);
		frame.add(east, BorderLayout.EAST);
		frame.add(south, BorderLayout.SOUTH);
		
		//Setup center's area
		JTextArea area = new JTextArea(20,20);
		area.setFont(new Font("Sans-Serif", Font.BOLD, 14));
		frame.add(area, BorderLayout.CENTER);
		frame.add(new JScrollPane(area));
		
		frame.pack();
		frame.setVisible(true);
	}
}
