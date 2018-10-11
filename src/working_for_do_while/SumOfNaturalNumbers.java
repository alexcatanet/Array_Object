package working_for_do_while;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 100;
        int i = 1;
        int sum = 0;

        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(" Sum  = " + sum);
    }
}
