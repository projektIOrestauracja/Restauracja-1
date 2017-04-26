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

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Danie d : listaDan){
        stringBuilder.append(d.toString());
        }
        return stringBuilder.toString();
    }

    public List<Danie> getlistaDan() {
        return listaDan;
    }
}
