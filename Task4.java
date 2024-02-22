import java.util.Scanner;
public class Task4
{
    private static int getNumber()
    {
        while (in.hasNextLine())
        {
            if (in.hasNextInt())
            {
                return in.nextInt();
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
        in = new Scanner(System.in);

        int month = getNumber();

        if (month == 2)
        {
            System.out.println("28 / 29 days!");
        }

        else if (month % 2 == 1)
        {
            System.out.println("31 days");
        }

        else
        {
            System.out.println("30 days");
        }
    }
}
