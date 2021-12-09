package com.MSM;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        int number;
        System.out.print("Input you number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
//        int number = input.nextInt();
        number = number % 10;
        System.out.println("The max digit is :" +number);

    }
}
