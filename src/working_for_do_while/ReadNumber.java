package working_for_do_while;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int input = scanner.nextInt();

        for (int i = input; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
