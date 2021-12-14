package pl.imiajd.tarzanowski;

import java.time.*;


public class Test {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Tarzanowski", new String[]{"Jacek"}, LocalDate.of(1996,3,4), false, 60000, LocalDate.of(2012,7,10));
        ludzie[1] = new Student("Kleszcz", new String[]{"Justyna"},LocalDate.of(1992,4,7),true, "matematyka",4.2);

        for (Osoba p : ludzie) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " urodzony: "+p.getDataUrodzenia()+", plec: ");
            if(p.isPlec()){
                System.out.println("Kobieta");
            }
            else {
                System.out.println("Mężczyzna");
            }
        }
    }
}