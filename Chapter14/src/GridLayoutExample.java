import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {
public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		// 2 rows, 3 columns
		frame.setLayout(new GridLayout(2, 3));
		for (int i = 1; i <= 6; i++) {
			frame.add(new JButton("Button " + i));
		}
		
		frame.pack();
		frame.setVisible(true);
	}
}
