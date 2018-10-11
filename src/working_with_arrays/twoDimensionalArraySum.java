package working_with_arrays;


public class twoDimensionalArraySum {
    public static void main(String[] args) {

        int[][] sumArray = {{4,5,6}, {8,9,10}};
        int sum = 0;

        for (int[] i : sumArray) {
            for (int j : i) {
                sum += j;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
