package working_with_arrays;


public class OddAndEven {
    private static int[] myArray = {123, 5545, 51, 51, 21, 5, 4, 8, 9, 0, 3, 4, 7, 8, 6};

    public static void main(String[] args) {

        System.out.println("Numbers of even elements are: " + findEvens());
        System.out.println("Numbers of odd elements are: " + findOdds());
    }


    private static int findEvens() {
        int numberEvens = 0;
        for (int aMyArray : myArray) {
            if (aMyArray % 2 == 0) {
                numberEvens++;
            }
        }
        return numberEvens;
    }

    private static int findOdds() {
        int numberOdds = 0;
        for (int aMyArray : myArray) {
            if (aMyArray % 2 != 0) {
                numberOdds++;
            }
        }
        return numberOdds;
    }
}