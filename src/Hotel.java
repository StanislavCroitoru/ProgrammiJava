import com.sun.source.tree.ParenthesizedTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Hotel {
    private JPanel Hotel;
     private JCheckBox FumatoriCheckBox;
      private JCheckBox CameraMatrimonialeCheckBox;
       private JCheckBox ParcheggioCheckBox;
        private JButton Conferma;
         private JButton Visualizza;
          private JLabel foto;
           private int total;




    public Hotel() {
        foto.setVisible(false);
        FumatoriCheckBox.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        CameraMatrimonialeCheckBox.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {

            }
        });
        ParcheggioCheckBox.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {

            }
        });
        Conferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isFumatori = false;
                 boolean isCameraMatrimoniale = false;
                  boolean isParcheggio = false;

                  if(FumatoriCheckBox.isSelected()){
                      isFumatori = true;
                  }
                  if(CameraMatrimonialeCheckBox.isSelected()){
                      isCameraMatrimoniale = true;
                  }
                  if(ParcheggioCheckBox.isSelected()){
                      isParcheggio = true;
                  }

                JOptionPane.showMessageDialog(null, "Selezioni:\n" + "Fumatori " +
                        isFumatori + "\nCamera Matrimoniale: " + isCameraMatrimoniale + "\nParcheggio: " + isParcheggio);
            }
        });
        Visualizza.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                foto.setVisible(true);
                 Visualizza.setVisible(false);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
         frame.setContentPane(new Hotel().Hotel);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        FumatoriCheckBox = new JCheckBox(new ImageIcon("fumatori.jpg"));
         CameraMatrimonialeCheckBox = new JCheckBox(new ImageIcon("cameramatrimoniale.jpg"));
          ParcheggioCheckBox = new JCheckBox(new ImageIcon("parcheggio.jpg"));
           foto = new JLabel(new ImageIcon("moldowova.jpg"));
    }
}
