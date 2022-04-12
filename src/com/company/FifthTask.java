package com.company;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args){
        String firstLine, secondLine;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        firstLine = scanner.nextLine();

        System.out.println("Введіть другий рядок");
        secondLine = scanner.nextLine();

        if (firstLine.length() > secondLine.length()){
            System.out.println("Перший рядок має більшу кількість символів");
        }
        if (secondLine.length() > firstLine.length()){
            System.out.println("Другий рядок має більшу кількість символів");
        }
        else{
            System.out.println("Рядки рівні");
        }
    }
}
