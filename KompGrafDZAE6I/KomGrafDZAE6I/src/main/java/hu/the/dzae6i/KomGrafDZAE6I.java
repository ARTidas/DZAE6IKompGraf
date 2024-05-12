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
    private static final int LINE_START_HEIGHT      = (CANVAS_HEIGHT / 10);
    private static final double SCALE_FACTOR        = 0.9;
    private static final int END_FACTOR             = (int) (LINE_START_HEIGHT / 3);
    private static final int BRANCH_COUNT           = 3;
    private static final int FRACTAL_ANGLE_WIDTH    = 90;
    
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
        //g2d.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

        int start_x = (int) (CANVAS_WIDTH / 2);
        int start_y = (int) (CANVAS_HEIGHT / 2);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        
        drawFractal(
            0,
            start_x,
            start_y,
            LINE_START_HEIGHT,
            Math.toRadians(FRACTAL_ANGLE_WIDTH / BRANCH_COUNT)
        );
    }
    
    private void drawFractal(
        int iteration,
        int start_x,
        int start_y,
        int length,
        double angle
    ) {
        if (length < END_FACTOR || iteration > 1) {
            return;
        }
        int next_x = start_x;
        int next_y = start_y - length;

        for (int i = 1; i <= BRANCH_COUNT; i++) {
            double next_angle = Math.toRadians(angle + (i * FRACTAL_ANGLE_WIDTH / (BRANCH_COUNT - 1)));

            g2d.rotate(
                next_angle,
                start_x,
                start_y
            );

            g2d.drawLine(
                start_x,
                start_y,
                next_x,
                next_y
            );
            
            drawFractal(
                ++iteration,
                next_x,
                next_y,
                (int) (length * SCALE_FACTOR),
                next_angle
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
