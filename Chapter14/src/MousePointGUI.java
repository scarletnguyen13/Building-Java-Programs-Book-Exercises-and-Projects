import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

public class MousePointGUI extends MouseInputAdapter{
	public static void main(String[] args) {
		MousePointGUI gui = new MousePointGUI();
	}
	
	//Field
	private JFrame frame;
	private JLabel label;
	
	//Constructor
	public MousePointGUI() {
		label = new JLabel("Move the mouse over me!");
		
		//Listen for mouse event
		label.addMouseListener(this);
		label.addMouseMotionListener(this);
		
		//set up frame
		frame = new JFrame("A frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(label);
		frame.setVisible(true);
	}
	
	public void mouseMoved(MouseEvent event) {
		label.setText("(" + event.getX() + ", " + event.getY() + ")");
	}
}
