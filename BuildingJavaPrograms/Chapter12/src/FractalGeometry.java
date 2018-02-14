import java.awt.*;
import java.util.Random;

public class FractalGeometry {
	public static void main(String[] args) {
		 DrawingPanel panel = new DrawingPanel(1000, 1000);
		 randomBackgroundGenerator(panel);
		 Graphics g = panel.getGraphics();
		 Point p1 = new Point(471,100);
		 Point p2 = new Point(150,600);
		 Point p3 = new Point(792,600);
		 drawFigure(7,g,p1,p2,p3);
	 }
	
	public static void drawFigure(int level, Graphics g,
			Point p1, Point p2, Point p3) {
		randomColorGenerator(g);
		if (level == 1) {
			// base case: simple triangle
			Polygon p = new Polygon();
			p.addPoint(p1.x, p1.y);
			p.addPoint(p2.x, p2.y);
			p.addPoint(p3.x, p3.y);
			g.fillPolygon(p);
		} else {
			// recursive case, split into 3 triangles
			Point p4 = midpoint(p1, p2);
			Point p5 = midpoint(p2, p3);
			Point p6 = midpoint(p1, p3);
			// recurse on 3 triangular areas
			drawFigure(level - 1, g, p1, p4, p6);
			drawFigure(level - 1, g, p4, p2, p5);
			drawFigure(level - 1, g, p6, p5, p3);
		}
	}
	
	public static Point midpoint(Point p1, Point p2) {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}
	
	public static void randomColorGenerator(Graphics g) {
		Random rand = new Random();
		int a = rand.nextInt(255) + 1;
		int b = rand.nextInt(255) + 1;
		int c = rand.nextInt(255) + 1;
		g.setColor(new Color(a,b,c));
	}
	
	public static void randomBackgroundGenerator(DrawingPanel panel) {
		Random rand = new Random();
		 int a = rand.nextInt(101);
		 if (a % 2 == 0) {
			 panel.setBackground(new Color(0, 0, 0)); // black
		 } else {
			 panel.setBackground(new Color(255, 255, 255)); // white
		 }
	}
}
