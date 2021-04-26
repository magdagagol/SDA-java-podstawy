package com.company.typy;

import java.util.Scanner;

public class ZadanieA {
    public static void main(String[] args) {

        double cm;
        double inch;
        System.out.println("Podaj wartość w cm");
        Scanner wejscie = new Scanner(System.in);
        cm = wejscie.nextDouble();
        inch = cm / 2.54;

        System.out.println("Wartość w calach: " + inch);
    }
}
