package working_with_arrays;

public class AverageValueOf2dArrays {
    public static void main(String[] args) {
        int sum = 0;
        int average;

        int[][] averageValue = {{4, 5, 654, 5454, 544}, {545, 5, 6, 878, 5}};
        System.out.println("In table nr. 1, averageValue has: " + averageValue[0].length);
        System.out.println("In table nr. 2, averageValue has: " + averageValue[1].length);

        for (int[] i : averageValue) {
            for (int j : i) {
                sum += j;
            }
        }

        System.out.println("sum is: " + sum);
        average = sum / 10;
        System.out.println("The average nr of the averageValue variable is: " + average);
    }
}
