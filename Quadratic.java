
import java.util.Scanner;





public class Quadratic{

	public static void quadNeg(double[][] array){
		double a = 0;
		double b = 0;
		double c = 0;
		
		double result = 0;
		 
		for(int row = 0; row < array.length; row++){
			for(int column = 0; column < array[row].length;column++){
				a = array[row][0];
				b = array[row][1];
				c = array[row][2];
			}
		
		 result = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		System.out.print(b + " - sqrt(" + b + "^2 - 4" + a + " " + c + ") / (2 * " + a + ")" );
		System.out.print("= " + result);
		System.out.println( " ");
		}
 
		System.out.println( " ");
		
	}
		

	public static void quadPos(double[][] array){
		double a = 0;
		double b = 0;
		double c = 0;
		double result = 0;
		 
		 for(int row = 0; row < array.length; row++){
			for(int column = 0; column < array[row].length;column++){
				a = array[row][0];
				b = array[row][1];
				c = array[row][2];
			}
		 result = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		 System.out.print(b + " + sqrt(" + b + "^2 - 4" + a + " " + c + ") / (2 * " + a + ")" );
		 System.out.print("= " + result);
		 System.out.println( " ");
		}
		
		System.out.println( " ");
		
		}
		
		
 public static void main(String[] args){

 	Scanner input = new Scanner(System.in);

	double [][] quadArray = new double[5][3];
 
	
	
	 System.out.println("Enter  a b c  (coeffecient of x and cannot be zero) of the quadratic formula : ");

	 
	 for(int row = 0; row  < quadArray.length;row++){
	 	for(int column = 0; column < quadArray[row].length;column++){
	 		quadArray[row][column] = input.nextDouble();
	 	}
	 	System.out.println("------------------------------- New Set of 3");
	 }


		System.out.println( " ");
 	

	
 
	quadNeg(quadArray);
	quadPos(quadArray);

 	

 	
 

 

 }

}

