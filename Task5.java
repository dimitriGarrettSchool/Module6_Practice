import java.util.Scanner;

public class Task5
{
    private static double getNumber()
    {
        while (in.hasNextLine())
        {
            if (in.hasNextDouble())
            {
                return in.nextDouble();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }

        return 0;
    }

    private static Scanner in;

    public static void call()
    {
        System.out.println("Input 3 numbers: ");

        in = new Scanner(System.in);

        double num1 = getNumber();
        double num2 = getNumber();
        double num3 = getNumber();

        System.out.println("Biggest number: " + Math.max(num3, Math.max(num1, num2)));
    }
}
