package com.company;

import java.util.Locale;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args){
        String firstName, secondName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше ім'я:");
        firstName = scanner.nextLine();

        System.out.println("Введіть друге ім'я:");
        secondName = scanner.nextLine();

        boolean ident = firstName.toLowerCase().equals(secondName.toLowerCase());
        if(ident == true){
            System.out.println("Імена ідентичні");
        }
        else{
            System.out.println("Імена не ідентичні");
        }
    }
}
