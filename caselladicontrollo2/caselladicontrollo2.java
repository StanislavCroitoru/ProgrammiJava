package caselladicontrollo2;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class caselladicontrollo2 {
    public JPanel caselladicontrollo2;
    private JCheckBox Fumatori;
    private JCheckBox NonFumatori;
    private JButton Visualizza;
    private JCheckBox VistaMare;
    private JCheckBox Animali;

    public caselladicontrollo2() {
        caselladicontrollo2.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        Fumatori.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }

        });
        NonFumatori.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VistaMare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Animali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Visualizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String scelta = "Hai selezionato la casella ...:";
                 if(Fumatori.isSelected()){
                     scelta = scelta + Fumatori.getText();

                     if(NonFumatori.isSelected()){
                         scelta = scelta + NonFumatori.getText();
                     }

                 }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("caselladicontrollo2");
        frame.setContentPane(new caselladicontrollo2().caselladicontrollo2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
