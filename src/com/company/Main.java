package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> rund = new ArrayList<>();
        Random rand = new Random();
        while (rund.size() < 4) {
            int r = rand.nextInt(10);
            rund.add(r);
        }
        System.out.print(rund);

        List<Integer> userNum = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        //GuessNumbers num = new GuessNumbers();
        while (userNum.size() < 4) {
            int n = scanner.nextInt();
            userNum.add(n);
        }
        //int n1 = scanner.nextInt();
        //num.n2 = scanner.nextInt();
        //num.n3 = scanner.nextInt();
        //num.n4 = scanner.nextInt();
        //userNum.add(n);

        //for (GuessNumbers n : userNum) {
        //  System.out.printf("%d %d %d %d\n", n.n1, n.n2, n.n3, n.n4);
        // System.out.println(userNum.size());
        // }
        for (int i = 0; i < rund.size(); i++) {
            for (int j = 0; j < userNum.size(); j++) {
                if (rund.get(i) == (userNum.get(j))) {
                    if (i == j) {
                        System.out.printf("Bulls %d %d\n", userNum.get(j), i);
                    } else if (i != j) {
                        System.out.printf("Cows %d\n", userNum.get(j));

                    }

                }
            }
        }
    }
}



