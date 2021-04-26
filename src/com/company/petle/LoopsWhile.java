package com.company.petle;

import java.util.Random;

public class LoopsWhile {
    public static void main(String[] args) {
        Random r = new Random();
        int i = -1;

        while (i%5 !=0) {
            i = r.nextInt(10);
            System.out.println("wartość: " + i);
        }
    }
}
