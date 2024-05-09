package hu.the.dzae6i;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DZAE6I_Szamologep extends JFrame {
    
    public DZAE6I_Szamologep() {
        setTitle("Calculator - DZAE6I");
        setSize(400, 600);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DZAE6I_Szamologep dzaE6I_Szamologep = new DZAE6I_Szamologep();
            }
        });
    }
    
}
