package com.caselladicontrollo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton VisuallizzaButton;
    private JPanel Eserciziografica;
    private JCheckBox FumatoriCheckBox;
    private JCheckBox NonFumatoriCheckBox;

    public App() {
        VisuallizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(FumatoriCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Hai selezionato la casella FUMATORI...");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Hai selezionato la casella NONFUMATORI...");
                }
            }
        });
        FumatoriCheckBox.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        NonFumatoriCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().Eserciziografica);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}