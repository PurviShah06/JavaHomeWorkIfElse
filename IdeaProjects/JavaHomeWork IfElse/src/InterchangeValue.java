import java.util.Scanner;
public class InterchangeValue {// class name
    public static void main(String[] args) {//main method
        Scanner scanner=new Scanner(System.in);//import in built class Scanner for user input
        System.out.print("Enter A Value :");//print out value
        int a = scanner.nextInt();//define int variable to store user input by using scanner object
        System.out.print("Enter B Value ");//print out value
        int b = scanner.nextInt();//define int variable to store user input by using scanner object
        int c=a;//store a value to c
         a=b;//store variable b value to a
         b=c;//store variable c value to b
        System.out.println("Your Interchange Values Are:");//printing out heading
        System.out.println("A Value is:-  "+a);//printing out A value
        System.out.println("B Value is:-  "+b);// printion out B value
    }
}
