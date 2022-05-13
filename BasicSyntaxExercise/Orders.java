package com.company;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double sum=0;
        for(int i=1;i<=n;i++){
            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsulesCount=Integer.parseInt(scanner.nextLine());
            System.out.printf("The price for the coffee is: $%.2f\n",pricePerCapsule*days*capsulesCount);
            sum+=pricePerCapsule*days*capsulesCount;
        }
        System.out.printf("Total: $%.2f",sum);
    }
}
