package hu.the.dzae6i;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.awt.geom.Path2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class KomGrafDZAE6I extends JFrame {

    private static final int CANVAS_HEIGHT      = 700;
    private static final int CANVAS_WIDTH       = (int) (CANVAS_HEIGHT / 1.5);
    private static final String TABLOID_TITLE   = "Drone Tabloid";
    private static final String TABLOID_ISSUE   = "1st issue";
    private static final String TABLOID_OWNER   = "Zoltan Veres (DZAE6I)";
    private static final Color COLOR            = new Color(16, 16, 16);
    private static final int FONT_SIZE          = (int) (CANVAS_WIDTH / 15);
    
    public KomGrafDZAE6I() {
        setTitle(TABLOID_TITLE + " - " + TABLOID_ISSUE + " - " + TABLOID_OWNER);
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
            Font custom_bold_font = Font.createFont(
                Font.TRUETYPE_FONT,
                new File(
                    "KomGrafDZAE6I/src/main/java/hu/the/dzae6i/fonts/courier/CourierPrime-Bold.ttf"
                )
            );
            Font custom_font = Font.createFont(
                Font.TRUETYPE_FONT,
                new File(
                    "KomGrafDZAE6I/src/main/java/hu/the/dzae6i/fonts/courier/CourierPrime-Regular.ttf"
                )
            );
            Font title_font = custom_bold_font.deriveFont((float) FONT_SIZE);
            Font issue_font = custom_font.deriveFont((float) (FONT_SIZE * 0.5));
            Font news_font  = custom_font.deriveFont((float) (FONT_SIZE * 0.4));
            
            ge.registerFont(title_font);

            // Draw tabloid title
            g2d.setColor(COLOR);
            g2d.setFont(title_font);
            g2d.drawString(
                TABLOID_TITLE,
                CANVAS_WIDTH / 2 - g2d.getFontMetrics().stringWidth(TABLOID_TITLE) / 2,
                (int) (FONT_SIZE * 2.5)
            );

            // Draw tabloid issue
            g2d.setColor(COLOR);
            g2d.setFont(issue_font);
            g2d.drawString(
                TABLOID_ISSUE,
                (int) (CANVAS_WIDTH - (g2d.getFontMetrics().stringWidth(TABLOID_ISSUE) * 1.2)),
                (int) (FONT_SIZE * 1.7)
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

            // Separator lines
            Stroke previous_stroke = g2d.getStroke();
            g2d.setStroke(new BasicStroke(3));
            // Title separator
            g2d.drawLine(
                0,
                (int) (FONT_SIZE * 2.6),
                CANVAS_WIDTH,
                (int) (FONT_SIZE * 2.6)
            );
            // Latest news before separator
            g2d.drawLine(
                0,
                CANVAS_HEIGHT / 2,
                CANVAS_WIDTH,
                CANVAS_HEIGHT / 2
            );
            // Latest news after separator
            g2d.drawLine(
                0,
                (int) (CANVAS_HEIGHT / 2 + FONT_SIZE * 3),
                CANVAS_WIDTH,
                (int) (CANVAS_HEIGHT / 2 + FONT_SIZE * 3)
            );
            // Owner separator
            g2d.drawLine(
                0,
                (int) (CANVAS_HEIGHT * 0.95),
                CANVAS_WIDTH,
                (int) (CANVAS_HEIGHT * 0.95)
            );
            g2d.setStroke(previous_stroke);

            // Latest news
            g2d.setColor(COLOR);
            g2d.setFont(title_font);
            g2d.drawString(
                "Latest news",
                10,
                (int) (CANVAS_HEIGHT / 2 + FONT_SIZE)
            );
            g2d.setFont(news_font);
            g2d.drawString(
                "- The University of Tokaj started a new drone tabloid newslet.",
                10,
                (int) (CANVAS_HEIGHT / 2 + FONT_SIZE * 1.5)
            );
            g2d.drawString(
                "- We have a new drone laboratory with 3D printers!",
                10,
                (int) (CANVAS_HEIGHT / 2 + FONT_SIZE * 2)
            );
            g2d.drawString(
                "- Sign up for our new drone pilot engineer classes.",
                10,
                (int) (CANVAS_HEIGHT / 2 + FONT_SIZE * 2.5)
            );

            // Logo drawing contest
            int logo_section_x = (int) (CANVAS_HEIGHT / 2 + FONT_SIZE * 4);
            int logo_height = 175;
            // Logo title
            g2d.setColor(COLOR);
            g2d.setFont(title_font);
            g2d.drawString(
                "Logo drawing contest:",
                10,
                logo_section_x
            );
            // Logo circle
            int circle_radius = (int) (CANVAS_WIDTH / 20);
            Color logo_color = new Color(0, 100, 0);
            g2d.setColor(logo_color);
            g2d.fillOval(
                (CANVAS_WIDTH / 2) - circle_radius,
                (logo_section_x + (CANVAS_WIDTH / 5)) - circle_radius,
                2 * circle_radius,
                2 * circle_radius
            );
            // Logo triangle
            Path2D.Double triangle = new Path2D.Double();
            triangle.moveTo(
                (CANVAS_WIDTH / 2) - circle_radius,
                logo_section_x + logo_height / 2
            );
            triangle.lineTo(
                (CANVAS_WIDTH / 2) + circle_radius,
                logo_section_x + logo_height / 2
            );
            triangle.lineTo(
                CANVAS_WIDTH / 2,
                logo_section_x + logo_height
            );
            triangle.closePath();
            g2d.fill(triangle);

            // Draw tabloid owner
            g2d.setColor(COLOR);
            g2d.setFont(issue_font);
            g2d.drawString(
                "Tabloid owner: " + TABLOID_OWNER,
                10,
                (int) (CANVAS_HEIGHT * 0.98)
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
