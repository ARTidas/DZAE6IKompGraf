package hu.the.dzae6i;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DZAE6I_Kepek extends JFrame {
    BufferedImage image;
    int image_width = 300;
    int image_height = 400;

    public DZAE6I_Kepek() throws IOException {
        setTitle("PTI");
        setSize((int) Math.round(this.image_width * 1.75), this.image_height);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.image = ImageIO.read(new File("C:\\VZGit\\DZAE6IKompGraf\\DZAE6I_0321\\GUINDZAE6I\\src\\main\\java\\hu\\the\\dzae6i\\unithe2.jpg"));
        
        //pack();
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(
            image, 
            0,
            20,
            (int) Math.round(this.image_width * 0.25),
            (int) Math.round(this.image_height * 0.25),
            this
        );
        g2d.drawImage(
            image, 
            (int) Math.round(this.image_width * 0.25),
            20,
            (int) Math.round(this.image_width * 0.5),
            (int) Math.round(this.image_height * 0.5),
            this
        );
        g2d.drawImage(
            image, 
            (int) Math.round(this.image_width * 0.5) + (int) Math.round(this.image_width * 0.25),
            20,
            (int) Math.round(this.image_width),
            (int) Math.round(this.image_height),
            this
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DZAE6I_Kepek dzaE6I_Kepek = new DZAE6I_Kepek();
                }
                catch (IOException ex) {
                    Logger.getLogger(DZAE6I_Kepek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
