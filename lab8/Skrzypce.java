package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String prod, LocalDate rok){
        super(prod, rok);
    }
    public String dzwiek(){
        return "sii";
    }
}