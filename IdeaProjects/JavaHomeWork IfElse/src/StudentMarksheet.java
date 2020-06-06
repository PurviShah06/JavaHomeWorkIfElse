import java.util.Scanner;

public class StudentMarksheet
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input Student Name :- ");
        String name=scanner.next();
        System.out.print("Input Student Roll No:- ");
        int roll =scanner.nextInt();
        System.out.print("Input MATH'S Marks:- ");
        int math=scanner.nextInt();
        System.out.print("Input English Marks:- ");
        int eng=scanner.nextInt();
        System.out.print("Input Science Marks:- ");
        int sci =scanner.nextInt();
        int total =math+eng+sci;
        System.out.println("Total of "+"Roll No.  "+roll+"  is  "+" = "+total);
        double percent = (total*100)/300;
        System.out.println("Percentage= "+percent+"%");
        if(percent>=80)
        {
            System.out.println("Grade is A+");
        }else if(percent>=60 && percent<80)
        {
            System.out.println("Grade is A");
        }else if(percent>=50 && percent<60)
        {
            System.out.println("Grade is B");
        }else if(percent>=35 && percent<50)
        {
            System.out.println("Grade is C");
        }else{
            System.out.println("Fail");
        }
    }
}
