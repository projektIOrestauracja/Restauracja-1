package com.restauracja;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuRestauracji.menuRestauracji = new MenuRestauracji();
                Restauracja.restauracja = new Restauracja();
            }
        });
    }
}

