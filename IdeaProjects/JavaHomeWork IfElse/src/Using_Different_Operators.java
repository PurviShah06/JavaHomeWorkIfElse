import java.util.Scanner;
public class Using_Different_Operators {//Class name
    public static void main(String[] args) {// Main method
        Scanner scanner =new Scanner(System.in);//import inbuilt class Scanner for user input
        System.out.print("Enter Your 1st Value:-");// printing out value
        int val1=scanner.nextInt();//define int variable to store user input by  using object scanner
        System.out.print("Enter Your 2nd Value:-");// printing out value
        int  val2=scanner.nextInt();//define int variable to store user input by  using object scanner
        System.out.print("Enter Symbol :");// printing out value
        char ch=scanner.next().charAt(0);//define char variable to store user input by  using object scanner
        if(ch == '+'){
            System.out.println("The Addition of " + val1 + " & " + val2 +" = "+(val1+val2) );
        }else if(ch == '-'){
            System.out.println("The Subtraction of " + val1+ " & " + val2+" = "+(val1-val2) );
        }else if (ch=='*'){
            System.out.println("The Multiplication of " + val1+ " & " + val2+" = "+(val1*val2) );
        }else if (ch=='/'){
            System.out.println("The Division of " + val1 + " &  " + val2+"="+(val1%val2) );
        }else {
            System.out.println("Enter Valid Operators!!");
        }
    }
}
