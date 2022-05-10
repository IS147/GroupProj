package com.company;

import java.util.Scanner;
import java.util.Random;

public class NotifierArray {
        public NotifierArray() {

            //(J WHILE LOOP) CODE ENDS WHEN WHILE LOOP EXITS
            int j = 1;
            while(j > 0) {
                Random random = new Random();


                //CODE FOR ITEM LIST
                String[] itemList = {"Cookies", "Bread", "Apples", "Pasta", "Egg", "Milk", "Bacon"};


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

                //(K WHILE LOOP) WHILE LOOP SUBTRACTS FROM PRODUCTS
                int k = 1;
                while(k > 0) {

                do {

                    //DAY () OF SALES
                    day += 1;
                    System.out.println(" Day " + day + " of Sales:");

                    //CUSTOMERS BUYING PRODUCTS EVERYDAY AND RANDOM QUANTITIES (CAN'T GO PAST 0 IF NO RESTOCK)
                    int randomNum = 0;
                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[0]) {
                        quantityList[0] = 0;
                    } else {
                        quantityList[0] -= randomNum;
                    }
                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[1]) {
                        quantityList[1] = 0;
                    } else {
                        quantityList[1] -= randomNum;
                    }

                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[2]) {
                        quantityList[2] = 0;
                    } else {
                        quantityList[2] -= randomNum;
                    }

                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[3]) {
                        quantityList[3] = 0;
                    } else {
                        quantityList[3] -= randomNum;
                    }

                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[4]) {
                        quantityList[4] = 0;
                    } else {
                        quantityList[4] -= randomNum;
                    }

                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[5]) {
                        quantityList[5] = 0;
                    } else {
                        quantityList[5] -= randomNum;
                    }

                    randomNum = random.nextInt(15) + 5;
                    if(randomNum > quantityList[6]) {
                        quantityList[6] = 0;
                    } else {
                        quantityList[6] -= randomNum;
                    }


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

            Scanner userInput = new Scanner(System.in);

            //SWITCH STATEMENT FOR RESTOCKING, NOT RESTOCKING, AND EXITING

            System.out.println("Would you like to reorder? y=1 n=2");
            int answer = userInput.nextInt();


            switch (answer) {
                //EXITS K WHILE LOOP
                case 1:
                    k -= 1;
                    break;
                case 2:
                    break;
                //EXITS K THEN J WHILE LOOP
                default:
                    k -= 1;
                    j -= 1;
                    break;
                    }
                }
            }
        }
    }