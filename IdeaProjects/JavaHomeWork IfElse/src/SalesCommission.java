import java.util.Scanner;
public class SalesCommission//Class name
{ public static void main(String[] args)//main Method
    { Scanner scanner=new Scanner(System.in);//import in built class Scanner for user input value
        System.out.print("Enter Sales ID: ");//printing out
        char id =scanner.next().charAt(0);//define char variable to store user input value by using object scanner
        System.out.print("Enter Seller's Name: ");//printing out
        String name =scanner.next();//define sting variable to store user input value by using object scanner
        System.out.print("Enter Sales Amount: ");//printing out
        double salesA =scanner.nextDouble();//define double variable to store user input value by using object scanner
        System.out.print("Enter Basic Salary: ");//printing out
        int salary1 =scanner.nextInt();//define int variable to store user input value by using object scanner
       if(salesA>=50000){
           System.out.println(name+"'s"+"  Sales Commission is :- "+(salesA*35)/100);//printing out sales commission
           System.out.println(name+"'s"+"  Gross Salary   ="+(salary1 +(salesA*35)/100));//printing out gross salary
       }else if(salesA>=20000){
           System.out.println(name+"'s"+"  Sales Commission is :- "+(salesA*10)/100);//printing out sales commission
           System.out.println(name+"'s"+"  Gross Salary  ="+(salary1 +(salesA*35)/100));//printing out gross salary
       }else if(salesA>=10000){
           System.out.println(name+"'s"+"  Sales Commission is :- "+(salesA*5)/100);//printing out sales commission
           System.out.println(name+"'s"+"  Gross Salary = "+(salary1 +(salesA*35)/100));//printing out gross salary
       }else if(salesA<10000){
           System.out.println(name+"'s"+"  Sales Commission is :- "+(salesA*2)/100);//printing out sales commission
           System.out.println(name+"'s"+"  Gross Salary is :- "+(salary1 +(salesA*35)/100));//printing out gross salary
       }
    }
}
