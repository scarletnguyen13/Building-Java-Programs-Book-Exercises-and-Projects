// Creates a GUI that resembles an email Compose Message window.

 import java.awt.*;
 import javax.swing.*;

 public class EmailMessage {
	 public static void main(String[] args) {
		 JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(new Dimension(400, 300));
		 frame.setTitle("Send Message");
		 frame.setLayout(new BorderLayout());
		
		 JPanel northWest = new JPanel(new GridLayout(3, 1));
		 northWest.add(new JLabel("From: "));
		 northWest.add(new JLabel("To: "));
		 northWest.add(new JLabel("Subject: "));
		
		 JPanel northCenter = new JPanel(new GridLayout(3, 1));
		 for (int a = 1; a <= 3; a++) {
			 northCenter.add(new JTextField());
		 }
		
		 JPanel northEast = new JPanel(new GridLayout(3, 1));
		 for (int a = 1; a <= 2; a++) {
			 northEast.add(new JButton("Browse..."));
		 }
		
		 JPanel north = new JPanel(new BorderLayout());
		 north.add(northWest, BorderLayout.WEST);
		 north.add(northCenter, BorderLayout.CENTER);
		 north.add(northEast, BorderLayout.EAST);
		
		 JPanel south = new JPanel(new FlowLayout());
		 south.add(new JButton("Send"));
		
		 frame.add(north, BorderLayout.NORTH);
		 frame.add(new JLabel(), BorderLayout.CENTER);
		 frame.add(south, BorderLayout.SOUTH);
		
		 frame.setVisible(true);
	 }
 }