import java.awt.*;

public class Draw7 {
	public static void main(String [] args) {
		DrawingPanel panel = new DrawingPanel(200,200);
		Graphics g = panel.getGraphics();
		for (int i = 0; i < 20; i++) {
			g.drawOval(i * 10, i * 10, 200 - i*10, 200 - i*10);
		}
	}
}