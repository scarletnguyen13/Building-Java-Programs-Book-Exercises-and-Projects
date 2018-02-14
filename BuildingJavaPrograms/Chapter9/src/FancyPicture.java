// Draws a picture of rotating squares using Graphics2D.

 import java.awt.*;

 public class FancyPicture {
	 public static void main(String[] args) {
		 DrawingPanel panel = new DrawingPanel(250, 220);
		 Graphics2D g2 = panel.getGraphics();
		 g2.translate(100, 120);
		 g2.fillRect(-5, -5, 10, 10);
		
		 for (int i = 0; i <= 12; i++) {
			 g2.setColor(Color.BLUE);
			 g2.fillRect(20, 20, 20, 20);
			
			 g2.setColor(Color.BLACK);
			 g2.drawString("" + i, 20, 20);
			
			 g2.rotate(Math.toRadians(30));
			 g2.scale(1.1, 1.1);
		 }
	 }
 }
