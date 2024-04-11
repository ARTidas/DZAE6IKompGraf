package hu.the.dzae6i;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DZAE6IProg14 extends JFrame {
    
    private final JTextField textField;

    public DZAE6IProg14() {
        setTitle("PTI");
        setSize(200, 200);
        //getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        
        textField = new JTextField();
        
        JButton button = new JButton("DZAE6I - Open dialoguebox");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDialogue();
            }
        });
        
        add(textField);
        add(button);

        setVisible(true);
    }
    
    private void openDialogue() {
        JDialog dialog = new JDialog(this, "DZAE6I - Dialog Window", true);
        dialog.setSize(300, 140);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField dialogTextField = new JTextField(20);
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        
        JButton setButton = new JButton("Set");
        setButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(dialogTextField.getText());
                dialog.dispose();
            }
        });
        
        panel.add(dialogTextField);
        panel.add(cancelButton);
        panel.add(setButton);
        
        dialog.add(panel);
        
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg14();
            }
        });
    }
}
