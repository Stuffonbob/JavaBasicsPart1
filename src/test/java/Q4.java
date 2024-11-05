/*
Create a 2D array of integers. Develop a program that will calculate the
sum of even and odd numbers separately for that array.
 */
public class Q4 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 29, 33, 45},
                {99, 32, 44, 53},
                {84, 31, 2, 11},
                {73, 22, 55, 88}
        };
        int evenSum = 0; //sets up value where we will add even numbers
        int oddSum = 0; //sets up value where we will add odd numbers

        for (int[] rows : array) { //this pulls the 1D arrays from the 2D arrays
            for (int num : rows) { //this pulls the individual elements from each 1D array
                if (num % 2 == 0) { //this checks if each element is even
                    evenSum = evenSum + num;
                } else {
                    oddSum = oddSum + num;
                }
            }
        }
        System.out.println("The sum of even elements is: " + evenSum);
        System.out.println("The sum of odd elements is: " + oddSum);


    }
}
