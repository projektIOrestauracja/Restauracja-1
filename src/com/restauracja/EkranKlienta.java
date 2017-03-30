package com.restauracja;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dw on 24.03.17.
 */

import java.awt.Toolkit;

public class EkranKlienta {
    private JPanel panelEkranuKlienta;
    private JButton dodajDanieButton;
    private JButton usunDanieButton;
    private JButton zlozZamowienieButton;
    private JComboBox wybierzDanieBox;
    private JTextField kwota;
    private JList jListaDan;
    private Klient klient;

    int indexDaniaDoUsuniecia = 0;

    public EkranKlienta() {

        JFrame frame = new JFrame("Ekran klienta");
        frame.setContentPane(panelEkranuKlienta);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));

        int szerokosc = frame.getWidth() / 2;
        int wysokosc = frame.getHeight() / 2;
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - szerokosc;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - wysokosc;
        frame.setLocation(x, y);

        //utworz pierwszego klienta
        klient = new Klient();

        //ustaw model combo boxa
        wybierzDanieBox.setModel(klient.getComboBoxModel());

        //ustaw model listy wybranych dan
        jListaDan.setModel(klient.getListModel());

        dodajDanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        wybierzDanieBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                int index = comboBox.getSelectedIndex();
//                System.out.println(index);
                klient.dodajDanie(index);
                kwota.setText(Double.toString(klient.getRachunek()) + " PLN");
            }
        });

        jListaDan.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList jList = (JList) e.getSource();
                indexDaniaDoUsuniecia = jList.getSelectedIndex();
//                System.out.println(indexDaniaDoUsuniecia);
            }
        });

        usunDanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klient.usunDanie(indexDaniaDoUsuniecia);
                kwota.setText(Double.toString(klient.getRachunek()) + " PLN");
            }
        });

        zlozZamowienieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Klient.liczbaKlientow == 0) {
                    Restauracja.restauracja.getListaKlientow().add(klient);
                }
                klient = new Klient();
                Restauracja.restauracja.getListaKlientow().add(klient);
                klient.zlozZamowienie();

//                System.out.println(Klient.liczbaKlientow);
//                System.out.println(Restauracja.restauracja.getListaKlientow().get(Klient.liczbaKlientow).getIdKlienta());

            }
        });
    }

}
