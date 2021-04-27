package com.company.tablice;

public class Zadanie2 {
    public static void main(String[] args) {
        String arr[] = {"Anna", "Barbara", "Celina", "Danuta", "Emilia"};
        String napis = "";

        for(String elem : arr){
            if(elem.length()>5) {
                napis += elem + ",";
            }
        }

        System.out.println(napis);
    }
}
