package com.restauracja;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dw on 24.03.17.
 */
public class EkranSali {
    private JPanel panelEkranuSali;
    private JList listaGotowe;
    private JTextField gotoweZamowieniaTextField;
    private JTextField wTrakcieRealizacjiTextField;
    private JList listaWTrakcie;

    public EkranSali() {
        JFrame frame = new JFrame("Ekran sali");
        frame.setContentPane(panelEkranuSali);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));
    }
}
