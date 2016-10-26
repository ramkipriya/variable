

package labwork;
import java.util.Scanner;
public class switchPractice {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
	System.out.println("Please enter a day of the week");
	
		
	System.out.println("1.Sunday");
	System.out.println("2.Monday");
	System.out.println("3.Tuesday");
	System.out.println("4.wednesday");
	System.out.println("5.Thursday");
	System.out.println("6.Friday");
	System.out.println("7.Saturay");
	int day=sn.nextInt();
	switch (day)
	{
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		System.out.println("This is a weekday");
		break;
	case 1:
	case 7:
		System.out.println("This is a Weekend no work");
		break;
		default:
			System.out.println("Invalid input");
			break;
	}
	}

}
