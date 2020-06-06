import com.sun.deploy.security.SelectableSecurityManager;

import java.time.Year;
import java.util.Scanner;

public class LeapYear { //Class for find Leap year
    public static void main(String[] args)// Main method
    {
        Scanner scanner = new Scanner(System.in);//import in built calss Scanner for user to input
        System.out.print("Enter Any Year:");// Print Value
        int year = scanner.nextInt();//define int variable to store user input value by using object scanner
        if (year % 400 == 0)//if conditon
        {
            System.out.println("Your " + year + " is Leap Year");//if =true then printing out
        } else if (year % 4 == 0 && year / 100 != 0) {//else if condition
            System.out.println("Your " + year + " is Leap Year");//if else condition
        } else {
            System.out.println("Your " + year + " is Not Leap Year");//if all if and else if condition = false
        }
    }
}




