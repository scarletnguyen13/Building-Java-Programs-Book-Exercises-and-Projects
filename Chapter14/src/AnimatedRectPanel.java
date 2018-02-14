import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AnimatedRectPanel extends JPanel implements ActionListener{
	private Point p1, p2;
	private int dx, dy;
	
	public AnimatedRectPanel() {
		p1 = new Point(20,40);
		p2 = new Point(60,10);
		dx = 5 ; dy = 5;
		
		// set up timer to animate rectangles every 100 ms
		Timer time = new Timer(50,this);
		time.start();
	}
	
	// draws two rectangles on this panel on the screen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(p1.x, p1.y, 70, 30);
		g.setColor(Color.BLUE);
		g.fillRect(p2.x, p2.y, 20, 80);
	}
	
	// called at regular intervals by timer to redraw the panel
	public void actionPerformed(ActionEvent event) {
		p1.x += dx;
		p2.y += dy;
		
		if (p1.x <= 0 || p1.x + 70 >= getWidth()) {
			dx = -dx; // rectangle 1 has hit left/right edge
		}
		if (p2.y <= 0 || p2.y + 80 >= getHeight()) {
			dy = -dy; // rectangle 2 has hit top/bottom edge
		}
		repaint(); // instruct the panel to redraw itself
	}
}
