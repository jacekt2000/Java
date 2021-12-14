package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public class Flet extends Instrument{
    public Flet(String prod, LocalDate rok){
        super(prod,rok);
    }

    public String dzwiek(){
        return "fiufiufiu";
    }
}