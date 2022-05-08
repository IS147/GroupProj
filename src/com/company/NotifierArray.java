package com.company;

import java.util.Random;
import java.util.Scanner;

public class NotifierArray {
        public NotifierArray() {

            Scanner userInput = new Scanner(System.in);

            Random random = new Random();


            //CODE FOR ITEM LIST
            String itemList[] = {"Cookies", "Bread", "Apples", "Pasta", "Egg", "Milk", "Bacon"};


            //CREATION OF ARRAY
            int sum = 0;
            int quantityList[] = new int[7];

            //LOOP FOR VALUE OF EACH ITEM THROUGH A RANDOM NUMBER
            for (int i = 0; i < quantityList.length; i++)
                quantityList[i] = random.nextInt(250) + 100;


            for (int i = 0; i < quantityList.length; i++) {
                System.out.println(" Starting Quantity of " + itemList[i] + " is " + quantityList[i]);
            }
            int day = 0;
            System.out.println("---------------------------------------------------");

            do {

                //DAY () OF SALES
                day += 1;
                System.out.println(" Day " + day + " of Sales:");

                //CUSTOMERS BUYING PRODUCTS EVERYDAY AND RANDOM QUANTITIES
                quantityList[0] -= random.nextInt(15) + 5;
                quantityList[1] -= random.nextInt(15) + 5;
                quantityList[2] -= random.nextInt(15) + 5;
                quantityList[3] -= random.nextInt(15) + 5;
                quantityList[4] -= random.nextInt(15) + 5;
                quantityList[5] -= random.nextInt(15) + 5;
                quantityList[6] -= random.nextInt(15) + 5;

                for (int i = 0; i < quantityList.length; i++) {

                    System.out.println(" Next Day Quantity of " + itemList[i] + " is " + quantityList[i]);
                }

                System.out.println("---------------------------------------------------");
            } while (quantityList[0] >= 20 && quantityList[1] >= 20 && quantityList[2] >= 20 && quantityList[3] > 20 && quantityList[4] > 20 && quantityList[5] > 20 && quantityList[6] > 20);


            //ELSE IF STATEMENT TO GIVE THE RESTOCK NOTIFICATION
            int identifier = 0;
            if (quantityList[0] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF COOKIES, ");
                identifier = 0;
            } else if (quantityList[1] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF BREAD,");
                identifier = 1;
            } else if (quantityList[2] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF APPLES, ");
                identifier = 2;
            } else if (quantityList[3] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF PASTA, ");
                identifier = 3;
            } else if (quantityList[4] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF EGG, ");
                identifier = 4;
            } else if (quantityList[5] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF MILK, ");
                identifier = 5;
            } else if (quantityList[6] <= 20) {
                System.out.println("RESTOCK ALERT: LOW QUANTITY OF BACON, ");
                identifier = 6;
            }

            System.out.println("Would you like to reorder? y=1 n=2");
            int answer = userInput.nextInt();


            switch (answer) {
                case 1:
                    quantityList[identifier] = random.nextInt(250) + 100;
                    break;
                case 2:
                    break;
            }
        }
    }