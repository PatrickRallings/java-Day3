import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        int numOne = Calculations.scanner();
        System.out.println("Please enter one more number:");
        int numTwo = Calculations.scanner();
        Calculations.math(numOne, numTwo);
    }
    public static int scanner() {
        Scanner scanVal = new Scanner(System.in);
        return scanVal.nextInt();
    }
    public static void math(int numOne, int numTwo) {
        System.out.println(numOne + numTwo);
        System.out.println(numOne - numTwo);
        System.out.println(numOne * numTwo);
        System.out.println(Double.valueOf(numOne) / Double.valueOf(numTwo));
        System.out.println(numOne % numTwo);
    }
}
