package com.company;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        String scan1, scan2, scan3, scan4, scan5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть 1-ше слово:");
        scan1 = scanner.nextLine();

        System.out.println("Введіть 2-ге слово:");
        scan2 = scanner.nextLine();

        System.out.println("Введіть 3-тє слово:");
        scan3 = scanner.nextLine();

        System.out.println("Введіть 4-те слово:");
        scan4 = scanner.nextLine();

        System.out.println("Введіть 5-те слово:");
        scan5 = scanner.nextLine();

        System.out.println(scan1.concat(" " + scan2).concat(" " + scan3).concat(" " + scan4).concat(" " + scan5));
            }
        }
