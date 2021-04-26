package com.company.petle;

import java.util.Scanner;

public class petlaDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int suma = 0;
        int cyfra;

        do {
            System.out.println("Podaj liczbę");
             cyfra = input.nextInt();
            if(cyfra != 0){
                suma += cyfra;
            }
        } while (cyfra != 0);

        System.out.println("Suma: " + suma);
    }
}
