package Lab_4_3;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JComponent;

public class CheckListener implements ActionListener {
	public ArrayList<JComponent> components = new ArrayList<JComponent>();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (JComponent comp : components) {
			comp.setEnabled(!comp.isEnabled());
		}
	}
}