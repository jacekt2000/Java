package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public abstract class Osoba {
    public Osoba(String nazwisko, String[] imie, LocalDate DU, boolean gender)
    {
        this.nazwisko = nazwisko;
        this.imiona=imie;
        this.DataUrodzenia=DU;
        this.plec=gender;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return DataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate DataUrodzenia;
    private boolean plec;
}
