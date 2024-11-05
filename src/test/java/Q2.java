/*
Create an array of integer values. After the array is created,
calculate the sum of all stored elements in that array.
 */
public class Q2 {
    public static void main(String[] args) {
        int[] numbers = {100, 30, 32, 43, 55, 98, 204, 38, 33};
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("The sum of all elements in this array is: " + sum);
    }
}
