package com.company.petle;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

    System.out.println("Podaj liczbę do silni");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int r=1;
        for(int i=1; i<=number; i++){
            r = r * i;
    }
        System.out.println("Aktualna wartość: " + r);
    }
}
