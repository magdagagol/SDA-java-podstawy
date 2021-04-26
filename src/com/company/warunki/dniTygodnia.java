package com.company.warunki;

import java.util.Scanner;

public class dniTygodnia {
    public static void main(String[] args) {
        System.out.println("Podaj cyfrę obrazującą dzień tygodnia");

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch(day) {
            case 1: {
                System.out.println("Poniedziałek ;(");
                break;
            }
            case 2: {
                System.out.println("Wtorek");
                break;
            }
            case 3: {
                System.out.println("Środa");
                break;
            }
            case 4: {
                System.out.println("Czwartek");
                break;
            }
            case 5: {
                System.out.println("Piątek! Hello weekend!");
                break;
            }
            case 6: {
                System.out.println("Sobota");
                break;
            }
            case 7: {
                System.out.println("Niedziela");
                break;
            }
            default: {
                break;
            }
        }

    }
}
