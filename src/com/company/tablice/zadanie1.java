package com.company.tablice;

import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        Random rand = new Random();

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        int[] array1 = new int[s];

        int losowa_liczba = rand.nextInt();

        for(int element: array1){
            //element = rand.nextInt();
        }

        for(int i=0; i<array1.length; i++){
            array1[i] = rand.nextInt();
            System.out.println(array1[i]);
        }

        int suma = 0;
        for(int elem:array1){
            suma += elem;
        }

        double srednia = suma/array1.length;

        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);

        System.out.print("Parzyste: ");
        for(int i=0; i<array1.length; i++){
            if(array1[i]%2 == 0){
                System.out.print(array1[i] + ", ");
            }
        }

    }
}
