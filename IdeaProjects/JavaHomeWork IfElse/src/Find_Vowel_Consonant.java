import java.util.Scanner;

public class Find_Vowel_Consonant//Class name
{
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class Scanner
        System.out.print("Input an Alphabet :- ");//printing out for user input
        char chr = scanner.next().charAt(0);//define char variable to store user input by using object scanner
        int chr1=(int)chr;//convert variable char to int
        if (chr1 ==65 || chr == 97) {//if condition
            System.out.println("Input Letter is Vowel  ");//print out if if =true
        } else if (chr1 == 69 || chr1 == 101) {//else if  condition if = false
            System.out.println("Input Letter is Vowel  ");//printing out if else if =true
        } else if (chr1 == 73 || chr1 == 105) {//
            System.out.println("Input Letter is Vowel  ");
        } else if (chr1 == 79 || chr1 == 111) {
            System.out.println("Input Letter is Vowel  ");
        } else if (chr1 == 85 || chr1 == 117) {
            System.out.println("Input Letter is Vowel  ");
        }else if (chr1>=48&&chr1<=57){
            System.out.println("INVALID  ");
        }else
            {
                System.out.println("Input Letter is Consonant :- ");
        }

    }
}

