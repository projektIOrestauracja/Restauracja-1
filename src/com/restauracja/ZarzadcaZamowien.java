package com.restauracja;

import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class ZarzadcaZamowien {

    private List<Zamowienie> zakonczoneZamowienia;
    private List<Zamowienie> realizowaneZamowienia;

    public void odbierzNoweZamowienie(Zamowienie zamowienie) {

    }

    public void usunZakonczoneZamowienie(Zamowienie zamowienie) {

    }

    public List<Zamowienie> zwrocZakonczoneZamowienia() {
        return zakonczoneZamowienia;
    }

    public List<Zamowienie> zwrocRealizowaneZamowienia() {
        return realizowaneZamowienia;
    }
}
