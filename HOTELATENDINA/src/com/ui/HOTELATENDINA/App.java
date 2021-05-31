package com.ui.HOTELATENDINA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JCheckBox FumatoriCheckBox1;
    private JCheckBox CameraMatrimonialeCheckBox2;
    private JCheckBox VistamareCheckBox3;
    private JCheckBox ParcheggioCheckBox4;
    private JButton Pulsantediconferma;
    private JButton InfoPulsante;
    private JButton PulsanteVisualizzaFoto;
    private JButton PulsanteEsci;
    private JLabel HotelFoto;

    String output = "Hai scelto ... \n";

    public App() {
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

                JOptionPane.showMessageDialog(null, output);

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

    private void createUIComponents() {
        // TODO: place custom component creation code here
        HotelFoto = new JLabel(new ImageIcon("hotel.jpg"));


    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
