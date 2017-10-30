import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzzTest
{

    static Scanner sc;
    static FizzBuzz fb;

    private static void init()
    {
        sc = new Scanner(System.in);
        fb = new FizzBuzz();
    }

    static void println()
    {
        System.out.println();
    }

    static void println(Object o)
    {
        System.out.println(o);
    }

    static void print(Object o)
    {
        System.out.print(o);
    }

    public static void main(String[] args)
    {
        init();
        boolean test;
        int i = 0;
        while (true)
        {
            test = true;
            while (test)
            {
                test = false;
                try
                {
                    print("Enter number to test: ");
                    i = sc.nextInt();
                } catch (InputMismatchException e)
                {
                    test = true;
                    println("Please enter a number!");
                    sc.next();
                }
            }
            println(fb.fizzBuzz(i));
            println();
        }
    }

}
