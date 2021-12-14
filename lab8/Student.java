package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public class Student extends Osoba{
    public Student(String nazwisko, String[] imie, LocalDate DU, boolean gender, String kierunek, double SO)
    {
        super(nazwisko,imie,DU,gender);
        this.kierunek = kierunek;
        this.sredniaOcen=SO;
    }

    public String getOpis()
    {
        return "kierunek studiow:  " + this.kierunek + " ze średnią: "+this.sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}