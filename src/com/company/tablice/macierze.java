package com.company.tablice;

public class macierze {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };

        int[][] matrix2 = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };

        int[][] matrix3 = new int[3][4];

        for(int i=0; i<matrix3.length; i++){
            for (int j=0; j<matrix3.length; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<matrix3.length; i++){
            for (int j=0; j<matrix3.length; j++){
               System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
