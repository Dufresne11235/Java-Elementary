package jelesson2;

import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        float sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        sum += input.nextFloat();
        System.out.println("Enter a number:");
        sum += input.nextFloat();
        System.out.println("Average is " + (sum / 2));
    }
}
