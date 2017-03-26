package com.restauracja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dw on 25.03.17.
 */
public class MenuRestauracji {

    private CzytnikPlikow czytnikPlikow;
    private List<Danie> listaDan;

    MenuRestauracji() {
        czytnikPlikow = new CzytnikPlikow();
        listaDan = new ArrayList<>();
    }

    public void odczytajDaniaZPlikuDoListy() {
        String menu = czytnikPlikow.czytajPlik();
        Scanner scanner = new Scanner(menu);

        while (scanner.hasNext()) {
            String idStr = scanner.next();
            int id = Integer.parseInt(idStr);
            String nazwa = scanner.next();
            String cenaString = scanner.next();
            float cena = Float.parseFloat(cenaString);

            Danie danie = new Danie(id, nazwa, cena);
            listaDan.add(danie);
        }

//        for (Danie d : listaDan) {
//            System.out.println(d.getIdDania());
//            System.out.println(d.getNazwaDania());
//            System.out.println(d.getCenaDania());
//        }

    }

    private void dodajNoweDanieDoPliku() {

    }

    private void aktualizujListeDan() {

    }
}
