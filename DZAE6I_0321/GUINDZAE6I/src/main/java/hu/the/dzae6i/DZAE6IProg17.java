package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;

public class DZAE6IProg17 extends JFrame {
    
    public DZAE6IProg17() {
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

        g2d.setColor(Color.RED);
        int rays = 20;
        for (int i = 0; i < rays; i++) {
            g2d.drawLine(
                0, 
                0, 
                (getWidth() / rays) * i, 
                getHeight()
            );
        }
        
        g2d.setColor(Color.BLUE);
        for (int i = 0; i < rays; i++) {
            g2d.drawLine(
                getWidth(), 
                0, 
                (getWidth() / rays) * i, 
                getHeight()
            );
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg17();
            }
        });
    }
    
}
