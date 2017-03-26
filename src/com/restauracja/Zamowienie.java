package com.restauracja;

import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class Zamowienie {

    private Danie danie;
    private List<Danie> danieList;
    private int idZamowienia = 0;

    private enum StanZamowienia {
        Gotowe, WTrakcieRealizacji;
    }

    StanZamowienia stanZamowienia;

    public Zamowienie(int idZamowienia) {
        this.idZamowienia = idZamowienia;
        stanZamowienia = StanZamowienia.WTrakcieRealizacji;
    }

    public List<Danie> getDanieList() {
        return danieList;
    }

    public void setDanieList(List<Danie> danieList) {
        this.danieList = danieList;
    }
}
