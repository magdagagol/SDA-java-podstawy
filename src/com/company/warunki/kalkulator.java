package com.company.warunki;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        double a, b;
        String operation;
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę a");
        a = input.nextDouble();

        System.out.println("Podaj liczbę b");
        b = input.nextDouble();

        System.out.println("Podaj znak działania");
        operation = input.nextLine();

        switch(operation) {
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                System.out.println(a / b);
                break;
            }
            case "**": {
                System.out.println(a * a);
                break;
            }
            case "^^": {
                System.out.println(Math.pow(a, 1/b));
                break;
            }
            case "*^": {
                System.out.println(Math.pow(a,b));
                break;
            }
            default: {
                break;
            }
        }
    }
}
