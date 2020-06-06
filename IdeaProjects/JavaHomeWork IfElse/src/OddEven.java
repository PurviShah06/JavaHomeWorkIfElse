import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)//main method
    {
        Scanner scanner =new Scanner(System.in);//import in built class Scanner for user input value
        System.out.print("Enter 1st Number: ");//Print Value
        int val = scanner.nextInt();//define int val variable to store user input
        System.out.print("Enter 2nd Number: ");//Print Value
        int val1 = scanner.nextInt();//define int val1  variable to store user input
        //print value by using Ternary operator
        System.out.println((val%2==0)?"Your 1st Number is Even":"Your 1st Number is Odd");
        //print value by using Ternary operator
        System.out.println((val1%2==0)?"Your 2nd Number is Even":"Your 2nd Number is Odd");
    }
}
