package pl.imiajd.tarzanowski;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(1999,1,9)));
        orkiestra.add(new Skrzypce("Stentor", LocalDate.of(1612,4,21)));
        orkiestra.add(new Skrzypce("Stentor", LocalDate.of(1565,3,20)));
        orkiestra.add(new Flet("EverPlay", LocalDate.of(2018,5,15)));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(2018,2,12)));
        for(Instrument ins: orkiestra)
        {
            System.out.print(ins.dzwiek()+" ");
            System.out.println(ins);
        }
        System.out.println(orkiestra.get(0).equals(orkiestra.get(4)));
        System.out.println(orkiestra.get(1).equals(orkiestra.get(2)));
        System.out.println(orkiestra.get(3).getProducent());
        System.out.println(orkiestra.get(3).getRokProdukcji());
    }
}