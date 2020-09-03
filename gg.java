import java.util.Scanner;

public class gg
{

   public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        greet();
    }

    public static void greet()
    {
        String prefix = "";
;       while(!prefix.equalsIgnoreCase("goodbye"))
        {

            prefix = readGreeting();
            printGreeting(prefix);
        }
    }

    public static String readGreeting()
    {
        System.out.print("Prefix? ");
        String prefix = in.nextLine();

        return prefix;
    }

    public static void printGreeting(String prefix)
    {
        System.out.println(prefix + " world");
    }

}

