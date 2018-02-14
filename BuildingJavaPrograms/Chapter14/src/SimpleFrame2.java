import java.awt.*; // for Dimension
import javax.swing.*; // for GUI components

public class SimpleFrame2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new Point(10, 50));
		frame.setSize(new Dimension(300, 120));
		frame.setTitle("A frame");
		frame.setVisible(true);
	}
}