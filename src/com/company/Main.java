package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(1, 1000);
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Число = ");
            number = sc.nextInt();
        } while (!game.isAnswer(number));
        sc.close();
    }
}
