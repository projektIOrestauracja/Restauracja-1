package com.restauracja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class ZarzadcaZamowien {

    private List<Zamowienie> zakonczoneZamowienia;
    private List<Zamowienie> realizowaneZamowienia;

    public ZarzadcaZamowien(){
        zakonczoneZamowienia = new ArrayList<>();
        realizowaneZamowienia = new ArrayList<>();
    }

    public void odbierzNoweZamowienie(Zamowienie zamowienie) {
        realizowaneZamowienia.add(zamowienie);
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
