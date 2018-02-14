import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.MouseInputAdapter;

public class TestStatusBar extends MouseInputAdapter{
	public static void main(String[] args) {
		TestStatusBar test = new TestStatusBar();
	}
	
	//Field
	private JFrame frame;
	private JPanel statusPanel;
	private JLabel statusLabel;
	
	public TestStatusBar() {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setSize(200, 200);

		// create the status bar panel and shove it down the bottom of the frame
		statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		frame.add(statusPanel, BorderLayout.SOUTH);
		statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		
		statusLabel = new JLabel("status");
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		// attach listener to observe mouse movement
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		
		statusPanel.add(statusLabel);

		frame.setVisible(true);
	}
	
	public void mouseMoved(MouseEvent event) {
		statusLabel.setText("(" + event.getX() + ", " + event.getY() + ")");
	}
}
