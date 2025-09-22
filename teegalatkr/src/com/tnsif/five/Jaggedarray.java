package com.tnsif.five;

public class Jaggedarray {
    public static void main(String[] args) {
        // Creating and initializing jagged array in a simple way
        int[][] jaggedArr = {
            {1, 2, 3},   // Row 0 has 3 elements
            {4, 5},      // Row 1 has 2 elements
            {6, 7, 8, 9} // Row 2 has 4 elements
        };

        // Printing the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
