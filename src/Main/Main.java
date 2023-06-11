package Main;
import java.util.Scanner;
import Class.*;
import Math.Operations;

public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        boolean continueAsking;
        float val = 0;

        Operations op = new Operations();

        Person person = new Person("Arnulfo");
        Person person1 = new Person("Saul");

        person.PrintName();
        person1.PrintName();

        System.out.println(op.Add(10, 15));
        System.out.println(Operations.Cross(3,10));

//        do{
//            System.out.println("Type a value to add\nCurrent value: " + val);
//            val = Sum(val, console.nextFloat());
//
//            System.out.println("Add more? (Type true or false)");
//            continueAsking = console.nextBoolean();
//        }while (continueAsking);
//
//        System.out.println("Result = " + val);
    }
}
