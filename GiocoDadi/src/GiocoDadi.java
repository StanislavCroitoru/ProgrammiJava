package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Random;

public class GiocoDadi {
    private JPanel Panel1;
     private JTextField textField1;
      private JLabel importo;
       private JLabel dado1;
        private JLabel dado2;
         private JLabel dado3;
          private JLabel Vincita;
           private JButton TiraDati;

    public GiocoDadi() {
        textField1.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        dado1.addComponentListener(new ComponentAdapter() {
            @Override
              public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        dado2.addComponentListener(new ComponentAdapter() {
            @Override
              public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        dado3.addComponentListener(new ComponentAdapter() {
            @Override
              public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        Panel1.addComponentListener(new ComponentAdapter() {
            @Override
              public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        Vincita.addComponentListener(new ComponentAdapter() {
            @Override
              public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        importo.addComponentListener(new ComponentAdapter() {
            @Override
              public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        TiraDati.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                 int Importo = Integer.parseInt(textField1.getText());

                  int Dado1 = random.nextInt(8);
                  int Dado2 = random.nextInt(8);
                  int Dado3 = random.nextInt(8);

                  //int Dado1 = 5;
                  //int Dado2 = 5;
                  //int Dado3 = 5;

                    dado1.setText(String.valueOf(Dado1));
                     dado2.setText(String.valueOf(Dado2));
                      dado3.setText(String.valueOf(Dado3));

                      int vincitacalc = 0;

                if (Dado1 == Dado2) {
                    if (Dado2 == Dado3) {
                         vincitacalc = Importo * 4;
                    }
                    else {
                         vincitacalc = Importo * 2;
                    }
                }
                if (Dado1 == Dado3) {
                    if (Dado2 == Dado3) {
                         vincitacalc = Importo * 4;
                    }
                    else {
                         vincitacalc = Importo * 2;
                    }
                }
                if (Dado2 == Dado3) {
                    if (Dado1 == Dado3) {
                         vincitacalc = Importo * 4;
                    }
                    else {
                         vincitacalc = Importo * 2;
                    }
                }

                Vincita.setText(String.valueOf(vincitacalc));

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new GiocoDadi().Panel1);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }
}
