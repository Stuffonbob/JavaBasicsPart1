/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program that will identify/print the even numbers only.
*/
public class Q3 {
    public static void main(String[] args) {
    int [][] array ={
            {10,29,33,45},
            {99,32,44,53},
            {84,31,2,11},
            {73,22,55,88}
    };

    for(int [] rows : array){ //this pulls the 1D arrays from the 2D arrays
        for(int num: rows){ //this pulls the individual elements from each 1D array
            if(num%2==0){ //this checks if each element is even
                System.out.println(num);
            }
        }
    }

    }
}
