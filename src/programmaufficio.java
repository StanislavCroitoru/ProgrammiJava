import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class programmaufficio {
    private JPanel Pannel1;
     private JCheckBox Mouse;
      private JCheckBox Stampante;
       private JCheckBox PenDrive;
        private JCheckBox Scanner;
         private JButton confermaButton;
          private int total;

    public programmaufficio() {
        Mouse.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        Stampante.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        PenDrive.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        Scanner.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isMouse = false;
                 boolean isStampante = false;
                  boolean isPenDrive = false;
                   boolean isScanner = false;

                if(Mouse.isSelected()){
                    total = total + 20;
                }
                if(Stampante.isSelected()){
                   total = total + 100;
                }
                if(PenDrive.isSelected()){
                    total = total + 10;
                }
                if(Scanner.isSelected()){
                    total = total +80;
                }
                
                JOptionPane.showMessageDialog(null,"Totale: " + total);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new programmaufficio().Pannel1);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
         Mouse = new JCheckBox (new ImageIcon("mouse.jpg"));
          Stampante = new JCheckBox(new ImageIcon("stampante.jpg"));
           PenDrive = new JCheckBox(new ImageIcon("pendrive.jpg"));
            Scanner = new JCheckBox(new ImageIcon("scanner.jpg"));
    }
}
