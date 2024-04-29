package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DZAE6IProg18 extends JFrame implements ActionListener {
    
    private Color backgroundColor = Color.WHITE;
    private Color drawColor = Color.BLACK;
    private int mouseX, mouseY;
    
    public DZAE6IProg18() {
        setTitle("PTI");
        setSize(500, 500);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(this);
        getContentPane().add(buttonClear);
        
        JButton buttonBackGroundColor = new JButton("Set Background Color");
        buttonBackGroundColor.addActionListener(this);
        getContentPane().add(buttonBackGroundColor);
        
        JButton buttonDrawColor = new JButton("Set Line Color");
        buttonDrawColor.addActionListener(this);
        getContentPane().add(buttonDrawColor);
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(drawColor);
                int x = e.getX();
                int y = e.getY();
                g.drawLine(mouseX, mouseY, x, y);
                mouseX = x;
                mouseY = y;
            }
        });
        
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // White rectangle as a background
        /*g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());*/

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Clear":
                clearDrawing();
                break;
            case "Set Background Color":
                backgroundColor = JColorChooser.showDialog(this, "Choose Color", backgroundColor);
                break;
            case "Set Line Color":
                drawColor = JColorChooser.showDialog(this, "Choose Color", drawColor);
                break;
            default:
                break;
        }

        //repaint();
    }
    
    private void clearDrawing() {
        Graphics g = getGraphics();
        g.setColor(backgroundColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg18();
            }
        });
    }
    
}
