/*
Write a Java program to check whether a given number is prime or not.
 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        //set up a scanner to ask user for a number to check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to check if it is prime or not: ");
        int num = scanner.nextInt();

        //set up boolean for conditional statements
        boolean prime = true;
        /*
        a prime numbers can only be divided by itself and 1
        if it can be divided by any number other than those, it is not prime
         */
        for (int x = 2; x <= num / 2; x++) {
            // condition for nonprime number
            if (num % x == 0) {
                prime = false;
                break;
            }
        }
        //can't check 0 or 1 with the for loop so define them here
        if(num==0 || num==1){
            prime=false;
        }

        if (prime) {
            System.out.println("The number: " + num + " is prime");
        } else {
            System.out.println("The number: " + num + " is not prime");
        }
    }
}






