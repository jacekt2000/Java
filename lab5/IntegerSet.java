package com.company;

public class IntegerSet {

    public boolean[] tab;

    public IntegerSet() {
        tab = new boolean[100];
    }

    public static IntegerSet union(IntegerSet num1, IntegerSet num2) {
        IntegerSet nowy = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (num1.tab[i] || num2.tab[i]) {
                nowy.tab[i] = true;
            }
        }
        return nowy;
    }

    public static IntegerSet intersection(IntegerSet num1, IntegerSet num2) {
        IntegerSet nowy = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (num1.tab[i] && num2.tab[i]) {
                nowy.tab[i] = true;
            }
        }
        return nowy;
    }

    public void insertElement(int i) {
        tab[i - 1] = true;
    }

    public void deleteElement(int i) {
        tab[i - 1] = false;
    }
}
