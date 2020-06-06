import java.util.Scanner;

public class Employee_PaySlip//Class name
{
    public static void main(String[] args)//main method
    { Scanner scanner=new Scanner(System.in);//import inbuilt class Scanner
        System.out.print("Entre Employee ID: ");//printing out for user input value
        char id =scanner.next().charAt(0);//define char variable to store user input
        System.out.print("Enter Employee Name: ");//printing out Employee name
        String name =scanner.next();//define String variable to store user input value
        System.out.print("Enter Employee's Basic Salary(£):");//printing out
        int salary =scanner.nextInt();//define int variable to store user input value
        int hra =(salary*10)/100;//to find HRA calcuation
        System.out.println("HRA  = "+hra);//print HRA amount
        int da =(salary*8)/100;//to find DA calculation
        System.out.println("DA  = "+da);//print DA amount
        int ta =(salary*9)/100;//find TA calculation
        System.out.println("TA  = "+ta);//print TA amount
        int pf =(salary*20)/100;//find PF calculation
        System.out.println("PF  = "+pf);//print PF amount
        int gross=salary+hra+ta+da-pf;//fing Gross Salary
        System.out.println("Gross Salary = "+"£"+gross);//print gross salary
    }
}
