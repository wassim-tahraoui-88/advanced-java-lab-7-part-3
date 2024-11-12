package com.app.lab_0.part_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for number you want to double: ");
        int n;
        while (true) {
            var temp = sc.nextLine();
            try {
                n = Integer.parseInt(temp);
                break;
            }
            catch (NumberFormatException e) {
                System.out.print("The input must be an integer, try again: ");
            }
        }

        System.out.println("The result is: " + n);
    }

}