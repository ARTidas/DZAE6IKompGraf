package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DZAE6IProg12 extends JFrame {

    public DZAE6IProg12() {
        setTitle("PTI");
        setSize(400, 200);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create the input field
        JTextField inputField = new JTextField(10);
        
        // Create Button to close the window
        JButton closeButton = new JButton("Exit");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the window
            }
        });
        
        // Button to double the input value
        JButton doubleButton = new JButton("Double");
        doubleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    inputField.setText(String.valueOf(value * 2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Could not interpret valid INTEGER number!");
                }
            }
        });

        // Add components in order
        add(closeButton);
        add(doubleButton);
        add(inputField);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg12();
            }
        });
    }
}
