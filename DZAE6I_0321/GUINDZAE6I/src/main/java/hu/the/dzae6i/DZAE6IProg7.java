package hu.the.dzae6i;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DZAE6IProg7 extends JFrame {
    
    public void display() {
        setTitle("Veres");
        setSize(400, 300);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        
        Font font1 = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 24);
        Font font2 = new Font(Font.SERIF, Font.BOLD, 18);
        Font font3 = new Font(Font.SERIF, Font.PLAIN, 14);
        
        JLabel label1 = new JLabel("Programtervező informatiku 2024");
        label1.setFont(font1);
        label1.setForeground(Color.BLUE);
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(label1);
        label1.setBounds(40, 40, 200, 20);
        
        JLabel label2 = new JLabel("Programtervező informatiku 2024");
        label2.setFont(font2);
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(label2);
        label2.setBounds(40, 70, 200, 20);
        
        JLabel label3 = new JLabel("Programtervező informatiku 2024");
        label3.setFont(font3);
        label3.setForeground(Color.RED);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(label3);
        label3.setBounds(40, 100, 200, 20);
        
        add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        DZAE6IProg7 frame = new DZAE6IProg7();
        frame.display();
    }
    
}
