
package abstractclassgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }


    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 20000;
    }
}

// GUI Class
public class AbstractClassGUI extends JFrame implements ActionListener {

    JLabel lblName, lblType, lblResult;
    JTextField txtName;
    JComboBox<String> cmbType;
    JButton btnCalculate;

    public AbstractClassGUI() {

        setTitle("Abstract Class Demo");
        setSize(400,250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblName = new JLabel("Employee Name:");
        txtName = new JTextField(15);

        lblType = new JLabel("Employee Type:");

        String types[] = {"Full Time", "Part Time"};
        cmbType = new JComboBox<>(types);

        btnCalculate = new JButton("Calculate Salary");

        lblResult = new JLabel("Salary: ");

        add(lblName);
        add(txtName);

        add(lblType);
        add(cmbType);

        add(btnCalculate);
        add(lblResult);

        btnCalculate.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = txtName.getText();

        Employee emp;

        if (cmbType.getSelectedIndex() == 0) {
            emp = new FullTimeEmployee(name);
        } else {
            emp = new PartTimeEmployee(name);
        }

        lblResult.setText(
                "Salary of " + name + " = Rs. " + emp.calculateSalary()
        );
    }

    public static void main(String[] args) {
        new AbstractClassGUI();
    }
}
