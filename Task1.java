import java.util.Scanner;

public class Task1
{
    public static void call()
    {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine())
        {
            if (in.hasNextInt())
            {
                System.out.println("Number of digits: " +
                    String.valueOf(Math.abs(in.nextInt())).length());
                break;
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }
    }
}
