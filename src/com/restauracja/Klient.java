package com.restauracja;

/**
 * Created by dw on 24.03.17.
 */
public class Klient {

    public static int numerKlienta = -1;
    private int idKlienta = 0;
    private int rachunek = 0;
    private Zamowienie zamowienie;

    Klient() {
        numerKlienta++;
        //Po 100 znowu bedzie 0
        numerKlienta %= 100;

        idKlienta = numerKlienta;
        zamowienie = new Zamowienie(idKlienta);
    }

    public void zlozZamowienie() {

    }

//    public void oplacZamowienie(){
//
//    }

    public void dodajDanie() {
//        zamowienie.getDanieList().add()
        System.out.println("dodaje danie");
    }

    public void usunDanie() {

    }

    public int getIdKlienta() {
        return idKlienta;
    }
}
