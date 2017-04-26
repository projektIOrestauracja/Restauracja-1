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
//    private JFrame frame;
    private JPanel panelEkranuKlienta;
//    private JButton dodajDanieButton;
    private JButton usunDanieButton;
    private JButton zlozZamowienieButton;
    private JComboBox wybierzDanieBox;
    private JTextField kwota;
    private JList jListaDan;
    private Klient klient;

    int indexDaniaDoUsuniecia = 0;

    public EkranKlienta() {

        JFrame frame = new JFrame("Ekran klienta");
//        frame = new JFrame("Ekran klienta");
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

        wybierzDanieBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                int index = comboBox.getSelectedIndex();

                klient.dodajDanie(index);
                kwota.setText(Double.toString(klient.getRachunek()) + " PLN");
            }
        });

        jListaDan.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList jList = (JList) e.getSource();
                indexDaniaDoUsuniecia = jList.getSelectedIndex();
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

                //dodaj klienta do globalnej listy klientow
                Restauracja.restauracja.getListaKlientow().add(klient);

                klient.zlozZamowienie();
                System.out.println(klient.toString());
                System.out.println(klient.getZamowienie().toString());

                //tworz kolejnego klienta
                klient = new Klient();

                //ustaw nowy model listy dan klienta dla JList'y
                jListaDan.setModel(klient.getListModel());
            }
        });
    }
}
