import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        float sum = in.nextFloat();
        System.out.println("Enter deposit percent: ");
        float percent = in.nextFloat();
        System.out.println("Enter deposin time, up to 12 month: ");
        float time = in.nextFloat();
        float profit = (sum * (percent/100) * time)/12;
        System.out.println("Your deposit profit: " + profit);
    }
}
