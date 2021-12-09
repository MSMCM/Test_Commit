package com.MSM;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        int number, x, y, z, q, w, t, u;

        System.out.print("Input you number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        u = String.valueOf(number).length();
        System.out.println("The length number is :" + u);
        if (u == 4) {
            x = number / 1000;
            y = number / 100 % 10;
            z = number / 10 % 10;
            q = number % 10;
            System.out.println("The first digit is : " + x);
            System.out.println("The second digit is : " + y);
            System.out.println("The third digit is : " + z);
            System.out.println("The forth digit is : " + q);
            if (x == q && y == z) {
                System.out.println("The number is 4 digits palindrome");
            } else {
                System.out.println("The number isn't palindrome");
            }
        } else {
            if (u == 5) {
                x = number / 10000;
                y = number / 1000 % 10;
                t = number / 100 % 10;
                q = number / 10 % 10;
                w = number % 10;
                System.out.println("The first digit is : " + x);
                System.out.println("The second digit is : " + y);
                System.out.println("The third digit is : " + t);
                System.out.println("The forth digit is : " + q);
                System.out.println("The fifth digit is : " + w);
                if (x == w && y == q) {
                    System.out.println("The number is 5 digits palindrome");
                } else {
                    System.out.println("The number isn't palindrome");
                }
            }
        }
        if (u != 4 && u != 5) {
            System.out.println("Case not treated in this project");

        }
    }
}

