package com.company.petle;

import java.util.Scanner;

public class LoopsFor {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i=0; i<=number; i++){
            System.out.println("Aktualna wartość: " + i);
        }
    }
}