package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("zadanie 1");
        RachunekBankowy saver1 = new RachunekBankowy(2000.0);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        System.out.println("Next");
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        System.out.println("zadanie 2");
        IntegerSet set = new IntegerSet();
        set.insertElement(5);
        set.insertElement(7);
        set.insertElement(9);
        set.insertElement(10);
        set.deleteElement(9);
    }
}
