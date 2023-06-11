import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        boolean continueAsking;
        float val = 0;

        do{
            System.out.println("Type a value to add\nCurrent value: " + val);
            val = Sum(val, console.nextFloat());

            System.out.println("Add more? (Type true or false)");
            continueAsking = console.nextBoolean();
        }while (continueAsking);

        System.out.println("Result = " + val);
    }

    private static float Sum(float a, float b)
    {
        return a + b;
    }
}