//AMENDED
import java.util.Scanner;

public class CH2_EX17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int sum;
        int average;
        int product;
        int maximum = number1;
        int minimum = number2;

        if (number1 < number2){
            minimum = number1;
            maximum = number2;
        }
        if (minimum > number3) minimum = number3;
        if (maximum < number3) maximum = number3;

        sum = number1 + number2 + number3;
        System.out.println("Sum is: " + sum);

        average = (number1 + number2 + number3) / 3;
        System.out.println("Average numbers is: " + average);

        product = number1 * number2 * number3;
        System.out.println("Product is: " + product);

        System.out.println("Minimum is: " + minimum);
        System.out.println("Maximum is: " + maximum);



    }
}