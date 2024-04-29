package hu.the.dzae6i;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DZAE6IProg8 extends JFrame {
    
    public void display() {
        setTitle("DZAE6I-Színek");
        setSize(400, 300);
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        getContentPane().setBackground(Color.YELLOW);
        
        JPanel square1 = createSquare(Color.RED);
        JPanel square2 = createSquare(Color.MAGENTA);
        JPanel square3 = createSquare(Color.CYAN);
        
        add(square1);
        add(square2);
        add(square3);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private JPanel createSquare(Color color) {
        JPanel square = new JPanel();
        square.setPreferredSize(new Dimension(50, 50));
        square.setBackground(color);
        
        return square;
    }
    
    public static void main(String[] args) {
        DZAE6IProg7 frame = new DZAE6IProg7();
        frame.display();
    }
    
}
