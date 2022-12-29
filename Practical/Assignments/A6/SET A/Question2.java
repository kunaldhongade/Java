import java.io.*;
import javax.swing.*;

public class Question2 {
	public static void main(String arg[]) {
		JFrame f = new JFrame("Simple Calculator");

		JTextArea input = new JTextArea();
		input.setBounds(10, 10, 220, 30);

		JButton b1 = new JButton("1");
		b1.setBounds(10, 60, 50, 50);

		JButton b2 = new JButton("2");
		b2.setBounds(65, 60, 50, 50);

		JButton b3 = new JButton("3");
		b3.setBounds(120, 60, 50, 50);

		JButton bp = new JButton("+");
		bp.setBounds(175, 60, 50, 50);

		JButton b4 = new JButton("4");
		b4.setBounds(10, 120, 50, 50);

		JButton b5 = new JButton("5");
		b5.setBounds(65, 120, 50, 50);

		JButton b6 = new JButton("6");
		b6.setBounds(120, 120, 50, 50);

		JButton bn = new JButton("-");
		bn.setBounds(175, 120, 50, 50);

		JButton b7 = new JButton("7");
		b7.setBounds(10, 180, 50, 50);

		JButton b8 = new JButton("8");
		b8.setBounds(65, 180, 50, 50);

		JButton b9 = new JButton("9");
		b9.setBounds(120, 180, 50, 50);

		JButton bm = new JButton("*");
		bm.setBounds(175, 180, 50, 50);

		JButton b0 = new JButton("0");
		b0.setBounds(10, 240, 50, 50);

		JButton bd = new JButton(".");
		bd.setBounds(65, 240, 50, 50);

		JButton be = new JButton("=");
		be.setBounds(120, 240, 50, 50);

		JButton bdi = new JButton("/");
		bdi.setBounds(175, 240, 50, 50);

		f.add(input);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bp);

		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bn);

		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bm);

		f.add(b0);
		f.add(bd);
		f.add(be);
		f.add(bdi);

		f.setSize(250, 350);
		f.setLayout(null);
		f.setVisible(true);
	}
}