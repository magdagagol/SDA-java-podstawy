package com.company.mojeTesty;

public class testZasieguZmiennych {
    //public static void main(String[] args) {
            private static int a;

            public static void main(String[] args) {
                int a = 5;
                System.out.println(f(a));
                System.out.println(f(a));
                System.out.println(a);
            }

            public static int f(int x) {
                System.out.println("a: "+a);
                a++;
                return a + x;
            }
   // }
}
