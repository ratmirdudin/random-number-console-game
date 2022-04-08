package com.company;

public class Game {
    private final int minNumber;
    private final int maxNumber;
    private final int number;
    private int step;

    public Game() {
        this(1, 1000);
    }

    public Game(int minNumber, int maxNumber) {
        this.step = 0;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.number = (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;
        System.out.println("Угадайте число от " + this.minNumber + " до " + this.maxNumber + "," +
                " которое загадала программа");
    }

    public boolean isAnswer(int number) {
        this.step++;
        if (this.number == number) {
            System.out.println(" ");
            System.out.println("******* Ответ = " + number);
            System.out.println("Игра окончена, Вы победили!");
            System.out.println("Шагов сделано: " + this.step);
            return true;
        } else if (this.number < number) {
            System.out.println("******* Ответ < " + number);
        } else {
            System.out.println("******* Ответ > " + number);
        }
        return false;
    }

    public int getMinNumber() {
        return this.minNumber;
    }

    public int getMaxNumber() {
        return this.maxNumber;
    }
}
