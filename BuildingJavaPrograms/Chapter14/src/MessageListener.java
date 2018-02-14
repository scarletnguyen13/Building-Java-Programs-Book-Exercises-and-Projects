import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageListener implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "You clicked the button!");
	}
}
