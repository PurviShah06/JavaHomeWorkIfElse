import java.sql.SQLOutput;
import java.util.Scanner;
public class NameOfTheWeek//class name
{
    public static void main(String[] args)//main method
    { Scanner scanner = new Scanner(System.in);//import in built class Scanner for user input
        System.out.println("Enter Number:");//printing out
        int num = scanner.nextInt();//define int variable to store user input by using object scanner
        if (num >= 1 && num <= 7) {// ladder if condition
            if (num == 1) {
                System.out.println("Your First Day of The Week is :- Saturday");
            } else if (num == 2) {
                System.out.println("Your Second Day of The Week is :- Sunday");
            } else if (num == 3) {
                System.out.println("Your Third Day of The Week is :- Monday");
            } else if (num == 4) {
                System.out.println("Your Fourth Day of The Week is :- Tuesday");
            } else if (num == 5) {
                System.out.println("Your Fifth Day of The Week is :- Wednesday");
            } else if (num == 6) {
                System.out.println("Your Sixth Day of The Week is :- Thursday");
            } else if (num == 7) {
                System.out.println("Your Seventh Day of The Week is :- Firday");
            }
        }else {// if all condition  false then else
            System.out.println("Please Enter Number Between 0 to 7 ONLY!!");//printing out if ,all else if= false
        }
    }
}

