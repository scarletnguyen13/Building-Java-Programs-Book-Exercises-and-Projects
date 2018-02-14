import javax.swing.*; // for GUI components

public class GUIsTests {
	public static void main(String[] args) {
		//read the user's name graphically
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		//ask user a yes/no question
		int choice = JOptionPane.showConfirmDialog(null, name + ", do you like cake?");
		//show different responses depends on the answer
		if (choice == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Send Nudes");
		} else { // JOptionPane.NO_OPTION
			JOptionPane.showMessageDialog(null, "We'll have to agree to disagree.");
		}
	}
}
