package hu.the.dzae6i;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class KomGrafDZAE6I extends JFrame {

    private static final int CANVAS_HEIGHT = 700;
    private static final int CANVAS_WIDTH = (int) (CANVAS_HEIGHT / 1.5);
    private static final String TABLOID_TITLE = "Drone Tabloid";
    private static final String TABLOID_ISSUE = "1st";
    private static final String TABLOID_OWNER = "Zoltan Veres (DZAE6I)";
    private static final Color COLOR = new Color(16, 16, 16);
    private static final int FONT_SIZE = (int) (CANVAS_WIDTH / 15);
    
    public KomGrafDZAE6I() {
        setTitle(TABLOID_TITLE + " - " + TABLOID_ISSUE + " issue - " + TABLOID_OWNER);
        setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        try {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) getGraphics();
            g2d.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

            // Create and register new TrueType font
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Font custom_font = Font.createFont(
                Font.TRUETYPE_FONT,
                new File(
                    "KomGrafDZAE6I/src/main/java/hu/the/dzae6i/fonts/courier/CourierPrime-Bold.ttf"
                )
            ).deriveFont((float) FONT_SIZE);
            
            ge.registerFont(custom_font);

            // Draw tabloid title
            g2d.setColor(COLOR);
            g2d.setFont(custom_font);
            g2d.drawString(
                TABLOID_TITLE,
                CANVAS_WIDTH / 2 - g2d.getFontMetrics().stringWidth(TABLOID_TITLE) / 2,
                (int) (FONT_SIZE * 2.5)
            );

            // Draw background image
            BufferedImage image = ImageIO.read(
                new File(
                    "KomGrafDZAE6I/src/main/java/images/logo_large.png"
                )
            );
            g2d.drawImage(
                image, 
                (int) (0), 
                (int) (FONT_SIZE * 2.5),
                (int) (CANVAS_WIDTH),
                (int) (CANVAS_HEIGHT * 0.4),
                null
            );
        }
        catch (FontFormatException | IOException exception) {
            exception.printStackTrace();
        }
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
