package working_with_arrays;


import java.util.Scanner;

public class TestArraysValue {
    public static void main(String[] args) {

        int[] array = {1, 5, 6, 58, 5, 4};

        Scanner scanner_1 = new Scanner(System.in);
        System.out.print("Please insert a whole value:");
        int inputNumber = scanner_1.nextInt();


        if (contains(array, inputNumber)) {
            System.out.println("The array contains such a value");
        } else {
            System.out.println("The array doesn't contain such a value!");
        }
    }

    private static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }
        return result;
    }
}

