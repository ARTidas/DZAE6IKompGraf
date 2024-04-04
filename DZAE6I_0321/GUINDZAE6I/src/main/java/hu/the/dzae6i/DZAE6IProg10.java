package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DZAE6IProg10 extends JFrame {

    public DZAE6IProg10() {
        setTitle("GUI Example");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("String:");
        add(label);

        JTextField textField = new JTextField(15);
        textField.setForeground(Color.RED);
        add(textField);

        JButton clearButton = new JButton("Clear");
        add(clearButton);
        
        JRadioButton blueRadioButton = new JRadioButton("Blue");
        JRadioButton redRadioButton = new JRadioButton("Red");
        JRadioButton lowerCaseRadioButton = new JRadioButton("LowerCase");
        JRadioButton upperCaseRadioButton = new JRadioButton("UpperCase");
        
        add(blueRadioButton);
        add(redRadioButton);
        add(lowerCaseRadioButton);
        add(upperCaseRadioButton);
        
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(blueRadioButton);
        colorGroup.add(redRadioButton);
        
        ButtonGroup caseGroup = new ButtonGroup();
        caseGroup.add(lowerCaseRadioButton);
        caseGroup.add(upperCaseRadioButton);
        
        blueRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.BLUE);
            }
        });

        redRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.RED);
            }
        });

        // ActionListener for case radio buttons
        lowerCaseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toLowerCase());
            }
        });

        upperCaseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toUpperCase());
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg9();
            }
        });
    }
}
