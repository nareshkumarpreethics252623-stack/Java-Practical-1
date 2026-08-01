package prac5;
import javax.swing.*;
import java.awt.*;

public class PRAC5 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Student Resume Form");
        f.setSize(500, 650);
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(173, 216, 230));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 25);
        l1.setForeground(Color.BLUE);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 250, 25);

        // Address
        JLabel l2 = new JLabel("Address:");
        l2.setBounds(30, 70, 100, 25);
        l2.setForeground(Color.BLUE);

        JTextArea ta = new JTextArea();
        ta.setBackground(new Color(255, 255, 204)); 
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(150, 70, 250, 60);

        // Gender
        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(30, 150, 100, 25);
        l3.setForeground(Color.BLUE);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(150, 150, 80, 25);
        r2.setBounds(240, 150, 100, 25);

        r1.setBackground(new Color(173, 216, 230));
        r2.setBackground(new Color(173, 216, 230));

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // Qualification
        JLabel l4 = new JLabel("Qualification:");
        l4.setBounds(30, 190, 100, 25);
        l4.setForeground(Color.BLUE);

        String qual[] = {"B.Sc", "BCA", "B.Tech", "MCA", "M.Sc"};
        JComboBox<String> cb = new JComboBox<>(qual);
        cb.setBounds(150, 190, 150, 25);

        // Skills
        JLabel l5 = new JLabel("Skills:");
        l5.setBounds(30, 230, 100, 25);
        l5.setForeground(Color.BLUE);

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("C++");
        JCheckBox c3 = new JCheckBox("Python");

        c1.setBounds(150, 230, 80, 25);
        c2.setBounds(230, 230, 80, 25);
        c3.setBounds(310, 230, 90, 25);

        c1.setBackground(new Color(173, 216, 230));
        c2.setBackground(new Color(173, 216, 230));
        c3.setBackground(new Color(173, 216, 230));

        // Email
        JLabel l6 = new JLabel("Email:");
        l6.setBounds(30, 270, 100, 25);
        l6.setForeground(Color.BLUE);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 270, 250, 25);

        // Mobile
        JLabel l7 = new JLabel("Mobile:");
        l7.setBounds(30, 310, 100, 25);
        l7.setForeground(Color.BLUE);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 310, 250, 25);

        // Career Objective
        JLabel l8 = new JLabel("Career Objective:");
        l8.setBounds(30, 350, 120, 25);
        l8.setForeground(Color.BLUE);

        JTextArea ta2 = new JTextArea();
        ta2.setBackground(new Color(255, 255, 204));
        JScrollPane sp2 = new JScrollPane(ta2);
        sp2.setBounds(150, 350, 250, 80);

        // Buttons
        JButton b1 = new JButton("Submit");
        b1.setBounds(120, 470, 100, 35);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.WHITE);

        JButton b2 = new JButton("Reset");
        b2.setBounds(250, 470, 100, 35);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);

        // Add Components
        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(sp);

        f.add(l3);
        f.add(r1);
        f.add(r2);

        f.add(l4);
        f.add(cb);

        f.add(l5);
        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.add(l6);
        f.add(t2);

        f.add(l7);
        f.add(t3);

        f.add(l8);
        f.add(sp2);

        f.add(b1);
        f.add(b2);

        f.setVisible(true);
    }
}
