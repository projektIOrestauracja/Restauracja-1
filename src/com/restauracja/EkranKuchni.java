package com.restauracja;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dw on 24.03.17.
 */
public class EkranKuchni {
    private JPanel panelEkranuKuchni;
    private JTextField tuMaBycTabelaTextField;

    public EkranKuchni() {
        JFrame frame = new JFrame("Ekran kuchni");
        frame.setContentPane(panelEkranuKuchni);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(650, 650));
    }
}
