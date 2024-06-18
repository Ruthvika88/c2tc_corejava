package Scanner;
import java.util.Scanner;

public class scannerDemo
{
	public static void Main(String[]args)
	{
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the Name:");
	String Name =scanner.nextLine();
	
	System.out.println("Enter the Age:");
	int age =scanner.nextInt();
	
	System.out.println("Enter the Salary:");
	double salary = scanner.nextDouble();
	
	System.out.println("Name:"+Name);
	System.out.println("Age:"+age);
	System.out.println("Salary:"+salary);
	
	scanner.close();
	}
}

	
	
	


