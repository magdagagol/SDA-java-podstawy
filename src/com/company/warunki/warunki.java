package com.company.warunki;

import java.util.Scanner;

public class warunki {
    public static void main(String[] args) {
        int liczba;

        System.out.println("Podaj liczbę");
        Scanner wejscie = new Scanner(System.in);
        liczba = wejscie.nextInt();

        if (liczba < 10) {
            System.out.println("Liczba jest mniejsza niż 10");
        } else if (liczba == 10) {
            System.out.println("Liczba jest równa 10");
        } else {
            System.out.println("Liczba jest większa niż 10");
        }
    }
}
