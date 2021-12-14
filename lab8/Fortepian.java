package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String prod, LocalDate rok){
        super(prod, rok);
    }
    public String dzwiek(){
        return "ding";
    }
}
