import java.util.Scanner;

public class sum {
public static void main (String args[])
{
	Scanner sc=new Scanner(System.in);
			System.out.println("enter the first number:");
			int num1=sc.nextInt();
			System.out.println("enter the second number: ");
			int num2=sc.nextInt();
			System.out.println("enter the third number");
			int num3=sc.nextInt();
			
			int sum= num1+num2+num3;
			System.out.println( " Sum of the numbers are" +sum);
			
			if (sum < 45) {
	            int difference = 45 - sum;
	            System.out.println("Sum is less than 45. so the difference is = " + difference);
	        } else {
	            System.out.println("Sum is 45 or more. No subtraction needed.");
	        }

	        sc.close();
	    }
	}