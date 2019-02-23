//AMENDED
import java.util.Scanner;

public class CH2_EX24{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int smallest;
        int largest;

        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();
        System.out.println("Enter third number: ");
        number3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        number4 = input.nextInt();
        System.out.println("Enter the fifth number: ");
        number5 = input.nextInt();

        largest = number1;
        smallest = number1;

        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;

        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number4 < smallest)
            smallest = number4;
        if (number5 < smallest)
            smallest = number5;

        System.out.printf("Largest of five integers is %d, and smallest is %d%n", largest, smallest);
    }
}

