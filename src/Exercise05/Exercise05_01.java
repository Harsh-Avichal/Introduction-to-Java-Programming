/*
    5.1  A pentagonal number is defined as n(3n–1)/2 for n = 1 ,2...
         and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . ..
         Write a method with the following header that returns a pentagonal number:

       --> public static int getPentagonalNumber(int n)

         Write a test program that uses this method to display the first 100 pentagonal
         numbers with 10 numbers on each line.
 */
/*
     Author : Harsh Avichal.
     ID     : 20CS005
     Email  : 20CS005@charusat.edu.in
 */
package Exercise05;
import java.util.Scanner;
// Importing Scanner class
public class Exercise05_01 {
    // Declared a class named Exercise05_01

    static  int getPentagonalNumber(int n){
        // Created a method named getPentagonalNumber having int as its return type.
        return n * (3 * n - 1) /2;
        // returned the formula to obtain the Pentagonal Numbers.
    }

    public static void main(String[] args) {
        // Declared main Method
      Scanner sc = new Scanner(System.in);
        // Created a Scanner object.
      System.out.print("Enter the number up to which you want Pentagonal Numbers :");
        // SOP for printing the sentence.
      int n = sc.nextInt();
        // Declared variable n having int DataType to take user Input.
        for (int i = 1; i <= n; i++) {
        // Created a for loop and a variable i having int DataType which runs from 1 to n.
            System.out.print(getPentagonalNumber(i) + " ");
        // Called getPentagonalNumber Method and print the possible output using SOP.
            if(i % 10 == 0){
        // Created if block
                System.out.println();
        // SOP for a new line.
            }
        }
    }
}
