import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*; // for action events

public class AllComponents {
	public static void main(String[] args) throws IOException {
		Image icon = ImageIO.read(new File("user.png"));
		JFrame frame = new JFrame();
		frame.setSize(350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon);
		frame.setTitle("Scarlet Nguyen");
		frame.setLocation(new Point(50, 50));
		frame.setLayout(new FlowLayout());
		frame.getContentPane().setBackground(new Color(71,255,221));
		
		JButton button1 = new JButton();
		button1.setText("I'm a button.");
		button1.setBackground(Color.BLUE);
		button1.addActionListener(new MessageListener());
		frame.add(button1);
		
		JButton button2 = new JButton("The Second Button");
		button2.setBackground(Color.YELLOW);
		frame.add(button2);
		
		JTextField textfield = new JTextField(8);
		textfield.setLocation(100, 200);
		textfield.setSize(200, 50);
		frame.add(textfield);
		
		JLabel label = new JLabel("This is a label");
		frame.add(label);
		
		frame.pack();//resizes the frame exactly to fit their contents
		frame.setVisible(true);
	}
}
