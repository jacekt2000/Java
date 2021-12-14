package pl.imiajd.tarzanowski;

import java.time.LocalDate;

public abstract class Instrument {
    public Instrument(String prod, LocalDate rok){
        this.producent=prod;
        this.rokProdukcji=rok;
    }

    public abstract String dzwiek();

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getRokProdukcji() {
        return this.rokProdukcji;
    }


    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }


    public String toString() {
        return "Rodzaj instrumentu: " + this.getClass().getSimpleName()+", producent: "+this.producent+", data produkcji: "+this.rokProdukcji;
    }

    private String producent;
    private LocalDate rokProdukcji;
}