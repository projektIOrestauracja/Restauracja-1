package com.restauracja;

import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;

/**
 * Created by dw on 24.03.17.
 */
public class Klient {

    //do automatycznej numeracji klientow
    public static int liczbaKlientow = -1;

    //do rozpoznania danego klienta
    private int idKlienta = 0;

    private double rachunek = 0;
    private Zamowienie zamowienie;

    private  DefaultComboBoxModel comboBoxModel;
    private  DefaultListModel listModel;

    Klient() {
        liczbaKlientow++;
        //Po 100 znowu bedzie 0
        liczbaKlientow %= 100;

        idKlienta = liczbaKlientow;

        //przygotuj menu z ktorego klient moze wybierac dania
        comboBoxModel = new DefaultComboBoxModel();
        pobierzMenu();

        //lsita wybranych dan przez klienta
        listModel = new DefaultListModel();

        //przypisz zamowieniu id skladajacego go klienta
        zamowienie = new Zamowienie(idKlienta);
    }

    public void zlozZamowienie() {

        Restauracja.restauracja.getZarzadca().odbierzNoweZamowienie(zamowienie);
    }

    public void dodajDanie(int idDania) {

        Danie d = MenuRestauracji.menuRestauracji.getListaDan().get(idDania);

        listModel.addElement(d.getIdDania() + " " + d.getNazwaDania() + " " + d.getCenaDania() + " PLN");
        rachunek += d.getCenaDania();
        zamowienie.getlistaDan().add(d);
    }

    public void usunDanie(int index) {
        listModel.remove(index);
//        System.out.println(zamowienie.getlistaDan().get(index).getNazwaDania());
        double tmpCena = zamowienie.getlistaDan().get(index).getCenaDania();
        rachunek -= tmpCena;
        zamowienie.getlistaDan().remove(index);
    }

    private void pobierzMenu() {
        ArrayList<Danie> tempListaDan = (ArrayList) MenuRestauracji.menuRestauracji.getListaDan();
        for (Danie d : tempListaDan) {
            comboBoxModel.addElement(d.getIdDania() + " " + d.getNazwaDania() + " " + d.getCenaDania() + " PLN");
        }
    }

    public DefaultComboBoxModel getComboBoxModel() {
        return comboBoxModel;
    }

    public DefaultListModel getListModel() {
        return listModel;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public double getRachunek() {
        return rachunek;
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }
}
