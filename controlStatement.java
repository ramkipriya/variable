package labwork;
import java.util.Scanner;
public class controlStatement {

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		// TODO Auto-generated method stub
         System.out.println("Enter amount");
         double amt=cn.nextDouble();
         double total,discount;
         if (amt > 400){
          System.out.println("you received a disount ");}
         else if(amt <= 400){
        	 System.out.println("No discount");}
         
        
         
	}

}
