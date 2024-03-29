package pl.imiajd.tarzanowski;

public class Osoba
{
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko,int rokUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString()
    {
        String wynik = "";
        wynik += this.nazwisko + " " + Integer.toString(this.rokUrodzenia);
        return wynik;
    }

    public String getNazwisko()
    {
        return this.nazwisko;
    }

    public int getrokUrodzenia()
    {
        return this.rokUrodzenia;
    }
}