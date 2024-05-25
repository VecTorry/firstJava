package major_activity;
 //REDACTED
import java.util.Scanner;
public class Major_Activity
{
    public static void main(String[] args)
    {
        int num, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Enter Number of Subject");
        num = scanner.nextInt();
        System.out.println("Enter Marks of " + num + " Subject");
        
        for (i = 0; i < num; i++)
        {
        	totalMarks += scanner.nextInt();
        }
        
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Grade : " + totalMarks/num);
        percentage = (totalMarks / (num * 100)) * 100;
        switch ((int) percentage / 10)
        {
	        case 9:
	            System.out.println("Grade : A+");
	            break;
	        case 8:
	        case 7:
	            System.out.println("Grade : A");
	            break;
	        case 6:
	            System.out.println("Grade : B");
	            break;
	        case 5:
	            System.out.println("Grade : C");
	            break;
	        default:
	            System.out.println("Grade : D");
	            break;
        }
    }
    // REDACTED
}