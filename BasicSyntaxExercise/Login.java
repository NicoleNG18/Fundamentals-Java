package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char ch;
        String reversedName = "";
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            reversedName = ch + reversedName;
        }
        String password = scanner.nextLine();
        int count = 0;
        boolean check = false;
        while (!(password.equals(reversedName))) {
            if (count == 3) {
                System.out.printf("User %s blocked!", name);
                check = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            count++;
            password = scanner.nextLine();
        }
        if (!check) {
            System.out.printf("User %s logged in.", name);
        }

    }
}














