import java.util.Scanner;

public class reversrString
{

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);//import inbuilt class Scanner
            System.out.print("Enter String:- ");//printing out for user input
            String input  =scanner.next();//define variable

            String s1="java";//creating string by java string literal
            char ch[]={'s','t','r','i','n','g','s'};
            String s2=new String(ch);//converting char array to string
            String s3=new String("example");//creating java string by new keyword
            System.out.println(s1);
        }
    }


