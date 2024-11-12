package com.app.lab_0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for number `n1`: ");
        var n1 = sc.nextInt();
        System.out.print("Enter the value for number `n2`: ");
        var n2 = sc.nextInt();

        var sum = 0;

        sum = n1 + n2;

        System.out.println("The result is: " + sum);
    }

}