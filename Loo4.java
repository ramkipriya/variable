package labwork;

public class Loo4 {

	public static void main(String[] args) {
		// W.a.p to output all possible rolls of two dice
		for (int die1 = 1;die1 <= 6;die1++)	{
			for (int die2 = 1;die2 <= 6;die2++){
				System.out.println(" Die1  "+die1 + "\tDie 2  :" +die2 
				+ "\t total" +(die1+die2));				
			}
		}
		
		for (int die1 = 1;die1 <= 6;die1++)	{
			for (int die2 = 1;die2 <= 6;die2++){
				System.out.print(die1 + ","+die2 +"="+(die1+die2)+ "\t");		
		}
			System.out.println();
	}
System.out.println("It is all over!");
}
}