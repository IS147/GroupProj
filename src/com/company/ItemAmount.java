package com.company;

import java.util.Scanner;

public class ItemAmount {
    public static void main(String[] args) {
        int[][] grocery = new int[10][5];


        int rows = 10;
        int columns = 5;

        int i, j;

        for (i = 0; i < rows; i++) {

            for (j = 0; j < columns; j++) {

                (grocery[i][j]) = 10;
            }
        }
        Scanner userInput = new Scanner(System.in);
        System.out.print("What are you buying?");
        String item = userInput.next();
        System.out.print("How much/many " + item + "are you buying?");
        int amount = userInput.nextInt();
    }
}
