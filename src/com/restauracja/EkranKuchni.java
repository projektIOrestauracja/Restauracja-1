package com.restauracja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dw on 24.03.17.
 */
public class EkranKuchni {
    private Kuchnia kuchnia;
    private JPanel panelEkranuKuchni;
    private JTextField tuMaBycTabelaTextField;
    private JButton dodajDanieButton;
    private JTextField nazwaDaniaField;
    private JTextField cenaDaniaField;

    public EkranKuchni() {
        kuchnia = new Kuchnia();

        JFrame frame = new JFrame("Ekran kuchni");
        frame.setContentPane(panelEkranuKuchni);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));

        dodajDanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nazwaDania = nazwaDaniaField.getText();
                String cenaDania = cenaDaniaField.getText();
//                Restauracja.restauracja.getMenuRestauracji().dodajNoweDanie(nazwaDania, Double.parseDouble(cenaDania));
                MenuRestauracji.menuRestauracji.dodajNoweDanie(nazwaDania, Double.parseDouble(cenaDania));

            }
        });
    }
}
