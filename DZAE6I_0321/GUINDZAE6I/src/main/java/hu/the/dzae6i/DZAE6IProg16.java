package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;

public class DZAE6IProg16 extends JFrame {
    
    public DZAE6IProg16() {
        setTitle("PTI");
        setSize(300, 250);
        //getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // White rectangle as a background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Red allipses and circle
        g2d.setColor(Color.RED);
        //g2d.drawOval(50, 50, 100, 150);
        g2d.fillOval(20, 40, 35, 50);
        g2d.fillOval(70, 40, 50, 35);
        g2d.fillOval(150, 40, 35, 35);
        
        // Quarter circle 1
        g2d.fillOval(20, 120, 35, 35);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(20, 120, 35 / 2, 35);
        g2d.fillRect(20, 120 + (35 / 2), 35, 35 / 2);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg16();
            }
        });
    }
    
}
