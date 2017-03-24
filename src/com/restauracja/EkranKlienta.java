package com.restauracja;

import javax.swing.*;
import java.awt.Dimension;

/**
 * Created by dw on 24.03.17.
 */
public class EkranKlienta {
    private JPanel panelEkranuKlienta;
    private JButton dodajDanieButton;
    private JButton usunDanieButton;
    private JButton zlozZamowienieButton;
    private JButton sprawdzStanZamowieniaButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField kwota;

    public EkranKlienta() {
        JFrame frame = new JFrame("Ekran klienta");
        frame.setContentPane(panelEkranuKlienta);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));
    }
}
