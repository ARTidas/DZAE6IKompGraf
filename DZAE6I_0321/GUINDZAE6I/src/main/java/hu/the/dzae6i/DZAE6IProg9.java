package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DZAE6IProg9 extends JFrame {

    public DZAE6IProg9() {
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
        
        JCheckBox blueRedCheckBox = new JCheckBox("Blue / Red");
        add(blueRedCheckBox);
    
        JCheckBox lowerUpperCheckBox = new JCheckBox("LowerCase / UpperCase");
        add(lowerUpperCheckBox);
        
        blueRedCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (blueRedCheckBox.isSelected()) {
                    textField.setForeground(Color.BLUE);
                } else {
                    textField.setForeground(Color.RED);
                }
            }
        });
        
        lowerUpperCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (lowerUpperCheckBox.isSelected()) {
                    textField.setText(text.toUpperCase());
                } else {
                    textField.setText(text.toLowerCase());
                }
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
