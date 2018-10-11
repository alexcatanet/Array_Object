package working_with_arrays;

import java.util.Arrays;

public class ArrayCheckEquality {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        int[] anotherArray = {1,2,3,4,5};

        System.out.println(Arrays.equals(myArray, anotherArray));
    }
}
