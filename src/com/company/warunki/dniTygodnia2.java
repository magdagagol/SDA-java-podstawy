package com.company.warunki;

import java.util.Scanner;

public class dniTygodnia2 {
    public static void main(String[] args) {
        System.out.println("Podaj dzień tygodnia");

        Scanner input = new Scanner(System.in);
        String day = input.nextLine();

        switch(day) {
            case "poniedzialek": {
                System.out.println(1);
                break;
            }
            case "wtorek": {
                System.out.println(2);
                break;
            }
            case "sroda": {
                System.out.println(3);
                break;
            }
            case "czwartek": {
                System.out.println(4);
                break;
            }
            case "piatek": {
                System.out.println(5);
                break;
            }
            case "sobota": {
                System.out.println(6);
                break;
            }
            case "niediela": {
                System.out.println(7);
                break;
            }
            default: {
                break;
            }
        }
    }
}
