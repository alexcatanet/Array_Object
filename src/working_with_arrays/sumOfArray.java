package working_with_arrays;


import java.util.stream.IntStream;

public class sumOfArray {
    public static void main(String[] args) {
        int[] sumArray = {12, 45, 56};

        // in java 8 we can use streams and this is the first method
        int sumOfArray = IntStream.of(sumArray).sum();
        System.out.println("The sum is: " + sumOfArray);

        //  for-each syntactic sugar and this is the second method
        int sum = 0;
        for (int i : sumArray) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
