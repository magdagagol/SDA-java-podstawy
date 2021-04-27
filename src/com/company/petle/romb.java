package com.company.petle;

public class romb {
    public static void main(String[] args) {
        // ascii A = 61
        int starter = 61;

        char a,b;

        for(int i=7; i>0; i--){
            for(int k=1; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=7; i>0; i--){
            for(int k=1; k<i; k++){
                System.out.print("k" + k);
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        for(int j=1; j<7; j++){
            for(int k=0; k<j; k++){
                System.out.print("-");
            }
            System.out.println();
        }*/

    }
}