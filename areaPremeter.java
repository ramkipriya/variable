package labwork;
import java.util.Scanner;
//import java.io;
public class areaPremeter{

	public static void main(String[] args)throws Exception {
		//BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1. Find the Area and Premeter"+ "\n"
				+          " 2. volume ");
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		switch(num){
		case 1:{
		System.out.println("Find the Area and Perimeter of the classroom"+  "\n\n\n");
				
		String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        	System.out.println("Enter the length ");
        	double len= sc.nextDouble();
        	System.out.println("Enter the Width");
        	double width= sc.nextDouble();
        	double area=len*width;
        	double premeter=2*(len+width);
        	//printing result
            String res = "Area of the rectangle " + area+ "\n"
                    + "Premeter of the rectangle " + premeter + "\n";                  ;
            System.out.println(res);
            
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();}
           
        }
		break;
		case 2:
			{System.out.println("Find the volume"+  "\n\n\n");
			
			String choice = "y";
	        while (choice.equalsIgnoreCase("y"))
	        {
	        	System.out.println("Enter the length ");
	        	double len= sc.nextDouble();
	        	System.out.println("Enter the Width");
	        	double width= sc.nextDouble();
	        	System.out.println("Enter the height");
	        	double height= sc.nextDouble();
	        	double Volume=len*width*height;
	        	
	        	//printing result
	                      
	            System.out.println(Volume);
	            }
		
	            System.out.print("Continue? (y/n): ");
	            choice = sc.next();
	            System.out.println();
	           
	        }
			break;
	default:
		System.out.println("Invalid Entry!");
        }
		}

}