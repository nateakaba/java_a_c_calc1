// Created by Netanyahu Benjamin Ajiri 4:40 AM - 6:00 AM cont.
// 12/08/2018 12 years of age
import java.util.Scanner;
class circle{
	public static void main(String[] args){
		double pi, dm, rs, ansa, rs2;/*pi is 3.14, ans is for the answer, dm is diameter, rs is radius.*/
	    Scanner choice = new Scanner(System.in);
		System.out.print("(1)Area or (2)Circumference of circle:");
		String ch = choice.nextLine();
		m meas = new m();
		meas.c_hlp(); 
		String measure = choice.nextLine();
		String ph = measure;
		
		switch (measure) {
			case "(1)":
			measure = "u";
			break;

			case "1":
			measure = "u";
			break;
			
			case "(2)":
			measure = "cm";
			break;

			case "2":
			measure = "cm";
			break;
			

			case "(3)":
			measure = "in";
			break;
			
			case "3":
			measure = "in";
			break;

			case "(4)":
			measure = "ft";
			break;
			
			case "4":
			measure = "ft";
			break;
			
			case "(5)":
			measure = "mi";
			break;
					
			case "5":
			measure = "mi";
			break;
			
			case "(6)":
			measure = "km";
			break;
					
			case "6":
			measure = "km";
			break;
			
			case "(7)":
			measure = "yd";
			break;
			
			case "7":
			measure = "yd";
			break;

			case "(8)":
			measure = "m";
			break;
		
			case "8":
			measure = "m";
			break;
			
			case "(9)":
			measure = "mi";
			break;

			case "9":
			measure = "mi";
			break;
            
			case "":
			System.out.println("Please fill in this requirement!!");
			break;


			default:
			
			System.out.printf("Error: ' %s' ", meas.measure(ph));
			System.out.print("is invalid. \n Please type e.g. 9 or (9) for miles ");
			System.out.print("as shown above.");
			break;
			
			
		}
		System.out.print("\n");
		pi = 3.14;
		switch(ch){
			case "(1)":
				System.out.print("Radius: ");
				rs = choice.nextDouble();
				ansa = pi * rs * rs;
		        System.out.print("Area: " + ansa + " sq." + measure);
				break;
			case "(2)":
				System.out.print("Radius: ");
				rs2 = choice.nextDouble();
				ansa = pi * rs2 * 2;
		        System.out.print("Circumference: " + ansa + " " + measure);
				break;

		}
	}
}