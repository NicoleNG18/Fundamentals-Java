package com.company;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int help=num;//40585
        int sumFac = 0;
        int fact = 1;
        while (num > 0) {
            int digit = num % 10;//5
            num = num / 10;//4058
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sumFac += fact;
            fact = 1;
        }
        if (help==sumFac) System.out.println("yes");
        else{
            System.out.println("no");
        }
    }
}
