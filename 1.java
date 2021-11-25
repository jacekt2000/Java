package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {

    public static int getRandomInt(int ceiling) {
        Random random = new Random();
        return random.nextInt(ceiling);
    }
        public static double[] new_array()
    {
            double y[] = new double[10];
            y[0] = 0;
            y[1] = 1;
            Random rand = new Random();
            for (int i = 2; i < y.length; i++)
            {
                y[i] = (rand.nextFloat() + getRandomInt(10));
            }
            return y;
        }
        public static void wypisz_tablice(double[] tab, int n)
        {
            for(int i = 0; i < tab.length; i++)
            {
                System.out.print(String.format("%.2f",tab[i]) + " ");
            }
        }

        public static double srednia(double[] tab, int n)
        {
            double sum = 0;
            for(int i = 0; i<n; i++)
            {
                sum+=tab[i];
            }
            return sum/n;
        }

        public static ArrayList<Double> mniejsze(double[] tab,  int n)
        {
            ArrayList tab1 = new ArrayList<Double>();
            double srednia = srednia(tab, n);
            if (tab.length == 0)
            {
                return tab1;
            } else
            {
                for (int i = 0; i < n; i++)
                {
                    if (tab[i] < srednia)
                    {
                        tab1.add(tab[i]);
                    }
                    else
                        continue;
                }
            }
            return tab1;
        }

        public static void wypisz_mniejsze(ArrayList<Double> tab)
        {
            for (int i = 0; i < tab.size(); i++)
            {
                System.out.println(String.format("%.2f", tab.get(i)));
            }

        }

        public static double maximum(double[] tab, int n)
        {
            double max = tab[0];
            for(int i = 0; i<tab.length; i ++)
            {
                if(max<tab[i])
                {
                    max = tab[i];
                }
            }
            return max;
        }

        public static double minimum(double[] tab, int n)
        {
            double min = tab[0];
            for( int i = 0; i<tab.length; i++)
            {
                if (min>tab[i])
                {
                    min = tab[i];
                }
            }
            return min;
        }

        public static void nieparzyste(double[] tab)
        {


        }

    public static void main(String[] args)
    {

        double[] tab = new_array();
        wypisz_tablice(tab, 10);
        System.out.println("");
        System.out.println(srednia(tab, 10));
        System.out.println(mniejsze(tab, 10));
        wypisz_mniejsze(mniejsze(tab, 10));
        System.out.println(maximum(tab, 10));
        System.out.println(minimum(tab, 10));

    }
}
