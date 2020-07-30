import java.util.Scanner;

public class Calculation
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);//import inbuilt class Scanner
        System.out.print("Input Value :- ");//printing out for user input
        int fooBarBuz =scanner.nextInt();//define variable
        if (fooBarBuz%3 == 0){
            System.out.println("foo");
        }else if (fooBarBuz%5 == 0){
            System.out.println("bar");

        }else if (fooBarBuz%5 ==0 && fooBarBuz%3 == 0){
            System.out.println("baz");
        }



    }
}
