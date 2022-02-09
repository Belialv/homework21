package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arraySize = 5, temp = 0;
        String inf;
        int[][] array = new int[arraySize][arraySize];
        Random newRandomNumber = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = newRandomNumber.nextInt(21) + -10;
                System.out.printf(String.valueOf(array[i][j]));
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i][j] < 0) {
                    System.out.printf(String.valueOf(i), j);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i][j] > 0) {
                    System.out.printf(String.valueOf(i), j);
                }
            }
        }


    }

}
