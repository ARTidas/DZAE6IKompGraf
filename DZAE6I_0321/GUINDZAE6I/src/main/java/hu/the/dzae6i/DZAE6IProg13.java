package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DZAE6IProg13 extends JFrame {
    
    private final JTextField inputField;
    private final JScrollBar scrollBar1;
    private final JScrollBar scrollBar2;

    public DZAE6IProg13() {
        setTitle("PTI");
        setSize(300, 140);
        //getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        
        // Create the input field
        inputField = new JTextField(10);
        
        // Create the scroll bars
        scrollBar1 = new JScrollBar(JScrollBar.HORIZONTAL, 1, 1, 1, 100);
        scrollBar2 = new JScrollBar(JScrollBar.HORIZONTAL, 1, 1, 1, 100);

        // Add scroll bar listeners to update text field
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                updateTextField();
            }
        });
        scrollBar2.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                updateTextField();
            }
        });
        

        // Add components in order
        //getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(new JLabel("Data 1:"));
        panel.add(scrollBar1);
        
        panel.add(new JLabel("Data 2:"));
        panel.add(scrollBar2);
        
        panel.add(new JLabel("Result:"));
        panel.add(inputField);
        
        add(panel, BorderLayout.WEST);

        setVisible(true);
    }
    
    private void updateTextField() {
        int value1 = scrollBar1.getValue();
        int value2 = scrollBar2.getValue();
        inputField.setText(value1 + " + " + value2 + " = " + (value1 + value2));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg13();
            }
        });
    }
}
