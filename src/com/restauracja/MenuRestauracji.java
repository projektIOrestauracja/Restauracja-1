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

    public static MenuRestauracji menuRestauracji;

    MenuRestauracji() {
        czytnikPlikow = new CzytnikPlikow();
        listaDan = new ArrayList<>();

        //odczytanie poczatkowego stanu Menu
        odczytajDaniaZPlikuDoListy();
    }

    public void odczytajDaniaZPlikuDoListy() {
        String menu = czytnikPlikow.czytajPlik("menu.txt");
        Scanner scanner = new Scanner(menu);

        while (scanner.hasNext()) {
            String idStr = scanner.next();
            int id = Integer.parseInt(idStr);
            String nazwa = scanner.next();
            String cenaString = scanner.next();
            double cena = Double.parseDouble(cenaString);

            Danie danie = new Danie(id, nazwa, cena);
            listaDan.add(danie);
        }

        //DEBUGOWANIE
//        for (Danie d : listaDan) {
//            System.out.print(d.getIdDania() + " ");
//            System.out.print(d.getNazwaDania() + " ");
//            System.out.println(d.getCenaDania());
//        }

    }

    public void dodajNoweDanie(String nazwaDania, double cenaDania) {

        Danie danie = new Danie(nazwaDania, cenaDania);
        listaDan.add(danie);

        String idString = Integer.toString(danie.getIdDania());

        String cenaString = Double.toString(cenaDania);

        czytnikPlikow.zapiszPlik("menu.txt", idString + " " + nazwaDania + " " + cenaString);

        //DEBUGOWANIE
//        for (Danie d : listaDan) {
//            System.out.print(d.getIdDania() + " ");
//            System.out.print(d.getNazwaDania() + " ");
//            System.out.println(d.getCenaDania());
//        }
    }

    public List<Danie> getListaDan() {
        return listaDan;
    }
}

