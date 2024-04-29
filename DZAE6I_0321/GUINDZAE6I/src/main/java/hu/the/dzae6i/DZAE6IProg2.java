package hu.the.dzae6i;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class DZAE6IProg2 extends JFrame {
    
    public void display() {
        JFrame frame = new JFrame("DZAE6I");

        JPanel panel = new JPanel();
        panel.add(new JLabel("DZAE6I"));
        
        frame.add(panel);

        frame.setSize(400, 300);
        //frmae.setSize(pack());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
