package labwork;
import java.util.Scanner;
public class Loop3 {
	
	public static void main(String[] args) {
		final int size=10;
		// Display total and average of user 10 integer
		// instantiate a scanner
		Scanner sc = new Scanner(System.in);

		// initialize the variable for total an average
		int total = 0;
		int in;
		int count=0;
		// loop 10 times
		do{
		
			// prompt the user to enter an int
			System.out.print("Please enter the Integer");

			// take input
			in = sc.nextInt();
			// add to total
			if (in >0){
			total += in;
			count++;}
			else{
				break;
				
			}
		} while(true);
		// calculate the average
		double avg=(double)total/count;
		// output and total
		System.out.println("Total is " +total);
		// output the average
		System.out.println("Total is " +avg);
		sc.close();
	}
}
