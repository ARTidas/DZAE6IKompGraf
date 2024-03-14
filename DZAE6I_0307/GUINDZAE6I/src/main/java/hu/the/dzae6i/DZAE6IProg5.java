package hu.the.dzae6i;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DZAE6IProg5{
    
    public void display() {
        JFrame frame = new JFrame("DZAE6I");
        
        frame.setBounds(20, 20, 400, 300);
        frame.getContentPane().setLayout(null);
        
        JButton button = new JButton("Click Me!");
        button.setBounds(20, 20, 100, 30);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
        frame.getContentPane().add(button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
