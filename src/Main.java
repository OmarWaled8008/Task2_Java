// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
// class or library to take a input from the user

public class Main {
    public static void main(String[] args) {
    pattern1();
    System.out.println();
    pattern2();
        }
        // this is the first pattern in the task
        public static void pattern1() {
        // here the user enter the number of the lines he wants in the pattern
            System.out.println("enter the number of the stars lines : ");
            Scanner myObj = new Scanner(System.in);
            int n=myObj.nextInt();
            // here we use two nested loops to print the pattern
            // the outer loop conut from 1 to n (the number of the lines)
            // it's controls the number of the lines
            for (int i = 1; i <= n; i++) {
                // the inner loop counts from 1 to i (the current line number)
                // it's controls the number of the (*) in each line
                // according to the count, the number of (*) is in the line
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    // this is the bouns  pattern in the task
    public static void pattern2() {
        System.out.println("enter the number of the stars lines : ");
        Scanner myObj = new Scanner(System.in);
        int n=myObj.nextInt();
        // here we use two nested loops to print the pattern
        // the outer loop conut from 1 to n (the number of the lines)
        // it's controls the number of the lines
        for (int i = 1; i <= n; i++) {
            // this loop prints space based on line number
            // the number of spaces decreases as the line number increases
            //and form an inverted triangle
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // this loop prints (*) based on line number
            // (i * 2 - 1) is used to calculate the number of asterisks to be printed on each line
            //and form a pyramid shape
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


