package com.company.petle;

import java.util.Scanner;

public class suma2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int cyfra = 1;
        System.out.println("Aby wyjść z pętli wciśnij 0");

        while(cyfra != 0){
            System.out.println("Podaj liczbę");
            cyfra = input.nextInt();
                suma += cyfra;
        }
        System.out.println("Suma: " + suma);
    }
}
