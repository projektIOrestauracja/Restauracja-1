package com.restauracja;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dw on 24.03.17.
 */
public class EkranKlienta {
    private JPanel panelEkranuKlienta;
    private JButton dodajDanieButton;
    private JButton usunDanieButton;
    private JButton zlozZamowienieButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField kwota;

    private Klient klient;

    public EkranKlienta() {
        JFrame frame = new JFrame("Ekran klienta");
        frame.setContentPane(panelEkranuKlienta);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));

        //utworz pierwszego klienta
        klient = new Klient();

        dodajDanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klient.dodajDanie();
            }
        });

        usunDanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klient.usunDanie();
            }
        });

        zlozZamowienieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Klient.numerKlienta == 0) {
                    Restauracja.restauracja.getListaKlientow().add(klient);
                }
                klient = new Klient();
                Restauracja.restauracja.getListaKlientow().add(klient);
                klient.zlozZamowienie();

                System.out.println(Klient.numerKlienta);
                System.out.println(Restauracja.restauracja.getListaKlientow().get(Klient.numerKlienta).getIdKlienta());

            }
        });
    }
}
