import com.sun.deploy.security.SelectableSecurityManager;
import java.util.Scanner;
public class Identify_Numeric_Alphabet_Symbol ////class
{
    public static void main(String[] args)// main method
    {   Scanner scanner = new Scanner(System.in);//inbuilt Class
        System.out.print("Enter Your Value:- ");//printing out for user enter value
        char ch = scanner.next().charAt(0);//define variable
        int a = (int) ch;//convert to char to int and store in another variable
        if (a >= 48 && a <= 57) {//if condition
            System.out.println("You Enter Numeric Value");//printing out if condition is true
        } else if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {//else condition if  if =false
            System.out.println("You Enter Alphabetical Value");//printing out if else if condition is ture
        } else {//if and else if condition is false then
            System.out.println("You Enter Symbol");//printing out if else =true
        }
    }
}

