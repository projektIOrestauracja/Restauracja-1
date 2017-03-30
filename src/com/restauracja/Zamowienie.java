package com.restauracja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class Zamowienie {

    private Danie danie;
    private List<Danie> listaDan;
    private int idZamowienia = 0;

    private enum StanZamowienia {
        Gotowe, WTrakcieRealizacji;
    }

    StanZamowienia stanZamowienia;

    public Zamowienie(int idZamowienia) {
        this.idZamowienia = idZamowienia;
        stanZamowienia = StanZamowienia.WTrakcieRealizacji;
        listaDan = new ArrayList<>();
    }

    public List<Danie> getlistaDan() {
        return listaDan;
    }

    public void setlistaDan(List<Danie> danieList) {
        this.listaDan = danieList;
    }
}
