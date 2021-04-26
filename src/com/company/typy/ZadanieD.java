package com.company.typy;

import java.util.Scanner;

public class ZadanieD {
    public static void main(String[] args) {
        int h, m ,s;
        double droga;
        Scanner wejscie = new Scanner(System.in);

        System.out.println("Ile godzin");
        h = wejscie.nextInt();

        System.out.println("Ile minut");
        m = wejscie.nextInt();

        System.out.println("Ile sekund");
        s = wejscie.nextInt();

        System.out.println("Dystans");
        droga = wejscie.nextDouble();

        int sumaSekund = h * 3600 + m * 60 + s;

        double metryNaSek = droga / sumaSekund;
        System.out.println("Dystans w metrach na sekundę: " + metryNaSek);

        double metryNaMin = droga / sumaSekund / 60;
        System.out.println("Dystans w metrach na godzinę: " + metryNaMin);

        double metryNaMile = droga / 1609;
        System.out.println("Dystans w memilach na godzinę: " + metryNaMile/metryNaMile);
    }
}
