package working_with_arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] array_1 = {10, 5, 8, 7, 25};
        int[] newArray = new int[5];

        System.out.println("Source array: " + Arrays.toString(array_1));

        // first method
        for (int i = 0; i < array_1.length; i++) {
            newArray[i] = array_1[i];
        }

        System.out.println("Source array is: " + Arrays.toString(newArray));
    }
}

    /*
    Second method:
    System.arraycopy(array_1, 0, newArray, 0, array_1.length);
    */