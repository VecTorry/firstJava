package major_activity;
import java.util.Scanner;
public class Major_Activity3 {
    public static void main(String[] args) {
        int temp;
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Enter the Temperature today: ");
        temp = scanner.nextInt();
        
        if (temp < 0)
        {
            System.out.println("Freezing Weather.\n");
                }else if (temp < 10)
                {
                    System.out.println("Very Cold Weather.\n");
                        }else if (temp < 20)
                        {
                            System.out.println("Cold Weather.\n");
                        }else if (temp < 30)
                        {
                     System.out.println("Normal Temperature.\n");
                }else if (temp < 40)
                {
            System.out.println("Then It's hot.\n");
        } else if (temp > 40)
        System.out.println("Then It's Very Hot.\n");
        {
        
        }
        
    }
}
