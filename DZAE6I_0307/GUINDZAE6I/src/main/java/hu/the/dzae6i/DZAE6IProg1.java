package hu.the.dzae6i;

import javax.swing.JFrame;

public class DZAE6IProg1 extends JFrame {
    
    public static void main(String[] args) {        
        //display();
        
        //DZAE6IProg2 object = new DZAE6IProg2();
        
        //DZAE6IProg3 object = new DZAE6IProg3();
        
        //DZAE6IProg4 object = new DZAE6IProg4();
        
        //DZAE6IProg5 object = new DZAE6IProg5();
        
        DZAE6IProg6 prog = new DZAE6IProg6();
        
        //object.display();
    }
    
    public void display() {
        JFrame frame = new JFrame("DZAE6I");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
