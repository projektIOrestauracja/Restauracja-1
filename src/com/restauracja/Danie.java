package com.restauracja;

/**
 * Created by dw on 24.03.17.
 */

public class Danie {
    private int idDania = 0;
    private String nazwaDania;
    private float cenaDania;

    public Danie(int idDania, String nazwaDania, float cenaDania) {
        this.idDania = idDania;
        this.nazwaDania = nazwaDania;
        this.cenaDania = cenaDania;
    }

    public int getIdDania() {
        return idDania;
    }

    public void setIdDania(int idDania) {
        this.idDania = idDania;
    }

    public String getNazwaDania() {
        return nazwaDania;
    }

    public void setNazwaDania(String nazwaDania) {
        this.nazwaDania = nazwaDania;
    }

    public float getCenaDania() {
        return cenaDania;
    }

    public void setCenaDania(float cenaDania) {
        this.cenaDania = cenaDania;
    }
}
