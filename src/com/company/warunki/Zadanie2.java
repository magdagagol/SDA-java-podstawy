package com.company.warunki;


import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int a, b , c;
        Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        a = wejscie.nextInt();
        b = wejscie.nextInt();
        c = wejscie.nextInt();

        if ((a+b > c) && (b+c > a) && (a+c > b)){
            System.out.println("Będzie trojkat");
        } else {
            System.out.println("Nie bedzie trojkata");
        }

    }
}
