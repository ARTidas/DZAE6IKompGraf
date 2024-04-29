package hu.the.dzae6i;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class DZAE6IProg15 extends JFrame {

    public DZAE6IProg15() {
        setTitle("PTI");
        setSize(200, 200);
        //getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu dataInputsMenu = new JMenu("Data inputs");
        JMenuItem sideAItem = new JMenuItem("Side A");
        JMenuItem sideBItem = new JMenuItem("Side B");
        dataInputsMenu.add(sideAItem);
        dataInputsMenu.add(sideBItem);
        
        JMenu calculationsMenu = new JMenu("Calculations");
        JMenuItem circumferenceItem = new JMenuItem("Circumference");
        JMenuItem areaItem = new JMenuItem("Area");
        JMenuItem exitItem = new JMenuItem("Exit");
        calculationsMenu.add(circumferenceItem);
        calculationsMenu.add(areaItem);
        calculationsMenu.addSeparator();
        calculationsMenu.add(exitItem);
        
        menuBar.add(dataInputsMenu);
        menuBar.add(calculationsMenu);
        
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DZAE6IProg15();
            }
        });
    }
}
