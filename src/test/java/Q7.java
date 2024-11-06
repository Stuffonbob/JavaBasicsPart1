import java.util.Scanner;

/*
Write a Java Program to print the first 10 numbers of the Fibonacci series.
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input a number for the Fibonacci Sequence: ");
        int x = scan.nextInt();     // SCANNER

        if (x <= 1) System.out.println(x);      // because the first numbers are able to be out putted right out without the Sequence

        int [] k = new int [x + 1];     // where you store the FIB

        k[0] = 0;   // initialize the first set of numbers for the FIB
        k[1] = 1;

        for (int i = 2; i <= x; i++) {      // for loop to go through the array
            k[i] = k[i - 1] + k[i - 2];     // the math for the Sequence, -1 array POS and -2 for the 2nd POS then you add them together to get TOTAL
        }
        System.out.print(k[x]);
    }
}
