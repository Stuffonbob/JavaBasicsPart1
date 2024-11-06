/*
Write a Java program to find the second largest number in the array.
 */
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number of element in the array: ");
        int n= scanner.nextInt();
        int []array=new int [n];
        System.out.println("Please enter the elements of the array:");
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();}
            int firstLargest=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;
            for (int num:array){
                if (num>firstLargest){
                    secondLargest=firstLargest;
                    firstLargest=num;
                } else if (num > secondLargest && num != firstLargest) {
                    secondLargest=num;
                }
            }
            if (secondLargest==Integer.MIN_VALUE){
                System.out.println("There is no second largest element in the array.");
            }else {
                System.out.println("The second largest element in the array is: "+secondLargest);
            }scanner.close();
        }
            }





