package com.company.petle;

import java.util.Scanner;

public class ZadanieA {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            if (i%5 == 0 && i%3 == 0) {
                System.out.println("FizzBazz");
            } else if (i%5 == 0) {
                System.out.println("Bazz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else System.out.println(i);
        }
    }
}
