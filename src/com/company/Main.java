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
            System.out.print(rund);
        }

        List<GuessNumbers> userNum = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        GuessNumbers num = new GuessNumbers();

        num.n1 = scanner.nextInt();
        num.n2 = scanner.nextInt();
        num.n3 = scanner.nextInt();
        num.n4 = scanner.nextInt();
        userNum.add(num);

        for (GuessNumbers n : userNum) {
            System.out.printf("%d %d %d %d\n", n.n1, n.n2, n.n3, n.n4);
            System.out.println(userNum.size());
        }
        for (int i = 1; i < rund.size(); i++) {
            for (int j = 1; j < userNum.size(); j++) {
                if ((rund.get(i).equals(userNum.get(j)) == true)) {
                    System.out.printf("%n %n", i, j);
                } else if (!(userNum.get(i).equals(userNum.get(j)))==true) {
                    System.out.printf("%n %n", i, j);
                }
            }

        }
    }
}


