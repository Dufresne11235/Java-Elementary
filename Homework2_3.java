package jelesson2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        double depSum = 0;
        double percent = 0;
        int years = 0;
        boolean compoundInterest = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sum:");
        depSum = input.nextDouble();
        System.out.println("Enter percent:");
        percent = input.nextDouble() / 100;
        System.out.println("Enter years:");
        years = input.nextInt();

        double baseSum = depSum;
        double totalPercents = 0;
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 1; i <= years; i++) {
            System.out.println(i + " year");
            System.out.println("Base sum is " + df.format(baseSum));
            System.out.println("Annual percents are " + df.format(baseSum * percent));
            System.out.println("Total percents are " + df.format(totalPercents += baseSum * percent));
            System.out.println("Total deposit is " + df.format(depSum + totalPercents));
            if (compoundInterest == true) {
                baseSum *= (1 + percent);
            }
        }
    }
}
