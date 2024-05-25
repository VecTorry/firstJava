package major_activity;
import java.util.Scanner;
import java.util.Arrays;
public class Major_Activity2
{
    public static void main(String[] args)
	{
		int [] arr = new int[3];
		System.out.println("Enter three numbers:");  
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("Ascending Order:");
		for(int i = 0; i < 3; i++) System.out.print(arr[i] + " ");
	}  
}
