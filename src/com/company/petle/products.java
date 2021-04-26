package com.company.petle;

import java.util.Scanner;

public class products {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lista = "";

        int n = 5;

        for(int i=0; i<n; i++) {
            System.out.println("Podaj nazwę produktu");
            String napis = input.next();
            lista = lista + " | " + napis;
        }
        System.out.println("Dodano do listy: " + lista);
    }
}
