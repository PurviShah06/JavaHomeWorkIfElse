import java.util.Scanner;
public class CaseChange//Class name
{
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//;import in built class Scanner
        System.out.print("Enter Any Character In UpperCase :- ");//print out for user enter value
        char ch = scanner.next().charAt(0);//assign variable to store user input
        int temp = (int) ch;//convert variable type to ch to int.
        char temp1;// variable
        if (temp >= 65 && temp <= 90) {  //if condition
           temp = ch+32;//store equation in temp variable
           temp1 = (char)temp;//convert temp variable to integer
            System.out.println("LowerCase = "+temp1);//print out if result
        } else
        {
            System.out.println("Please Enter UpperCase Only!!");// printing out else result.
        }
    }
}
