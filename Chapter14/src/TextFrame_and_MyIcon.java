import java.awt.*;
import javax.swing.*;
import java.awt.image.*; // for BufferedImage
import javax.swing.event.*; // for mouse events

public class TextFrame_and_MyIcon {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Text Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		//5 lines tall and 20 letters wide
		JTextArea area = new JTextArea(5,20); 
		area.setFont(new Font("Serif", Font.BOLD, 14));
		frame.add(area);
		// use scrollbars on this text area
		frame.add(new JScrollPane(area));
		
		// create a book icon for this button
		JButton button = new JButton();
		button.setIcon(new ImageIcon("book.gif"));
		frame.add(button);
		
		//create my own icon 
		JButton button2 = new JButton();
		button.setText("My drawing");
		// create a shape image icon for this button
		BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
		g.setColor(Color.YELLOW);
		g.fillRect(10, 20, 80, 70);
		g.setColor(Color.RED);
		g.fillOval(40, 50, 25, 25);
		ImageIcon icon = new ImageIcon(image);
		button2.setIcon(icon);
		frame.add(button2);
		
		//set Icon for frame
		frame.setIconImage(image);
		
		frame.pack();
		frame.setVisible(true);
	}
}
