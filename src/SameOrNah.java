import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        System.out.println("Please enter a word:");
        String textOne = scanner();
        System.out.println("Please enter another word:");
        String textTwo = SameOrNah.scanner();
        SameOrNah.output(textOne, textTwo);
    }
    public static String scanner() {
        Scanner scanVal = new Scanner(System.in);
        return scanVal.nextLine();
    }
    public static void output(String textOne, String textTwo) {
        if (textOne.equals(textTwo)) {
            System.out.println("These words are the same.");
        } else {
            System.out.println("These words are not the same.");
        }
    }
}
