package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DZAE6IProg18 extends JFrame implements ActionListener {
    
    private Color backgroundColor = Color.WHITE;
    private Color drawColor = Color.BLACK;
    
    public DZAE6IProg18() {
        setTitle("PTI");
        setSize(500, 500);
        //getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton buttonDraw = new JButton("Draw");
        buttonDraw.addActionListener(this);
        getContentPane().add(buttonDraw, BorderLayout.SOUTH);
        
        JButton buttonBackGroundColor = new JButton("SetBackgroundColor");
        buttonBackGroundColor.addActionListener(this);
        getContentPane().add(buttonBackGroundColor, BorderLayout.SOUTH);
        
        JButton buttonDrawColor = new JButton("SetLineColor");
        buttonDrawColor.addActionListener(this);
        getContentPane().add(buttonDrawColor, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // White rectangle as a background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg18();
            }
        });
    }
    
}
