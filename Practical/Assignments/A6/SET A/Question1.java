import java.io.*;
import java.util.*;
import javax.swing.*;

public class Question1 {
	public static void main(String arg[]) {

		JFrame p = new JFrame("Demo Application");

		JLabel l1 = new JLabel("User :");
		l1.setBounds(10, 10, 100, 30);
		JTextArea user = new JTextArea();
		user.setBounds(100, 10, 300, 30);

		JLabel l2 = new JLabel("Password :");
		l2.setBounds(10, 60, 100, 30);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100, 60, 300, 30);

		JButton b1 = new JButton("Login");
		b1.setBounds(10, 120, 100, 30);

		JButton b2 = new JButton("Regester");
		b2.setBounds(250, 120, 150, 30);

		p.add(l1);
		p.add(user);
		p.add(l2);
		p.add(pass);
		p.add(b1);
		p.add(b2);

		p.setSize(450, 250);

		p.setLayout(null);
		p.setVisible(true);

	}
}