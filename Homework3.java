package jelesson3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("task 1");
        odd(100);

        System.out.println("task 2");
        int fact = 5;
        System.out.println("Fact " + fact + " = " + fact(fact));

        System.out.println("task 3, 4");
        whileOdd(100);
        System.out.println(whileFact(fact));
        doWhileOdd(100);
        System.out.println(doWhileFact(fact));

        System.out.println("task 5");
        int x = 2, n = 3;
        System.out.println(Math.pow(x, n));

        System.out.println("task 6");
        arithmProg(0, -5);

        System.out.println("task 7");
        //multTable();

        System.out.println("task 8");
        initArrayOdd(10);

        System.out.println("task 9, 10");
        int n1 = 10;
        int array[] = new int[n1];
        initArrayRandom(array, 0, 10);
        drawArray(array);
        System.out.println("Min element has index " + (findFirstMin(array) + 1));
        checkMin(array, findFirstMin(array));
        System.out.println("Max element has index " + (findFirstMax(array) + 1));
        checkMax(array, findFirstMax(array));

        System.out.println("task 11");
        swapFirstMinMax(array);

        System.out.println("task 12");
        System.out.println("Sum of elements is " + sumArray(array) + ", average is " + avgArray(array));

        System.out.println("task 13");
        drawChessBoard();
    }

    public static void odd(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void whileOdd(int n) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 != 0)
                System.out.print(i++ + " ");
        }
        System.out.println();
    }

    public static int whileFact(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void doWhileOdd(int n) {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0)
                System.out.print(i++ + " ");
        } while (i < 100);
        System.out.println();
    }

    public static int doWhileFact(int n) {
        int fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        return fact;
    }

    public static void arithmProg(int base, int step) {
        for (int i = 0; i < 10; i++) {
            System.out.print(base + " ");
            base += step;
        }
        System.out.println();
    }

    public static void multTable() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void initArrayOdd(int length) {
        int odd[] = new int[length];
        for (int n = 0, e = 0; e < odd.length; n++) {
            if (n % 2 != 0) {
                odd[e] = n;
                e++;
            }
        }
        for (int i = 0; i < odd.length; i++) {
            String div = i < odd.length - 1 ? ", " : "\n";
            System.out.print(odd[i] + div);
        }
    }

    public static void initArrayRandom(int array[], int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }

    public static void drawArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int findFirstMin(int array[]) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void checkMin(int array[], int minIndex) {
        for (int i = minIndex + 1; i < array.length; i++) {
            if (array[i] == array[minIndex]) {
                System.out.println("Element " + (i + 1) + " is equal to min");
            }
        }
    }

    public static int findFirstMax(int array[]) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[counter]) {
                counter = i;
            }
        }
        return counter;
    }

    public static void checkMax(int array[], int maxIndex) {
        for (int i = maxIndex + 1; i < array.length; i++) {
            if (array[i] == array[maxIndex]) {
                System.out.println("Element " + (i + 1) + " is equal to max");
            }
        }
    }

    public static void swapFirstMinMax(int array[]) {
        int swapMinElement = array[findFirstMin(array)];
        int swapMaxIndex = findFirstMax(array);
        array[findFirstMin(array)] = array[findFirstMax(array)];
        array[swapMaxIndex] = swapMinElement;
        drawArray(array);
    }

    public static int sumArray(int array[]) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter += array[i];
        }
        return counter;
    }

    public static double avgArray(int array[]) {
        return (double) sumArray(array) / array.length;
    }

    public static void drawChessBoard() {
        for (int row = 0; row < 8; row++) {
            for (int el = 0; el < 8; el++) {
                if ((el + row) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
