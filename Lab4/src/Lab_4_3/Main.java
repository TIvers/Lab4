package Lab_4_3;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Это моё окно");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		
		frame.add(panel, BorderLayout.NORTH);
		
		JCheckBox check = new JCheckBox("Не использовать данные по умолчанию");
		JTextField name = new JTextField("Введите имя:");
		JTextField sname = new JTextField("Введите фамилию:");
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton mrb = new JRadioButton("Мужской");
		JRadioButton frb = new JRadioButton("Женский");
		group.add(mrb);
		group.add(frb);
		
		panel.add(check);
		panel.add(name);
		panel.add(sname);
		panel.add(mrb);
		panel.add(frb);
		
		CheckListener listener = new CheckListener();
		listener.components.add(name);
		listener.components.add(sname);
		listener.components.add(mrb);
		listener.components.add(frb);
		check.addActionListener(listener);
		frame.setVisible(true);

	}

}
