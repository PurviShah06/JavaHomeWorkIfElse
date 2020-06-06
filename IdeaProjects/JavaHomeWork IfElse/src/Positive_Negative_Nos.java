import java.util.Scanner;
public class Positive_Negative_Nos {//Class name
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//import in built class Scanner for user input value
        System.out.print("Input Any Number :- ");//printing out
        int num = scanner.nextInt();//define int variable to store user input value by using object scanner
        if(num<0)//if condition
        {
            System.out.println("Your Number has Negative Value!!!");//if =true then printing out
        }else if(num==0){//else condition
            System.out.println("Your Number has Zero Value!!!");//if =false then printing out
        }else if(num>0){//else condition
            System.out.println("Your Number has Positive Value!!!");// if and else if condition are false then printing out
        }
    }
}