import java.util.Scanner;
public class Student_Pass_FailStatus
{
        public static void main(String[] args)//Main  method
        { Scanner scanner = new Scanner(System.in);//Import in built class Scanner for user input value
            System.out.print("Input Student Name :- ");//printing out
            String name = scanner.next();//define sting variable to to store string value by enter by user by using object  scanner
            System.out.print("Input Student Roll No:- ");//printing out
            int roll = scanner.nextInt();//define int variable to to store value by enter by user by using object  scanner
            System.out.print("Input Maths Marks:- ");
            byte math = scanner.nextByte();//define byte variable to to store value by enter by user by using object  scanner
            System.out.print("Input English Marks:- ");
            byte eng = scanner.nextByte();//define byte variable to to store  value by enter by user by using object  scanner
            System.out.print("Input Science Marks:- ");
            byte sci = scanner.nextByte();//define bytevariable to to store value by enter by user by using object  scanner
            double total =math+eng+sci; // store total marks in total variable
            System.out.println("Total of "+"Roll No.  "+roll+"  is  "+" = "+total);//printing out total marks
            if (math>=35 && eng>=35 && sci>=35)//if condition
            {
                System.out.println("Congratulation !! You are PASS");//if main condition = true then print Pass
                double percent = (total * 100) / 300;//if condition = true then calculate percentage
                System.out.println("Percentage= " + percent + "%");//printing out percentage
                if (percent >= 80)//used nested if  condition
                {
                    System.out.println("Grade is A+");
                } else if (percent >= 60 && percent < 80)
                {
                    System.out.println("Grade is A");
                } else if (percent >= 50 && percent < 60)
                {
                    System.out.println("Grade is B");
                } else if (percent >= 35 && percent < 50) {
                    System.out.println("Grade is C");
                }else{
                    System.out.println("Invalid");
                }
            }else {
                System.out.println("Fail");
            }
        }
        }