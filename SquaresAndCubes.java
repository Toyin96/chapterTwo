import java.util.Scanner;

public class SquaresAndCubes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int zeroInput = 0;
        int negativeInput = 0;
        int positiveInput = 0;

        while (i <= 5) {

            System.out.println(" Enter input: ");
            int num = input.nextInt();
            ++i;

            if (num == 0){
                ++zeroInput;
            }else{
                if (num >= 1){
                    ++positiveInput;
                }else {
                    if (num < 0){
                        ++negativeInput;
                    }
                }
            }
        }
        System.out.printf("The number of zero integers are %d, while the number of negative integers are %d, and the number of integers above 0 are %d", zeroInput, negativeInput, positiveInput);

    }
}
