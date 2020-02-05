/**
 * 
 * 
 * @author Lessie Quezada
 * Created: 02/05/2020
 * Description: this program lets the user input 3 numbers to get the product.
 *
 */




import java.util.Scanner;
public class practiceweek2Part2 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in); 
		System.out.println("Enter the 1st number");
		System.out.println("Enter the 2nd number");
		System.out.println("Enter the 3rd number");
		
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();
		int product = num1*num2*num3;
		System.out.println("The product of all the numbers are: " + product);
		
		
		
	}
	

}
