import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input weight in lb: ");
        float weight = in.nextFloat();
        double convertedWeight = weight * 453.6;
        System.out.println("Converted weight: " + ((int) (convertedWeight/1000)) + "kg " + ((int) (convertedWeight%1000)) + "g");
    }
}
1