package com.company.tablice;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,7,8,8,3};
        int[] arr2 = new int [arr1.length];

        for(int i=0; i<arr1.length; i++){
          arr2[i] = arr1[arr1.length - 1 - i];
        }

        for(int elem : arr2){
            System.out.println(elem);

        }
    }
}
