import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 3-digits number: ");
        int number = in.nextInt();
        boolean isNotExit = true;
        while (isNotExit) {
            if ((number / 100 >= 1) && (number / 100 >= -1) && (number / 100 >= -10) && (number / 100 <= 10)) {
                int num1 = number % 10;
                int num2 = (number / 10) % 10;
                int num3 = (number / 100) % 10;
                int reverseNumber = num1 * 100 + num2 * 10 + num3;
                System.out.println(number + " + " + reverseNumber + " = " + (reverseNumber - number));
                isNotExit = false;
            } else {
                System.out.println("Invalid number.");
                System.out.print("Input 3-digits number: ");
                number = in.nextInt();
            }
        }
    }
}
