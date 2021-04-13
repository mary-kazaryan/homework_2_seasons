package com.company;

import java.util.Arrays;

public class Season {

    public static void main(String[] args) {

        int season = 2;

        switch (season) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Нет такой поры года");

        }

        // Написать программу для вывода названия поры года по номеру месяца.
        // При решении используйте оператор switch-case.


    }
}
