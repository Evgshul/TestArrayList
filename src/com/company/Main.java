package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int Bulls;
    private static int Cows;

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> rund = new ArrayList<>();
        while (rund.size() < 4) {
            int r = rand.nextInt(10);
            rund.add(r);
        }
        System.out.print(rund);


        System.out.println();
        do {
            System.out.printf("%n %s %n", "Enter your 4 digits, separetly from 0 to 10");
            List<Integer> userNum = new ArrayList<>();
            while (userNum.size() < 4) {
                int n = scanner.nextInt();
                userNum.add(n);
            }
            int Bulls = 0;
            int Cows = 0;


            
            for (int i = 0; i < rund.size(); i++) {
                for (int j = 0; j < userNum.size(); j++) {
                    if (rund.get(i) == (userNum.get(j))) {
                        if (i == j) {
                            Bulls++;
                        } else if (i != j) {
                            Cows++;
                        }
                    }
                }
            }
            System.out.printf("Bulls %d\n", Bulls);
            if (Bulls != 4) {
                System.out.printf("Cows %d\n", Cows);
            } else {
                break;
            }
        } while (Bulls != 4);
        //System.out.println("Good bye");
        System.out.println("Congratulations! You Won!!!");
        //System.out.print("Do you want yo play again (y/n) ");
    }
}



