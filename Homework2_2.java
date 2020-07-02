package jelesson2;

import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        float sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter a number:");
            System.out.println(("Average is " + (sum += input.nextFloat()) / i));
        }
    }
}
