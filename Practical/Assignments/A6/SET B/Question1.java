import java.io.*;
import javax.swing.*;

public class Question1 {
	public static void main(String arg[]) {
		String fonts[] = { "Arial", "Bell-C", "Archway", "Ballon", "Beach Bold", "Atilla Normal" };
		JComboBox l1 = new JComboBox(fonts);

		String sizes[] = { "10", "12", "14", "16", "18", "20", "22", "24", "26" };
		JComboBox l2 = new JComboBox(sizes);

		JFrame f = new JFrame();

		JTextArea t1 = new JTextArea();

		JLabel a1 = new JLabel("Font");
		JLabel a2 = new JLabel("Style");
		JLabel a3 = new JLabel("Size");

		JCheckBox c1 = new JCheckBox("Bold");
		JCheckBox c2 = new JCheckBox("Italic");
		JCheckBox c3 = new JCheckBox("Underline");

		l1.setBounds(10, 35, 100, 30);
		a1.setBounds(10, 10, 100, 30);
		a2.setBounds(160, 10, 100, 30);
		c1.setBounds(160, 35, 100, 30);
		c2.setBounds(160, 60, 100, 30);
		c3.setBounds(160, 85, 100, 30);
		a3.setBounds(10, 85, 100, 30);
		l2.setBounds(10, 110, 100, 30);
		t1.setBounds(10, 150, 235, 30);
		l1.setSelectedIndex(0);
		l2.setSelectedIndex(0);

		f.add(l1);
		f.add(a1);
		f.add(a2);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(a3);
		f.add(l2);
		f.add(t1);

		f.setSize(270, 270);
		f.setLayout(null);
		f.setVisible(true);

	}
}