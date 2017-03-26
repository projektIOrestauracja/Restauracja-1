package com.restauracja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dw on 24.03.17.
 */
public class Restauracja {
    public static Restauracja restauracja;

    private ZarzadcaZamowien zarzadca;
    private Kuchnia kuchnia;
    private EkranSali ekranSali;
    private EkranKlienta ekranKlienta;
    private List<Klient> listaKlientow = new ArrayList<Klient>();

    public Restauracja() {
        zarzadca = new ZarzadcaZamowien();
        kuchnia = new Kuchnia();
        ekranSali = new EkranSali();
        ekranKlienta = new EkranKlienta();
    }

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }
}
