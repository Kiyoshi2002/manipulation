package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String str1 = scanner.nextLine();

        System.out.println("Replace something from the String");
        String str2 = scanner.nextLine();

        if (!str1.contains(str2)) {
            System.out.println("String/Character to replace is not found: ");

            return;
        }
        System.out.println("Replace " + str2 + " with what?");
        String str3 = scanner.nextLine();

        System.out.println("New String : " + str3 + " doesn't need a remark.");



    }
}