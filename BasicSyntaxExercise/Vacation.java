package com.company;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeopleInTheGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double totalPrice = 0;
        switch (typeGroup) {
            case "Students": {
            if(dayOfTheWeek.equals("Friday")){
                totalPrice=numPeopleInTheGroup*8.45;
                if(numPeopleInTheGroup>=30){
                    totalPrice*=0.85;
                }
            }
            else if(dayOfTheWeek.equals("Saturday")){
                totalPrice=numPeopleInTheGroup*9.80;
                if(numPeopleInTheGroup>=30){
                    totalPrice*=0.85;
                }
            }
            else if(dayOfTheWeek.equals("Sunday")){
                totalPrice=numPeopleInTheGroup*10.46;
                if(numPeopleInTheGroup>=30){
                    totalPrice*=0.85;
                }
            }
                break;
            }
            case "Business":{
                if(dayOfTheWeek.equals("Friday")){
                    totalPrice=numPeopleInTheGroup*10.90;
                    if(numPeopleInTheGroup>=100){
                        totalPrice-=109;
                    }
                }
                else if(dayOfTheWeek.equals("Saturday")){
                    totalPrice=numPeopleInTheGroup*15.60;
                    if(numPeopleInTheGroup>=100){
                        totalPrice-=156;
                    }
                }
                else if(dayOfTheWeek.equals("Sunday")){
                    totalPrice=numPeopleInTheGroup*16;
                    if(numPeopleInTheGroup>=100){
                        totalPrice-=160;
                    }
                }
                break;
            }
            case "Regular":{
                if(dayOfTheWeek.equals("Friday")){
                    totalPrice=numPeopleInTheGroup*15;
                    if(numPeopleInTheGroup>=10 && numPeopleInTheGroup<=20){
                        totalPrice*=0.95;
                    }
                }
                else if(dayOfTheWeek.equals("Saturday")){
                    totalPrice=numPeopleInTheGroup*20;
                    if(numPeopleInTheGroup>=10 && numPeopleInTheGroup<=20){
                        totalPrice*=0.95;
                    }
                }
                else if(dayOfTheWeek.equals("Sunday")){
                    totalPrice=numPeopleInTheGroup*22.50;
                    if(numPeopleInTheGroup>=10 && numPeopleInTheGroup<=20){
                        totalPrice*=0.95;
                    }
                }
                break;
            }
            default:
                break;


        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
