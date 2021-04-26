package com.company.warunki;

import java.util.Scanner;

public class ZadanieA {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n%5 == 0 || n%3 == 0) {
            if (n%5 == 0) {
                System.out.println("Jest podzielna przez 5");
            }
            if (n%3 == 0) {
                System.out.println("Jest podzielna przez 3");
            }
        } else System.out.println("Liczba nie jest podzielna przez 3 i 5");

    }
}
