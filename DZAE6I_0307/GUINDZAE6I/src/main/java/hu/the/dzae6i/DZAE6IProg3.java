package hu.the.dzae6i;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

import java.awt.FlowLayout;
public class DZAE6IProg3 extends JFrame{
    public void display() {
        JFrame frame = new JFrame("DZAE6I");
        
        frame.setLayout(new FlowLayout());

        JLabel sign1 = new JLabel("Programtervező Informatikus, PTI");
        JLabel sign2 = new JLabel("Programtervező Informatikus, 2024");
        
        sign1.setBounds(0, 0);
        sign2.setBounds(0, 100);
        
        frame.add(sign1);
        frame.add(sign2);

        frame.setSize(400, 300);
        //frmae.setSize(pack());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
