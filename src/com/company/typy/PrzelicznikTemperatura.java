package com.company.typy;

import java.util.Scanner;

public class PrzelicznikTemperatura {
    public static void main(String[] args) {
        double cels, far;

        System.out.println("Podaj temperaturę w stopniach Celsjusza");
        Scanner wejscie = new Scanner(System.in);
        cels = wejscie.nextDouble();

        far = 32 + (1.8 * cels);

        System.out.println("Wartość temeperatury w stopniach Fahrenheity: " + far);
    }
}
