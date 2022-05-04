package Conditionals;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than 212:");
        int num = BoilingWater.scanner();
        BoilingWater.output(num);
    }
    public static int scanner() {
        Scanner scanVal = new Scanner(System.in);
        return scanVal.nextInt();
    }
    public static void output(int num) {
        if (num > 212) {
            System.out.println("The water is boiling!");
        } else {
            System.out.println("The water is not boiling.");
        }
    }
}
