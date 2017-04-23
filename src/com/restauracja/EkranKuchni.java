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
    private JButton dodajDanieButton;
    private JTextField nazwaDaniaField;
    private JTextField cenaDaniaField;
    private JTabbedPane listaZamowien;

    //Tu będą wyswietlane nowe zamowienia(prototyp), tworzy kartę z nowym zamowieniem
    private JPanel noweZamowienie(String text) {
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JTextField lista = new JTextField();
        //tutaj powinna byc wpisywana lista dan do jtextfield'a
        lista.setText( text);
        lista.setEditable(false);

        //gbc.anchor  = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx =  1.0;
        gbc.weighty = 10.0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        p.add(lista, gbc); //dodaje liste do panelu

        JButton gotoweButton = new JButton("Zamowienie gotowe");

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx =  1.0;
        gbc.weighty = 2.0;
        gbc.gridx = 0;
        gbc.gridy = 1;

        p.add(gotoweButton, gbc); //dodaje przycisk do panelu
        gotoweButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //trzeba dodać zmianę stanu zamowienia na gotowe
                int i = listaZamowien.indexOfComponent(p);
                if (i != -1) {
                    listaZamowien.remove(i);
                }
//             System.out.println(listaZamowien.indexOfComponent(p));
            }
        });
        return p;
    }

    public EkranKuchni() {
        kuchnia = new Kuchnia();

        JFrame frame = new JFrame("Ekran kuchni");
        frame.setContentPane(panelEkranuKuchni);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        listaZamowien.addTab("Zamowienie1", noweZamowienie("lista dan..."));
        listaZamowien.addTab("Tab2", noweZamowienie("This is tab 2"));
        listaZamowien.addTab("Tab3", noweZamowienie("This is tab 3"));
        listaZamowien.addTab("Tab4", noweZamowienie("This is tab 4"));

        int szerokosc = frame.getWidth() / 2;
        int wysokosc = frame.getHeight() / 2;
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width) - szerokosc;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - wysokosc;
        frame.setLocation(x, y);

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
