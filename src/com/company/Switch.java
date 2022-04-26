package com.company;

import java.util.Scanner;

public class Switch {

    private static String swapCharacters(String inputString) {

        int length = inputString.length();

        if (length <= 1) {
            return inputString;
        } else {
            return inputString.charAt(length - 1) + inputString.substring(1, length - 1) + inputString.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String userInt = scanner.next();

        System.out.println("The new string is  : " + swapCharacters(userInt));

    }

}
