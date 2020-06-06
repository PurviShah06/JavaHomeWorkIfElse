import java.util.Scanner;

public class AgeEligibilityCheck// Class name
{
    public  static void main(String[] args)// Main method
    { Scanner scanner = new Scanner(System.in);//import inbuilt class Scanner
        System.out.print("Enter Your Age:- ");//printing out for user input value
        byte age = scanner.nextByte();//define byte variable to store user input
        if (age>=18){// if condition
            System.out.println("You Are Eligible for Vote");//if =true then print out
        }else {//if =false then else condition
            System.out.println("You Are NOT Eligible for Vote");//if else =ture then print out
        }
    }
}
