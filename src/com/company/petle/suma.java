package com.company.petle;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        System.out.println("ile razy chcesz obrócić pętle?");
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Podaj liczbę");
            int cyfra = input.nextInt();
            if(cyfra != 0){
                suma += cyfra;
            } else {
                break;
            }
        }
        System.out.println("Suma: " + suma);
    }
}
