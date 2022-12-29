import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Q2 {
    public static void main(String arg[]) {
        JFrame f = new JFrame("Chat Frame");
        JMenuBar m = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save_as = new JMenuItem("Save as");
        JMenuItem save = new JMenuItem("Save");

        JMenuItem report = new JMenuItem("Report");
        JMenuItem contact = new JMenuItem("Contact us");
        JMenuItem restart = new JMenuItem("Restart");

        help.add(report);
        help.add(contact);
        help.add(restart);

        file.add(open);
        file.add(save);
        file.add(save_as);

        m.add(file);
        m.add(help);

        JLabel enter = new JLabel("Enter Text :");

        JTextArea input = new JTextArea();

        JButton send = new JButton("Send");

        JButton reset = new JButton("reset");

        enter.setBounds(10, 210, 80, 20);
        input.setBounds(80, 210, 85, 20);
        send.setBounds(175, 210, 70, 20);
        reset.setBounds(248, 210, 70, 20);

        f.add(m);
        f.add(enter);
        f.add(input);
        f.add(send);
        f.add(reset);

        f.setJMenuBar(m);
        f.setSize(340, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
