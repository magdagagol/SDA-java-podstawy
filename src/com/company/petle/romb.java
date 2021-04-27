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

        for(int i=0; i<7; i++){
            //System.out.print("*");
            for(int k=1; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}