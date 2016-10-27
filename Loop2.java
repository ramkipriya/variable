package labwork;
import java.util.Scanner;
public class Loop2 {
	
	public static void main(String[] args) {
		final int size=10;
		// Display total and average of user 10 integer
		// instantiate a scanner
		Scanner sc = new Scanner(System.in);

		// initialize the variable for total an average
		int total = 0;
		// loop 10 times
		for (int i = 0; i < size; i++) {
			// prompt the user to enter an int
			System.out.print("Please enter the Integer");

			// take input
			int in = sc.nextInt();
			// add to total
			total += in;
		}
		// calculate the average
		double avg=(double)total/size;
		// output and total
		System.out.println("Total is " +total);
		// output the average
		System.out.println("Total is " +avg);
		sc.close();
	}
}
