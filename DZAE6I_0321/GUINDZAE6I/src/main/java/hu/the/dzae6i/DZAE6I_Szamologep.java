package hu.the.dzae6i;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DZAE6I_Szamologep extends JFrame {
    
    public DZAE6I_Szamologep() {
        setTitle("Calculator - DZAE6I");
        setSize(400, 600);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout layout_1 = new GridLayout(0, 1, 10, 10);
        GridLayout layout_2 = new GridLayout(0, 2, 10, 10);
        GridLayout layout_4 = new GridLayout(0, 4, 10, 10);
        
        setLayout(layout_1);
        //setLayout(new GridBagLayout());
        
        JPanel row_1 = new JPanel(layout_1);
        JPanel row_2 = new JPanel(layout_4);
        JPanel row_3 = new JPanel(layout_4);
        JPanel row_4 = new JPanel(layout_4);
        JPanel row_5 = new JPanel(layout_4);
        JPanel row_6 = new JPanel(layout_2);
        
        row_1.setBackground(Color.LIGHT_GRAY);
        row_2.setBackground(Color.LIGHT_GRAY);
        row_3.setBackground(Color.LIGHT_GRAY);
        row_4.setBackground(Color.LIGHT_GRAY);
        row_5.setBackground(Color.LIGHT_GRAY);
        row_6.setBackground(Color.LIGHT_GRAY);
        
        JTextField calculator_input = new JTextField();
        
        JButton button_1            = new JButton("1");
        JButton button_2            = new JButton("2");
        JButton button_3            = new JButton("3");
        JButton button_add          = new JButton("+");
        
        JButton button_4            = new JButton("4");
        JButton button_5            = new JButton("5");
        JButton button_6            = new JButton("6");
        JButton button_sub          = new JButton("-");
        
        JButton button_7            = new JButton("7");
        JButton button_8            = new JButton("8");
        JButton button_9            = new JButton("9");
        JButton button_mul          = new JButton("*");
        
        JButton button_0            = new JButton("0");
        JButton button_cle          = new JButton("C");
        JButton button_dec          = new JButton(".");
        JButton button_div          = new JButton("/");
        
        JButton button_sig          = new JButton("+/-");
        JButton button_equ          = new JButton("=");
        
        Font button_font = new Font("Arial", Font.BOLD, 40);
        calculator_input.setFont(button_font);
        button_1.setFont(button_font);
        button_2.setFont(button_font);
        button_3.setFont(button_font);
        button_4.setFont(button_font);
        button_5.setFont(button_font);
        button_6.setFont(button_font);
        button_7.setFont(button_font);
        button_8.setFont(button_font);
        button_9.setFont(button_font);
        button_0.setFont(button_font);
        button_add.setFont(button_font);
        button_sub.setFont(button_font);
        button_mul.setFont(button_font);
        button_div.setFont(button_font);
        button_cle.setFont(button_font);
        button_dec.setFont(button_font);
        button_sig.setFont(button_font);
        button_equ.setFont(button_font);
                
        row_1.add(calculator_input);
        
        row_2.add(button_1);
        row_2.add(button_2);
        row_2.add(button_3);
        row_2.add(button_add);
        
        row_3.add(button_4);
        row_3.add(button_5);
        row_3.add(button_6);
        row_3.add(button_sub);
        
        row_4.add(button_7);
        row_4.add(button_8);
        row_4.add(button_9);
        row_4.add(button_mul);
        
        row_5.add(button_0);
        row_5.add(button_cle);
        row_5.add(button_dec);
        row_5.add(button_div);
        
        row_6.add(button_sig);
        row_6.add(button_equ);
        
        
        add(row_1);
        add(row_2);
        add(row_3);
        add(row_4);
        add(row_5);
        add(row_6);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DZAE6I_Szamologep dzaE6I_Szamologep = new DZAE6I_Szamologep();
            }
        });
    }
    
}
