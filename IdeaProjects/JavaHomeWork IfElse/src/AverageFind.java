import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;
public class AverageFind //Class name
{
    public static void main(String[] args) // main method
    {  Scanner scanner=new Scanner(System.in); //import in built Scanner by Define
        System.out.print("Enter 1st Value:- ");//Printing out Value
        double val1 =scanner.nextDouble();//define variable
        System.out.print("Enter 2nd Value:- ");//printing out 2nd value
        double val2 =scanner.nextDouble();//define variable with data type double
        System.out.print("Enter 3rd Value:- ");//printing out caption for user enter value
        double val3 =scanner.nextDouble();//define variable with data type double
        System.out.print("Enter 4th Value:- ");//printing out caption for user enter value
        double val4 =scanner.nextDouble();//define variable with data type double
        System.out.print("Enter 5th Value:- ");//printing out caption for user enter value
        double val5 =scanner.nextDouble();//define variable with data type double
        System.out.println("Your Total is = "+ (val5+val1+val2+val3+val4));//printing out total value
        double ave =((val5+val1+val2+val3+val4)/5);//equation for find average.
        System.out.println("Your Average is = "+ ave);//printing out Average
    }
}

