import java.awt.*;
import javax.swing.*;

public class MouseGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(new Dimension(200, 100));
		frame.setTitle("A frame");
		
		JLabel label = new JLabel();
		label.setText("Move the mouse over me!");
		frame.add(label);
		
		MovementListener mListener = new MovementListener();
		label.addMouseListener(mListener);
		label.addMouseMotionListener(mListener);
		
		frame.setVisible(true);
	}
}
