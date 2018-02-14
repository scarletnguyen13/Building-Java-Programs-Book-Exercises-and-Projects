// A panel that draws two rectangles on its surface.

import java.awt.*;
import javax.swing.*;

public class RectPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call JPanel's version

		g.setColor(Color.RED);
		g.fillRect(20, 40, 70, 30);
		g.setColor(Color.BLUE);
		g.fillRect(60, 10, 20, 80);
	}
}