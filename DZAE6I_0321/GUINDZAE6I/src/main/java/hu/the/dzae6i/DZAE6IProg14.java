package hu.the.dzae6i;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DZAE6IProg14 extends JFrame {

    public DZAE6IProg14() {
        setTitle("PTI");
        setSize(300, 140);
        //getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg14();
            }
        });
    }
}
