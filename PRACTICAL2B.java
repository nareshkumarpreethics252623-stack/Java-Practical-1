/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractgui2b;

/**
 *
 * @author IT-37
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Interface
interface Payment {
    void pay(double amount);
    String showPaymentMode();
}

// Credit Card Implementation
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        // Method implementation
    }

    @Override
    public String showPaymentMode() {
        return "Credit Card";
    }
}

// UPI Implementation
class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        // Method implementation
    }

    @Override
    public String showPaymentMode() {
        return "UPI";
    }
}

// Main GUI Class
public class PRACTICAL2B extends JFrame implements ActionListener {

    JLabel lblAmount, lblMode, lblResult;
    JTextField txtAmount;
    JComboBox<String> cmbMode;
    JButton btnPay;

    public PRACTICAL2B() {

        setTitle("Interface Demo - Payment System");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblAmount = new JLabel("Enter Amount:");
        txtAmount = new JTextField(15);

        lblMode = new JLabel("Select Payment Mode:");

        String modes[] = {"Credit Card", "UPI"};
        cmbMode = new JComboBox<>(modes);

        btnPay = new JButton("Pay");

        lblResult = new JLabel("Result: ");

        add(lblAmount);
        add(txtAmount);

        add(lblMode);
        add(cmbMode);

        add(btnPay);

        add(lblResult);

        btnPay.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double amount;

        try {
            amount = Double.parseDouble(txtAmount.getText());

            Payment payment;

            if (cmbMode.getSelectedItem().equals("Credit Card")) {
                payment = new CreditCardPayment();
            } else {
                payment = new UpiPayment();
            }

            payment.pay(amount);

            lblResult.setText("<html>Payment Mode: "
                    + payment.showPaymentMode()
                    + "<br>Paid Rs. "
                    + amount
                    + "</html>");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid amount.");
        }
    }

    public static void main(String[] args) {
        new PRACTICAL2B();
    }
}
