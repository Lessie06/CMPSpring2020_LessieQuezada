/**
 * 
 * 
 * 
 * @author Student Lessie
 *
 */
import java.util.Scanner;
public class Weather {
	public static void main (String[] args) {
		Scanner kb=new Scanner (System.in);
		System.out.println("Welcome to Coat Adviser");
		System.out.println("Enter temperature in fahrenheit");
		double temp=kb.nextDouble();
		
		if (temp>70)
			System.out.println("It is too hot");
			else if (temp >50)
				System.out.println("Its warm");
				else if (temp>30)
					System.out.println("Its cold, wear a jacket");
				else 
					System.out.println("Its too cold, wear a cold");
				
		
	}
}
