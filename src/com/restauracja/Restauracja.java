package com.restauracja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class Restauracja {
    public static Restauracja restauracja;

    private ZarzadcaZamowien zarzadca;
    //    private MenuRestauracji menuRestauracji;
    private EkranSali ekranSali;
    private EkranKlienta ekranKlienta;
    private EkranKuchni ekranKuchni;
    private List<Klient> listaKlientow;

    public Restauracja() {
        listaKlientow = new ArrayList<Klient>();
//        menuRestauracji = new MenuRestauracji();
        ekranSali = new EkranSali();
        ekranKlienta = new EkranKlienta();
        ekranKuchni = new EkranKuchni();
        zarzadca = new ZarzadcaZamowien(ekranSali);
    }

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public ZarzadcaZamowien getZarzadca() {
        return zarzadca;
    }

    public EkranSali getEkranSali() {
        return ekranSali;
    }

    public EkranKlienta getEkranKlienta() {
        return ekranKlienta;
    }

    public EkranKuchni getEkranKuchni() {
        return ekranKuchni;
    }
}
