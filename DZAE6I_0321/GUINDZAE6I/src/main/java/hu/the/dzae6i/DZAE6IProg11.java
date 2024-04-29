package hu.the.dzae6i;

import javax.swing.*;
import java.awt.*;

public class DZAE6IProg11 extends JFrame {

    public DZAE6IProg11() {
        setTitle("PTI");
        setSize(220, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> jList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(jList);
        add(scrollPane, BorderLayout.CENTER);
        
        listModel.addElement("Bárdos Triszten");
        listModel.addElement("Fejér Zakariás");
        listModel.addElement("Laczkó Lajos");
        listModel.addElement("Mihály Károly");
        listModel.addElement("Papp Kevin");
        listModel.addElement("Veres Zoltán");

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg11();
            }
        });
    }
}
