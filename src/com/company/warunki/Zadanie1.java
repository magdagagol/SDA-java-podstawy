package com.company.warunki;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę:");

        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        if (liczba % 2 != 0) {
            System.out.println("Liczba nieparzysta");
        } else {
            System.out.println("Liczba parzysta");
        }
    }
}
