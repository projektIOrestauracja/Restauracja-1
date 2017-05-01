package com.restauracja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class ZarzadcaZamowien {

    private List<Zamowienie> zakonczoneZamowienia;
    private List<Zamowienie> realizowaneZamowienia;

    private EkranSali ekranSali;

    public ZarzadcaZamowien(EkranSali ekranSali){
        this.ekranSali = ekranSali;

        zakonczoneZamowienia = new ArrayList<>();
        realizowaneZamowienia = new ArrayList<>();
    }

    public void odbierzNoweZamowienie(Zamowienie zamowienie) {
        realizowaneZamowienia.add(zamowienie);
        aktualizujEkranSali();
    }

    public void usunZakonczoneZamowienie(Zamowienie zamowienie) {
        zakonczoneZamowienia.add(zamowienie);
        realizowaneZamowienia.remove(zamowienie);
    }

    private void aktualizujEkranSali(){
        ekranSali.getListModelWTrakcie().addElement(realizowaneZamowienia.get(realizowaneZamowienia.size() - 1));
        ekranSali.getListaWTrakcie().setModel(ekranSali.getListModelWTrakcie());
    }

    public List<Zamowienie> getZakonczoneZamowienia() {
        return zakonczoneZamowienia;
    }

    public List<Zamowienie> getRealizowaneZamowienia() {
        return realizowaneZamowienia;
    }
}
