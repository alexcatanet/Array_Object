package working_for_do_while;

import java.util.Scanner;

public class TruckNumbersAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a whole natural number: ");
        int input = scanner.nextInt();
        int count = 0;

        while (input != 0) {
            System.out.println("Entered number: " + input);
            count += input;
            input = scanner.nextInt();
        }
        System.out.println("The sum is: " + count);
    }
}
