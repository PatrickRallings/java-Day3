package Conditionals;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 100:");
        double grade = TestScores.scanner();
        TestScores.output(grade);
    }
    public static double scanner() {
        Scanner scanVal = new Scanner(System.in);
        return scanVal.nextDouble();
    }
    public static void output(double grade) {
        if (grade >= 0 && grade <= 100) {
            if (grade > 90 && grade <= 100) {
                System.out.println("You got an A, congratulations!");
            } else if (grade > 80 && grade <= 90) {
                System.out.println("You got a B, good job.");
            } else if (grade > 70 && grade <= 80) {
                System.out.println("You got a C, not bad.");
            } else if (grade > 60 && grade <= 70) {
            System.out.println("You got a D, you passed, but it was close.");
            } else {
            System.out.println("You got an F. Please see me after class.");
            }
        } else {
            System.out.println("This is not a valid grade.");
        }
    }
}
