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
        zarzadca = new ZarzadcaZamowien();
//        menuRestauracji = new MenuRestauracji();
        ekranSali = new EkranSali();
        ekranKlienta = new EkranKlienta();
        ekranKuchni = new EkranKuchni();
    }

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public ZarzadcaZamowien getZarzadca() {
        return zarzadca;
    }
}
