package pl.imiajd.tarzanowski;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania="";
    private String miasto;
    private String kod;

    public Adres(String ulica, String numer_domu, String kod_pocztowy, String miasto){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.kod=kod_pocztowy;
        this.miasto=miasto;
    }
    public Adres(String ulica, String numer_domu, String numer_mieszkania, String kod_pocztowy, String miasto){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
        this.kod=kod_pocztowy;
        this.miasto=miasto;
    }
    public void pokaz(){
        System.out.println(this.kod + " " + this.miasto);
        System.out.print(this.ulica + " " + this.numer_domu);
        if(!this.numer_mieszkania.equals("")){
            System.out.print("/" + this.numer_mieszkania);
        }
        System.out.println();
    }

    public boolean przed(Adres porownanie){
        int[] tab={0,1,3,4,5};
        StringBuilder kod_pierwszy= new StringBuilder();
        StringBuilder kod_drugi= new StringBuilder();
        for(int i : tab){
            kod_pierwszy.append(porownanie.kod.charAt(i));
            kod_porownywany.append(this.kod.charAt(i));
        }
        int pierwszy=Integer.parseInt(kod_pierwszy.toString());
        int drugi=Integer.parseInt(kod_drugi.toString());

        return pierwszy<drugi;
    }
}