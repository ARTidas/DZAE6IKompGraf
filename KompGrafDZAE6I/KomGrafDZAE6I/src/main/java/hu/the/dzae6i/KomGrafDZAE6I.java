package hu.the.dzae6i;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class KomGrafDZAE6I extends JFrame {
    
    private static final int CANVAS_WIDTH           = 1400;
    private static final int CANVAS_HEIGHT          = (CANVAS_WIDTH / 2);
    private static final int MAX_ITERATION_DEPTH    = 16;
    private static final int LINE_START_HEIGHT      = (CANVAS_HEIGHT / 10);
    private static final double SCALE_FACTOR        = 0.98;
    private static final int END_FACTOR             = (LINE_START_HEIGHT / 2);
    private static final int BRANCH_COUNT           = 2;
    private static final double ANGLE_FACTOR        = (Math.PI * 2 / BRANCH_COUNT);
    private static final double ANGLE_DEVIATION     = (Math.PI * 2 / BRANCH_COUNT);
    
    private static Graphics2D g2d;
    
    public KomGrafDZAE6I() {
        setTitle("Drawing fractals - Zoltan Veres (DZAE6I)");
        setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        g2d = (Graphics2D) getGraphics();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g2d.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

        int start_x = (int) (CANVAS_WIDTH / 2);
        int start_y = (int) (CANVAS_HEIGHT);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        
        drawFractal(
            start_x,
            start_y,
            LINE_START_HEIGHT,
            ANGLE_FACTOR,
            0
        );
    }
    
    private void drawFractal(
        int start_x,
        int start_y,
        int length,
        double branch_angle,
        int iteration
    ) {
        if (length < END_FACTOR || iteration > MAX_ITERATION_DEPTH) {
            return;
        }
        
        for (int i = 1; i <= BRANCH_COUNT; i++) {
            double angle = (
                branch_angle + 
                ANGLE_DEVIATION *
                (i) *
                Math.pow(-1, i)
            );
            int next_x = (int) (start_x + length * Math.cos(angle));
            int next_y = start_y - length;
            
            g2d.drawLine(
                start_x,
                start_y,
                next_x,
                next_y
            );
            
            drawFractal(
                next_x,
                next_y,
                (int) (length * SCALE_FACTOR),
                angle,
                ++iteration
            );
        }
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    KomGrafDZAE6I program = new KomGrafDZAE6I();
                }
                catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });
    }

}
