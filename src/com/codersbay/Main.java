package com.codersbay;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int[][] bingo = new int[5][5];

        //filling up array with random numbers
        for (int i = 0; i < bingo.length; i++) {
            int number;
            for (int k = 0; k < bingo[i].length; k++) {
                if (i == 2 && k == 2) {
                    number = 0;
                } else {
                    number = r.nextInt(16);
                    number += i * 15;

                    //check for and replace doubled integers
                    while (number == bingo[i][0] || number == bingo[i][1] || number == bingo[i][2] || number == bingo[i][3] || number == bingo[i][4]) {
                        number = r.nextInt(16);
                        number += i * 15;
                    }
                }

                bingo[i][k] = number;
            }
        }


        // print out bingo card
        System.out.println("BINGO!");
        for (int i = 0; i < bingo.length; i++) {

            for (int k = 0; k < bingo[i].length; k++) {
                System.out.printf("%3d", bingo[i][k]);
            }
            System.out.println();
        }

    }


}