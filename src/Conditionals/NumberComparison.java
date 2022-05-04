package Conditionals;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int numOne = NumberComparison.scanner();
        System.out.println("Enter another number:");
        int numTwo = NumberComparison.scanner();
        NumberComparison.output(numOne, numTwo);
    }
    public static int scanner() {
        Scanner scanVal = new Scanner(System.in);
        return scanVal.nextInt();
    }
    public static void output(int numOne, int numTwo) {
        if (numOne == numTwo) {
            System.out.println("The numbers are the same.");
        } else if (numOne > numTwo){
            System.out.println("The first number was larger than the second.");
        } else {
            System.out.println("The second number was larger than the first.");
        }
    }
}