package array_items;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TestingArray testingArray = new TestingArray();

        Scanner scanner = new Scanner(System.in);

        // initializing the array's elements
        for (int i = 0; i < 5; i++) {
            System.out.print("Fill in with values: ");
            testingArray.items[i] = scanner.nextInt();
        }

        // calling the methods upon the object
        System.out.println();
        testingArray.sum();
        testingArray.average();
        testingArray.even();
        testingArray.odd();
        testingArray.length();
        testingArray.displayElements();
    }
}
