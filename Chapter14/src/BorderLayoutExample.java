import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(210, 200));
		frame.setTitle("Run for the border");
		
		frame.setLayout(new BorderLayout());
		frame.add(new JButton("north"), BorderLayout.NORTH);
		frame.add(new JButton("south"), BorderLayout.SOUTH);
		frame.add(new JButton("west"), BorderLayout.WEST);
		frame.add(new JButton("east"), BorderLayout.EAST);
		frame.add(new JButton("center"), BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}
