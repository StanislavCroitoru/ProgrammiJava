package com.ui.percentuale;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
     private JTextField textField1;
      private JComboBox comboBox1;
       private JPanel panel1;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                int prezzo = Integer.parseInt(textField1.getText());
                 int percentuale = Integer.parseInt((String) comboBox1.getSelectedItem());
                  int calcolo = prezzo * percentuale / 100;
                   int somma = calcolo + prezzo;
                    JOptionPane.showMessageDialog(null, "somma:" + somma);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new App().panel1);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }
}
