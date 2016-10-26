package labwork;

import java.util.Scanner;
import java.lang.Double;
import java.text.NumberFormat;


public class area{



	public static void main(String[] args) {

		System.out.println("Find the Area ,Perimeter and volume of the classroom"+  "\n");
		
		System.out.println("--------------------------------------------------------");
		Scanner sc = new Scanner(System.in);

		String choice = "y";

        while (choice.equalsIgnoreCase("y"))

        {

        	System.out.println("Enter the length ");
            String l=sc.next();
        	
            double len=Double.parseDouble(l);
        	System.out.println("Enter the Width");

        	double width= sc.nextDouble();
        	
        	System.out.println("Enter the voume ");
        	double height= sc.nextDouble();
        	

        	double area=len*width;

        	double premeter=2*(len+width);
        	
        	double volume=len*width*height;
        	NumberFormat num=NumberFormat.getNumberInstance();
        	num.setMaximumFractionDigits(3);
        	String vol1=num.format(volume);

        	//printing result

            String res = "Area of the rectangle :" + area+ "\n"

                    + "Premeter of the rectangle :" + premeter + "\n"
                    
                    +"Volume of the rectangle  :"+vol1;                  ;

            System.out.println(res);
            

            System.out.print("Continue? (y/n): ");

            choice = sc.next();

            System.out.println();

        }

		

}

}