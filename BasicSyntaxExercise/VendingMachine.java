package com.company;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;
        String command=scanner.nextLine();
        while(!(command.equals("Start"))){
            double money=Double.parseDouble(command);
            if (money == 1.0 || money == 2.0 || money == 0.5 || money == 0.2 || money == 0.1) {
                totalMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f", money);
                System.out.println();
            }
            command=scanner.nextLine();
        }
        String products=scanner.nextLine();
        while(!(products.equals("End"))){
            switch (products){
                case "Nuts":{
                    if(totalMoney<2.0){
                        System.out.println("Sorry, not enough money");
                    }
                    else{
                        totalMoney-=2.0;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                }
                case "Water":{
                    if(totalMoney<0.7){
                        System.out.println("Sorry, not enough money");
                    }
                    else{
                        totalMoney-=0.7;
                        System.out.println("Purchased Water");
                    }
                    break;
                }
                case "Crisps":{
                    if(totalMoney<1.5){
                        System.out.println("Sorry, not enough money");
                    }
                    else{
                        totalMoney-=1.5;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                }
                case "Soda":{
                    if(totalMoney<0.8){
                        System.out.println("Sorry, not enough money");
                    }
                    else{
                        totalMoney-=0.8;
                        System.out.println("Purchased Soda");
                    }
                    break;
                }
                case "Coke":{
                    if(totalMoney<1.0){
                        System.out.println("Sorry, not enough money");
                    }
                    else{
                        totalMoney-=1.0;
                        System.out.println("Purchased Coke");
                    }
                    break;
                }
                default:
                    System.out.println("Invalid product");
                    break;
            }
            products=scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalMoney);
    }
}
