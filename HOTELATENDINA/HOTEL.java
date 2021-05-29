package com.ui.HOTELATENDINA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HOTEL {
    private JButton Pulsantediconferma;
     private JCheckBox FumatoriCheckBox1;
      private JCheckBox CameraMatrimonialeCheckBox2;
       private JCheckBox VistamareCheckBox3;
        private JCheckBox ParcheggioCheckBox4;
         private JButton InfoPulsante;
          private JButton PulsanteVisualizzaFoto;
         private JPanel Panel1;
        private JLabel HotelFoto;
       private JLabel FumatoriCameraFoto = new JLabel(new ImageIcon("Fumatori.jpg"));
      private JLabel CameraMatrimonialeFoto = new JLabel(new ImageIcon("cameramatrimoniale.jpg"));
     private JLabel Vistamarefoto = new JLabel(new ImageIcon("vistaMarE.jpg"));
      private JLabel ParcheggioFoto = new JLabel(new ImageIcon("parcheggio.jpg"));
       private JButton PulsanteEsci;

    boolean isFumatoriSelected = false;
     boolean isCameraMatrimonialeSelected = false;
      boolean isVistamareSelected = false;
       boolean isParcheggioSelected = false;

    String output = "Hai scelto ... \n";


    public HOTEL() {
        Pulsantediconferma.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
                 if (FumatoriCheckBox1.isSelected()) {
                     output = output + "\n- Fumatori";
                }

                 if (CameraMatrimonialeCheckBox2.isSelected()) {
                     output = output + "\n- CameraMatrimoniale";
                }

                 if (VistamareCheckBox3.isSelected()) {
                     output = output + "\n- Vistamare";
                }

                 if (ParcheggioCheckBox4.isSelected()) {
                     output = output + "\n- Vistamare";
                }

                String inputComboBox;

                Pulsantediconferma.setVisible(false);

            }
        });

        InfoPulsante.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "Stanislav Croitoru \n4AIA");
            }
        });

        PulsanteVisualizzaFoto.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
                 HotelFoto.setVisible(true);
                  PulsanteVisualizzaFoto.setVisible(false);
            }
        });


        PulsanteEsci.addActionListener(new ActionListener() {
             @Override
               public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        });
    }

        public static void main (String[]args){
            JFrame frame = new JFrame("Hotel");
             frame.setContentPane(new HOTEL().Panel1);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
        }

        private void createUIComponents () {
            // TODO: place custom component creation code here
             HotelFoto = new JLabel(new ImageIcon("Hotel.jpg"));

        }
}

