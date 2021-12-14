package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public class Pracownik extends Osoba{
    public Pracownik(String nazwisko, String[] imie, LocalDate DU, boolean gender, double pensja, LocalDate DZ)
    {
        super(nazwisko,imie,DU,gender);
        this.pensja = pensja;
        this.DataZatrudnienia=DZ;
    }

    public double getPensja()
    {
        return pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik zatrudniony %s z pensją %.2f zł", this.DataZatrudnienia.toString(),this.pensja);
    }


    private double pensja;
    private LocalDate DataZatrudnienia;
}