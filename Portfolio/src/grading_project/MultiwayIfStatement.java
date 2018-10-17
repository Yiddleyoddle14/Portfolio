package grading_project;
import java.util.Scanner;
/*
 *Ailsa Mensinger
 *10-4-18
 */

public class MultiwayIfStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//ask for the input from the user
		System.out.println("Please insert ten grades"); 
		
		//declare variables and determine that they equal whatever the value the user enters
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		double four = input.nextDouble();
		double five = input.nextDouble();
		double six = input.nextDouble();
		double seven = input.nextDouble();
		double eight = input.nextDouble();
		double nine = input.nextDouble();
		double ten = input.nextDouble();
		
		//calculate the total average of all ten grades
		double totalAverage = (one + two + three + four + five + six + seven + eight + nine + ten) / 10;
		
		//write first if statement if they receive an A
		if (totalAverage >= 90) {
			System.out.println("Your grade is an A");
			}
		
		//write else if statement if they received a B 
		else if (totalAverage >= 80) {
			System.out.println("Your grade is a B");
		}

		//write else if statement if they received a C
		else if (totalAverage >= 70) {
			System.out.println("Your grade is a C");
		}
		
		//write else if statement if they received a D
		else if (totalAverage >= 60) {
			System.out.println("Your grade is a D");
		}
		
		//write else statement if they got an F, or anything below 60
		else {
			System.out.println("Your grade is an F"); 
		}
		
		//display the total average
		System.out.println("Your average is " +totalAverage); 
		

	}

}
