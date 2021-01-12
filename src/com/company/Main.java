package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадываем от 0 и до.. ?");
        int range = scanner.nextInt();
        int number = (int) (Math.random() * range);
        int count = 1;
        System.out.println("Угадайте число от 0 до " + range + ":");

        while (true) {
            int a = scanner.nextInt();
            if (number > a) {
                System.out.println("Загаданное число больше");
                count++;
            }
            else if (number < a) {
                System.out.println("Загаданное число меньше");
                count++;
            }
            else if (number == a) {
                System.out.println("Вы угадали");
                System.out.println("Количество попыток: " + count);
                break;
            }
        }

        scanner.close();

    }
}
