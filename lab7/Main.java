package pl.imiajd.tarzanowski;

public class Main {
    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(2, 4, "parking");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "dom");
        c.show();

        a = (NazwanyPunkt) c;
        a.show();

        Adres adres1= new Adres("Sienkiewicza","41","26-110","Skarżysko-Kamienna");
        Adres adres2= new Adres("Zimowa","2", "16","10-380","Olsztyn");
        Adres adres3= new Adres("Jasna","5", "1","00-001","Warszawa");
        adres1.pokaz();
        adres2.pokaz();
        adres3.pokaz();
        System.out.println(adres1.przed(adres2));
        System.out.println(adres1.przed(adres3));
    }
}
