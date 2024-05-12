package hu.the.dzae6i;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DZAE6I_2DGrafika extends JFrame {
    BufferedImage image;

    public DZAE6I_2DGrafika() throws IOException {
        setTitle("PTI");
        setSize(600, 500);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.image = ImageIO.read(new File("C:\\VZGit\\DZAE6IKompGraf\\DZAE6I_0321\\GUINDZAE6I\\src\\main\\java\\hu\\the\\dzae6i\\unithe2.jpg"));
        
        //pack();
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        //https://stackoverflow.com/questions/14124593/how-to-rotate-graphics-in-java
        g2d.rotate(
            Math.toRadians(-30),
            200, //250
            200 //250
        );
        
        //g2d.setColor(Color.RED);
        /*GradientPaint gradient = new GradientPaint(
            250,
            250,
            Color.YELLOW,
            260, 
            260, 
            Color.BLUE
        );*/
        Point2D.Float p1 = new Point2D.Float(250.f, 250.f);
        Point2D.Float p2 = new Point2D.Float(260.f, 260.f);
        GradientPaint gradient = new GradientPaint(
            p1,
            Color.YELLOW,
            p2,
            Color.BLUE,
            true
        );
        g2d.setPaint(gradient);
        g2d.fillArc(20, 250, 400, 200, 90, 180);
        
        //https://stackoverflow.com/questions/4219511/draw-rectangle-border-thickness
        Stroke previous_stroke = g2d.getStroke();
        g2d.setColor(Color.MAGENTA);
        g2d.setStroke(new BasicStroke(6));
        g2d.drawArc(300, 300, 150, 150, -120, 120);
        g2d.setColor(Color.GREEN);
        g2d.fillArc(300, 300, 150, 150, -120, 120);
        g2d.setStroke(previous_stroke);
        
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 30));
        g2d.drawString("Tokaj-Hegyalja Egyetem", 50, 250);
        
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(
            image, 
            100,
            100,
            150,
            200,
            this
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DZAE6I_2DGrafika dzae6i_2dgrafika = new DZAE6I_2DGrafika();
                }
                catch (IOException ex) {
                    Logger.getLogger(DZAE6I_Kepek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
