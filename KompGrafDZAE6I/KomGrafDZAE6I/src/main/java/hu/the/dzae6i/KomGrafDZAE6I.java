package hu.the.dzae6i;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class KomGrafDZAE6I extends JFrame {

    private static final int CANVAS_HEIGHT = 700;
    private static final int CANVAS_WIDTH = (int) (CANVAS_HEIGHT / 1.5);
    
    public KomGrafDZAE6I() {
        setTitle("Drone Tabloid - Zoltan Veres (DZAE6I)");
        setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) getGraphics();
        g2d.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    KomGrafDZAE6I tabloid = new KomGrafDZAE6I();
                }
                catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });
    }

}
