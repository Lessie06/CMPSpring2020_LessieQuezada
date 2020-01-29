/**
 * @author Lessie
 * created : 1/29/2020
 * description: This program calculates the birth year
 * 
 **/

import java.util.Scanner;
public class FirstProgram {//This is the first method the JVM looks for, to run 
	public static void main (String[] args) {
		Scanner keyboard =new Scanner (System.in);
		System.out.println("Welcome to my first program\n"
				+ "This program calculates the birth year");
		System.out.println("Enter your age");
		int age = keyboard.nextInt();
		int BY= 2020-age;
		System.out.println("The most likely year you were born is "+ BY);
	}

}
