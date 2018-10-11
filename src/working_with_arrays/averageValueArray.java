package working_with_arrays;

import java.util.stream.IntStream;

public class averageValueArray {
    public static void main(String[] args) {
        int[] averageArray = {2, 4, 5, 6, 5, 5, 4, 4};
        System.out.println("averageArray has: " + averageArray.length + " elements.");
        int sum = IntStream.of(averageArray).sum();

        int average = sum / 8;
        System.out.println("The average value of the array's elements are: " + average);
    }
}
