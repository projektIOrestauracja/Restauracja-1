package com.restauracja;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Restauracja.restauracja = new Restauracja();
//                CzytnikPlikow czytnikDan = new CzytnikPlikow();
//                czytnikDan.czytajPlik();
                MenuRestauracji menuRestauracji = new MenuRestauracji();
                menuRestauracji.odczytajDaniaZPlikuDoListy();
            }
        });
    }
}

