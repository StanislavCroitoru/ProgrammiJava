//** Progettare una interfaccia per realizzare una applicazione di una semplice calcolatrice che consenta
//** all’utente di svolgere le quattro operazioni fondamentali:
//** somma +
//** prodotto ×
//** divisione /
//** sottrazione -

//** utilizzando 2 caselle di testo per i dati in input, quattro pulsanti per le quattro operazioni fondamentali.
//** Per l’output, scegliete voi cosa usare.

//** Usare un pulsante per uscire dal programma e un pulsante per cancellare i dati inseriti.

package com.ui.Calco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Calcolatrice {
    private JPanel Panel1;
     private JTextField textField1;
      private JTextField textField2;
       private JTextField additionField1;
        private JTextField additionField2;
       private JButton additionButton;
      private JTextField subtractionField1;
     private JTextField subtractionField2;
    private JButton subtractionButton;
     private JTextField multiplicationField1;
      private JTextField multiplicationField2;
       private JButton multiplicationButton;
        private JTextField divisionField1;
       private JTextField divisionField2;
      private JButton divisionButton;

    public Calcolatrice() {
        Panel1.addComponentListener(new ComponentAdapter() {
             @Override
              public void componentResized(ComponentEvent e) {
                 int additionNumber1 = Integer.parseInt(additionField2.getText());
                  int additionNumber2 = Integer.parseInt(additionField1.getText());
                   int additionCalc = additionNumber1 +     additionNumber2;
                    JOptionPane.showMessageDialog(null, "Result: " + additionCalc);
            }
        });
        textField2.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        textField1.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        additionButton.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {
                 int additionNumber1 = Integer.parseInt(additionField2.getText());
                  int additionNumber2 = Integer.parseInt(additionField1.getText());
                   int additionCalc = additionNumber1 +     additionNumber2;
                    JOptionPane.showMessageDialog(null, "Result: " + additionCalc);
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {
                 int multiplicationNumber1 = Integer.parseInt(multiplicationField1.getText());
                  int multiplicationNumber2 = Integer.parseInt(multiplicationField2.getText());
                   int multiplicationCalc = multiplicationNumber1 * multiplicationNumber2;
                    JOptionPane.showMessageDialog(null, "Result: " + multiplicationCalc);
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        divisionButton.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {
                 int divisionNumber1 = Integer.parseInt(divisionField1.getText());
                  int divisionNumber2 = Integer.parseInt(divisionField2.getText());
                   int divisionCalc = divisionNumber1 / divisionNumber2;
                    JOptionPane.showMessageDialog(null, "Result: " + divisionCalc);
            }
        });
        additionField1.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        additionField2.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        subtractionField1.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        subtractionField2.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        multiplicationField1.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        multiplicationField2.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        divisionField1.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        divisionField2.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new Calcolatrice().Panel1);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }
}
