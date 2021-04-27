package Noleggio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Noleggio {
    private JPanel NoleggioAuto;
     private JTextField Giornitextfield;
      private JTextField prezzotextfield;
       private JButton Calcola;

    public Noleggio() {
        Giornitextfield.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        prezzotextfield.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        Calcola.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
                int Giorni;
                 int Prezzo;

                int inputGiorni = Integer.parseInt(Giornitextfield.getText());
                 int inputPrezzo = Integer.parseInt(prezzotextfield.getText());

                 int Calcola;
                  Calcola = inputGiorni * inputPrezzo;
                   JOptionPane.showMessageDialog(null,"Quota da pagare: " + Calcola);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new Noleggio().NoleggioAuto);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }
}
