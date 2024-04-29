package hu.the.dzae6i;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DZAE6IProg6 extends JFrame implements ActionListener {
    
    public DZAE6IProg6() {
        setTitle("DZAE6I");
        setBounds(20, 20, 400, 300);
        getContentPane().setLayout(null);
        
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(20, 20, 100, 30);
        closeButton.addActionListener(this); // Add action listener to the button
        getContentPane().add(closeButton);
        
        JButton changeNameButton = new JButton("Change Name");
        changeNameButton.setBounds(20, 60, 150, 30);
        changeNameButton.addActionListener(this); // Add action listener to the button
        getContentPane().add(changeNameButton);
        
        JButton changeBackButton = new JButton("Change Back");
        changeBackButton.setBounds(20, 100, 150, 30);
        changeBackButton.addActionListener(this); // Add action listener to the button
        getContentPane().add(changeBackButton);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.equals("Close")) {
            dispose(); // Close the frame
        } else if (command.equals("Change Name")) {
            setTitle("New Frame Name"); // Change the frame name
        } else if (command.equals("Change Back")) {
            setTitle("DZAE6I"); // Change back the frame name
        }
    }
    
}
