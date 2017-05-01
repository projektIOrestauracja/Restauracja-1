package com.restauracja;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dw on 24.03.17.
 */
public class EkranSali {
    ZarzadcaZamowien zarzadcaZamowien;

    private JPanel panelEkranuSali;
    private  DefaultListModel listModelGotowe;
    private JList listaGotowe;
    private JTextField gotoweZamowieniaTextField;
    private JTextField wTrakcieRealizacjiTextField;
    private DefaultListModel listModelWTrakcie;
    private JList listaWTrakcie;

    public EkranSali() {
        JFrame frame = new JFrame("Ekran sali");
        frame.setContentPane(panelEkranuSali);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));

        int szerokosc = frame.getWidth() / 2;
        int wysokosc = frame.getHeight() / 2;
        int x = szerokosc;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - wysokosc;
        frame.setLocation(x, y);

        listModelWTrakcie = new DefaultListModel();
    }

    public DefaultListModel getListModelWTrakcie() {
        return listModelWTrakcie;
    }

    public JList getListaGotowe() {
        return listaGotowe;
    }

    public JList getListaWTrakcie() {
        return listaWTrakcie;
    }
}
