package working_with_arrays;

import java.util.Scanner;

public class IndexOfArrayElement {
    private static int value_2;

    public static void main(String[] args) {
        int[] array = {5, 4, 5, 5};
        int pointer = 0;
        int currNumber;

        // listing the index of the duplicate values in an int array
        while (pointer < array.length) {
            currNumber = array[pointer];
            for (int i = 0; i < array.length; i++) {
                if (currNumber == array[i] && i > pointer) {
                    System.out.println("Duplicate for " + currNumber + " index " + i);
                    break;
                }
            }
            pointer++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Now insert a valid array element:");
        value_2 = scanner.nextInt();

        System.out.println(indexOf(array, value_2));
    }

    // this method returns the index of an array element
    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return i;

        if (value_2 != value) {
            return value;
        } else {
            System.out.println("You have inserted an invalid element value!");
        }
        return -1;
    }
}
