import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class trenumerivincioperdi {
    private JTextField Numero1;
     private JPanel App;
      private JTextField Numero2;
       private JTextField Numero3;
        private JButton Giocare;
         private JButton Cancellare;


    public trenumerivincioperdi() {
        Numero1.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {

            }
        });
        Numero2.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {

            }
        });
        Numero3.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {

            }
        });
        Giocare.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                Random random = new Random();

                int number1 = random.nextInt(10);
                 int number2 = random.nextInt(10);
                  int number3 = random.nextInt(10);

                int inputnum1, inputnum2, inputnum3;

                inputnum1 = Integer.parseInt(Numero1.getText());
                 inputnum2 = Integer.parseInt(Numero2.getText());
                  inputnum3 = Integer.parseInt(Numero3.getText());


                System.out.println("DEBUG: " + number1 + " " + number2 + " " + number3);

                if (inputnum1 == number1) {
                    if (inputnum2 == number2) {
                        if (inputnum3 == number3) {
                            JOptionPane.showMessageDialog(null, "Hai vinto");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Hai perso (3 Numero)");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Hai perso (2 Numero)");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Hai perso (1 Numero)");
                }
            }
        });
        Cancellare.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new trenumerivincioperdi().App);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }
}
