package hu.the.dzae6i;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DZAE6IProg4{
    
    public void display() {
        JFrame frame = new JFrame("DZAE6I");
        
        frame.setBounds(20, 20, 400, 300);
        frame.getContentPane().setLayout(null);
        
        JLabel label = new JLabel("Hi there DZAE6I!!!");
        frame.getContentPane().add(label);
        
        label.setBounds(40, 40, 100, 20);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}