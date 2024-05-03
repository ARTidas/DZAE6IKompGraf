package hu.the.dzae6i;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Stroke;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class KomGrafDZAE6I extends JFrame {
    
    private static final int CANVAS_WIDTH       = 1400;
    private static final int CANVAS_HEIGHT      = 700;
    private static final Color LOGO_COLOR       = new Color(187, 187, 187); // 187=#b
    private static final Color TEXT_COLOR       = new Color(51, 51, 51); // 51=#3
    private static final int CIRCLE_RADIUS      = CANVAS_WIDTH / 14;
    private static final int FONT_SIZE          = CANVAS_WIDTH / 20;
    private static final String TEXT_LINE_1     = "University of Tokaj";
    private static final String TEXT_LINE_2     = "Drone Technology Research Center";
    
    public KomGrafDZAE6I() throws IOException {
        setTitle(TEXT_LINE_1 + " - " + TEXT_LINE_2);
        setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        try {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            
            g2d.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
            
            // Image
            // https://www.tabnine.com/code/java/methods/java.awt.Graphics2D/drawImage
            BufferedImage image = ImageIO.read(
                new File(
                    "C:\\VZGit\\DZAE6IKompGraf\\KompGrafDZAE6I\\KomGrafDZAE6I\\src\\main\\java\\images\\logo_large.png"
                )
            );
            g2d.drawImage(
                image, 
                (int) ((CANVAS_WIDTH / 2) - (CANVAS_WIDTH / 5 / 2)), 
                (int) (CANVAS_HEIGHT / 15),
                (int) (CANVAS_WIDTH / 5),
                (int) (CANVAS_HEIGHT / 5),
                null
            );
            
            // Circle
            g2d.setColor(LOGO_COLOR);
            g2d.fillOval(
                (CANVAS_WIDTH / 2) - CIRCLE_RADIUS,
                (CANVAS_HEIGHT / 2) - CIRCLE_RADIUS,
                2 * CIRCLE_RADIUS,
                2 * CIRCLE_RADIUS
            );
            
            // Triangle
            Path2D.Double triangle = new Path2D.Double();
            triangle.moveTo(CANVAS_WIDTH / 2 - CIRCLE_RADIUS, CANVAS_HEIGHT / 2);
            triangle.lineTo(CANVAS_WIDTH / 2 + CIRCLE_RADIUS, CANVAS_HEIGHT / 2);
            triangle.lineTo(CANVAS_WIDTH / 2, CANVAS_HEIGHT - CIRCLE_RADIUS * 0.6);
            triangle.closePath();
            g2d.fill(triangle);
            
            // https://www.codejava.net/java-se/graphics/drawing-lines-examples-with-graphics2d
            Stroke stroke = new BasicStroke(
                CIRCLE_RADIUS / 2,
                BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_MITER
            );
            g2d.setStroke(stroke);
            // Right wing
            for (int i = 0; i < 3; i++) {
                g2d.drawLine(
                    (int) ((CANVAS_WIDTH / 2) - (CIRCLE_RADIUS * 1.3)),
                    (int) ((CANVAS_HEIGHT / 2) + (CIRCLE_RADIUS * i * 0.6) - (CIRCLE_RADIUS * 0.8)),
                    (int) ((CANVAS_WIDTH / 2) - (CIRCLE_RADIUS * 14 / 2.5)),
                    (int) (CIRCLE_RADIUS * i * 0.6) + (CIRCLE_RADIUS)
                );
            }
            
            // Left wing
            for (int i = 0; i < 3; i++) {
                g2d.drawLine(
                    (int) ((CANVAS_WIDTH / 2) + (CIRCLE_RADIUS * 1.3)),
                    (int) ((CANVAS_HEIGHT / 2) + (CIRCLE_RADIUS * i * 0.6) - (CIRCLE_RADIUS * 0.8)),
                    (int) ((CANVAS_WIDTH / 2) + (CIRCLE_RADIUS * 14 / 2.5)),
                    (int) (CIRCLE_RADIUS * i * 0.6) + (CIRCLE_RADIUS)
                );
            }
            
            // Importing a TrueType font (TTF):
            // https://stackoverflow.com/questions/8364787/how-do-you-import-a-font/8365030#8365030
            // https://fonts.google.com/share?selection.family=Courier+Prime:ital,wght@0,400;0,700;1,400;1,700
            // https://stackoverflow.com/questions/5652344/how-can-i-use-a-custom-font-in-java
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Font custom_font = Font.createFont(
                Font.TRUETYPE_FONT,
                new File(
                    "C:\\VZGit\\DZAE6IKompGraf\\KompGrafDZAE6I\\KomGrafDZAE6I\\src\\main\\java\\hu\\the\\dzae6i\\fonts\\courier\\CourierPrime-Bold.ttf"
                )
            ).deriveFont((float) FONT_SIZE);
            ge.registerFont(custom_font);
            
            // Text line 1
            g2d.setColor(TEXT_COLOR);
            // https://stackoverflow.com/questions/58788684/having-a-problem-in-changing-font-in-java
            // g2d.setFont(new Font("Courier", Font.BOLD, FONT_SIZE)); // This did not worked...
            g2d.setFont(custom_font);
            g2d.drawString(
                TEXT_LINE_1,
                CANVAS_WIDTH / 2 - g2d.getFontMetrics().stringWidth(TEXT_LINE_1) / 2,
                FONT_SIZE * 3
            );
            
            // Text line 2
            g2d.drawString(
                TEXT_LINE_2,
                CANVAS_WIDTH / 2 - g2d.getFontMetrics().stringWidth(TEXT_LINE_2) / 2,
                CANVAS_HEIGHT - FONT_SIZE * 3
            );
        } catch (FontFormatException | IOException exception) {
            Logger.getLogger(
                    KomGrafDZAE6I.class.getName()
                ).log(
                    Level.SEVERE, 
                    null, 
                    exception
                );
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    KomGrafDZAE6I dzae6i_task2 = new KomGrafDZAE6I();
                }
                catch (IOException ex) {
                    Logger.getLogger(
                            KomGrafDZAE6I.class.getName()
                        ).log(
                            Level.SEVERE,
                            null,
                            ex
                        );
                }
            }
        });
    }

}
