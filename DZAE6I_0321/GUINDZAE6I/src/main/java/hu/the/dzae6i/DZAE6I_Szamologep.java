package hu.the.dzae6i;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;

public class DZAE6I_Szamologep extends JFrame {
    
    private Float input_a;
    private Float input_b;
    private String operand;
    
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
        
        
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "1");
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "2");
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "3");
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "4");
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "5");
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "6");
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "7");
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "8");
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "9");
            }
        });
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + "0");
            }
        });
        button_cle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText("");
            }
        });
        button_dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator_input.setText(calculator_input.getText() + ".");
            }
        });
        
        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_a = Float.valueOf(calculator_input.getText());
                operand = "+";
                calculator_input.setText("");
            }
        });
        button_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_a = Float.valueOf(calculator_input.getText());
                operand = "-";
                calculator_input.setText("");
            }
        });
        button_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_a = Float.valueOf(calculator_input.getText());
                operand = "*";
                calculator_input.setText("");
            }
        });
        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_a = Float.valueOf(calculator_input.getText());
                operand = "/";
                calculator_input.setText("");
            }
        });
        
        button_equ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (
                        calculator_input.getText().substring(0, 1).equals("-")
                    ) {
                        calculator_input.setText(
                            calculator_input.getText().substring(
                                1,
                                calculator_input.getText().length()
                            )
                        );
                    }
                    else {
                        calculator_input.setText("-" + calculator_input.getText());
                    }
                }
                catch (BadLocationException exception) {
                    Logger.getLogger(DZAE6I_Szamologep.class.getName()).log(Level.SEVERE, null, exception);
                }
            }
        });
        
        button_equ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_b = Float.valueOf(calculator_input.getText());
                
                switch(operand) {
                    case "+":
                        calculator_input.setText(String.valueOf(input_a + input_b));
                        break;
                    case "-":
                        calculator_input.setText(String.valueOf(input_a - input_b));
                        break;
                    case "*":
                        calculator_input.setText(String.valueOf(input_a * input_b));
                        break;
                    case "/":
                        calculator_input.setText(String.valueOf(input_a / input_b));
                        break;
                    default:
                        calculator_input.setText("Invalid operand");
                }
            }
        });
        
        
                
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
