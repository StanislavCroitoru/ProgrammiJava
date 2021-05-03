package com.Conversione;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversione {
    private JPanel Panel1;
     private JTextField Valuta;
      private JButton Converti;
       private JComboBox Scelta;
        private JLabel Covertito;

    public Conversione() {
        Valuta.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {

            }
        });
        Converti.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                int inputTextField = Integer.parseInt(Valuta.getText());
                 String inputComboBox = (String) Scelta.getSelectedItem();

                double calcdollaro;

                if (inputComboBox == "Dollaro") {
                     calcdollaro = inputTextField / (1.20);
                      Covertito.setText(String.valueOf(calcdollaro));
                }

                double calcrublo;

                if (inputComboBox == "Rublo") {
                     calcrublo = inputTextField / (0.01);
                      Covertito.setText(String.valueOf(calcrublo));
                }

                double calcMdLeu;
                if (inputComboBox == "Moldovenesti Leu") {
                     calcMdLeu = inputTextField / (21.27);
                      Covertito.setText(String.valueOf(calcMdLeu));
                }
            }
        });
        Scelta.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new Conversione().Panel1);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }
}
