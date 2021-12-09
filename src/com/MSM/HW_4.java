package com.MSM;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        int number, x, y, t;
        String primeNumber = "";
        System.out.print("Input you number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for (x = 1; x < number; x++)
        {
            int z = 0;

            for (y = x; y >= 1; y--)
            {
                if (x % y == 0) {
                    z = z + 1;
                }
            }
            if (z == 2) {
                primeNumber = primeNumber + x + "";
            }
        }
        System.out.println(primeNumber);
    }

}
