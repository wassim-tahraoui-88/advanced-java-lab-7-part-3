package com.app.lab_0.part_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for number `n1`: ");
        int n1;
        while (true) {
            var temp = sc.nextLine();
            try {
                n1 = Integer.parseInt(temp);
                break;
            }
            catch (NumberFormatException e) {
                System.out.print("The input must be an integer, try again: ");
            }
        }
        System.out.print("Enter the value for number `n2`: ");
        int n2;

        while (true) {
            var temp = sc.nextLine();
            try {
                n2 = Integer.parseInt(temp);
                break;
            }
            catch (NumberFormatException e) {
                System.out.print("The input must be an integer, try again: ");
            }
        }

        var sum = n1 + n2;
        System.out.println("The result is: " + sum);
    }

}