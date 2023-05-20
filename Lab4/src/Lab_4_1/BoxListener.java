package Lab_4_1;
import java.awt.event.*;
import javax.swing.*;

public class BoxListener implements ActionListener {

	private JComboBox<String> box;
	private JTextArea area;
	
	BoxListener(JComboBox<String> box, JTextArea area) {
		this.box = box;
		this.area = area;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int index = box.getSelectedIndex();
		area.setText(CountryInformation.INFORMATION[index]);		
	}

}
