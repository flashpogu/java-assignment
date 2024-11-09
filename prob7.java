/*Write a program that takes an itegers from the user (where n is also provided by the user). 
Store the numbers in an array and write a method to find and display the second largest number in the array.*/


import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printPyramid(n);
    }

    public static void printPyramid(int n) {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row value
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }
}
