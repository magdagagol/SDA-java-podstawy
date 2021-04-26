package com.company.typy;

import java.util.Scanner;

public class BIM {
    public static void main(String[] args) {
        double waga, wzrost, bim;

        System.out.println("Podaj wagę w kg");
        Scanner wejscie_waga = new Scanner(System.in);
        waga = wejscie_waga.nextDouble();

        System.out.println("Podaj wzrost w m");
        Scanner wejscie_wzrost = new Scanner(System.in);
        wzrost = wejscie_wzrost.nextDouble();

        bim = waga / (wzrost*wzrost);

        System.out.println("Wartość BIM: " + bim);
    }
}
