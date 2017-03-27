package com.restauracja;

/**
 * Created by dw on 24.03.17.
 */

public class Danie {
    private static int liczbaDan = 0;
    private int idDania = 0;
    private String nazwaDania;
    private double cenaDania;

    //uzywaj przy tworzeniu nowych dan
    public Danie(String nazwaDania, double cenaDania) {
        this.idDania = ++liczbaDan;
        this.nazwaDania = nazwaDania;
        this.cenaDania = cenaDania;
    }

    //uzywaj przy odczytywaniu dan z pliku
    public Danie(int idDania, String nazwaDania, double cenaDania) {
        this.idDania = idDania;
        this.nazwaDania = nazwaDania;
        this.cenaDania = cenaDania;
        liczbaDan++;
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

    public double getCenaDania() {
        return cenaDania;
    }

    public void setCenaDania(float cenaDania) {
        this.cenaDania = cenaDania;
    }
}
