import java.util.Scanner;

public class Task3
{
    public static void call()
    {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine())
        {
            String str = in.nextLine();
            if (str.length() == 1)
            {
                if ("AEIOUaeiou".indexOf(str.charAt(0)) != -1)
                {
                    System.out.println("Vowel");
                }

                else
                {
                    System.out.println("Consonant");
                }

                return;
            }

            else
            {
                System.out.println("Length is over 1: " + str.length());
            }
        }
    }
}
