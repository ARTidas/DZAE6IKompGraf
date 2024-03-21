package hu.the.dzae6i;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class DZAE6IProg3 extends JFrame{
    
    public void display() {
        JFrame frame = new JFrame("DZAE6I");
        
        //frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        frame.setSize(400, 300);
        //frmae.setSize(pack());

        JLabel sign1 = new JLabel("Programtervező Informatikus, PTI");
        JLabel sign2 = new JLabel("Programtervező Informatikus, 2024");
        
        frame.add(sign1);
        frame.add(sign2);
        
        sign1.setBounds(
            10, 
            50, 
            sign1.getPreferredSize().width, 
            sign1.getPreferredSize().height
        );
        
        sign2.setBounds(
            10, 
            80, 
            sign2.getPreferredSize().width, 
            sign2.getPreferredSize().height
        );
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}