package array_items;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestingArray {
    int[] items = new int[5];

    void sum() {
        int sum = 0;
        for (int i : items) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    void average() {

        int sum = IntStream.of(items).sum();
        int average = sum / 5;

        System.out.println("The average value of the array's elements are: " + average);
    }

    void even() {
        int evens = 0;
        for (int i : items) {
            if (i % 2 == 0) {
                evens++;
            }
        }
        System.out.println("The number of evens elements are: " + evens);
    }

    void odd() {
        int odds = 0;
        for (int i : items) {
            if (i % 2 != 0) {
                odds++;
            }
        }
        System.out.println("The number of odds elements are: " + odds);
    }

    public void length() {

        int length;
        length = items.length;
        System.out.println("The length of the actual array is: " + length);
    }

    void displayElements() {

        String display;
        display = Arrays.toString(items);
        System.out.println("The value of each individual element in the array is: " + display);
    }
}
