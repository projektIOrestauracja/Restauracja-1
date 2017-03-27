package com.restauracja;

/**
 * Created by dw on 24.03.17.
 */
public class Klient {

    //do automatycznej numeracji klientow
    public static int liczbaKlientow = -1;

    //do rozpoznania danego klienta
    private int idKlienta = 0;
    private int rachunek = 0;
    private Zamowienie zamowienie;

    Klient() {
        liczbaKlientow++;
        //Po 100 znowu bedzie 0
        liczbaKlientow %= 100;

        idKlienta = liczbaKlientow;
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
