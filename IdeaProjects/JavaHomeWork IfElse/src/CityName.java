import java.util.Scanner;

public class CityName {// Class name
    public static void main(String[] args)// Main method
    { Scanner scanner=new Scanner(System.in);//import inbuilt class  Scanner
        System.out.print("Enter Any Alphabet: ");//print out for user enter value
        char alpha =scanner.next().charAt(0);//define variable with store value by using scanner object
        if(alpha=='A' || alpha=='a')//condition
        {
            System.out.println("Aberdeen");//if =true then printing out
        }else if (alpha=='B'|| alpha=='b')//if =false then else if to check
        {
            System.out.println("Birmingham");//if else if =true then printing out line
        }else if (alpha=='C'|| alpha=='c')//if above else if =false then
        {
            System.out.println("Cambridge");//if else if =true then printing out
        }else if (alpha=='D'|| alpha=='d')//else if condition
        {
            System.out.println("Durham");// if else if condition =true then printing out
        }else if (alpha=='E'|| alpha=='e')// else if condition
        {
            System.out.println("Ely");//if else if condition = true then printing out
        }else if (alpha=='F'|| alpha=='f')//else if condition
        {
            System.out.println("Florence");//else if condition = true
        }else{
            System.out.println("Invalid Entry");// if all condition = false then printing out
        }
    }
}
