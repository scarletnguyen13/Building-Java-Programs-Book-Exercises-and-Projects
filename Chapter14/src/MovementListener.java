// Responds to a mouse event by showing a message dialog.

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MovementListener extends MouseInputAdapter {
	public void mouseEntered(MouseEvent event) {
		JOptionPane.showMessageDialog(null, "Mouse entered!");
	}
}