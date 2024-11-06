/*
Write a program to swap 2 numbers without a temporary variable.
*/
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        //set up scanner to get 2 numbers from user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        //swap numbers with arithmetic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        //print the swapped values
        System.out.println("After swap the first number is: " + num1);
        System.out.println("After swap the second number is: " + num2);
    }
}
