package bmi_project;

/*
 * Kylee Prescott, Will Ence, Gabe Carlile, Ailsa Mensinger
 * 10-11-18
 */

import java.util.Scanner;


public class BMIcode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double weightPounds; 
		double heightInches; 
		int age;
		double heightMeters;
		double weightKilo;
		double bmiNumber;
		
		//ask for input
		System.out.println("Enter your weight in pounds");
		weightPounds = input.nextDouble();
		System.out.println("Enter your height in inches");
		heightInches = input.nextDouble();
		System.out.println("Enter your age in years");
		age = input.nextInt();
		
		//conversions
		heightMeters = (heightInches*.0254);
		weightKilo = (weightPounds*.454);
		
		//calculate BMI
		bmiNumber= (weightKilo / (heightMeters*heightMeters));
		
		
		//nested if statements (BMI interpretation calculations)
		if (age >= 18)  {
			if (bmiNumber >= 30) {
				System.out.println("Your BMI is " + bmiNumber + ", you are obese.");
			}
			if (bmiNumber >= 25) {
				System.out.println("Your BMI is " + bmiNumber + ", you are overweight.");
			}
			if (bmiNumber >= 18.5) {
				System.out.println("Your BMI is " + bmiNumber + ", you are normal.");
			}
			if (bmiNumber < 18.5) {
				System.out.println("Your BMI is " + bmiNumber + ", you are underweight.");
				
			}
			
			
			
			
		}
		else if (age >= 12) {
			if (bmiNumber >= 29 ) {
				System.out.println("Your BMI is " + bmiNumber + ", you are obese.");
			}
			if (bmiNumber >= 27) {
				System.out.println("Your BMI is " + bmiNumber + ", you are overwieght.");
			}
			if (bmiNumber >= 21) {
				System.out.println("Your BMI is " + bmiNumber + ", you are normal.");
			}
			if (bmiNumber < 20 ) {
				System.out.println("Your BMI is " + bmiNumber + ", you are underweight.");
				
			}
			
			
			
			
		}
		else if (age > 12) {
			if (bmiNumber >= 25) {
			System.out.println("Your BMI is " + bmiNumber + ", you are obese.");
		}
			if (bmiNumber >= 23) {
			System.out.println("Your BMI is " + bmiNumber + ", you are overweight.");
		}
			if (bmiNumber >= 19) {
			System.out.println("Your BMI is " + bmiNumber + ", you are normal.");
		}
			if (bmiNumber < 18) {
			System.out.println("Your BMI is " + bmiNumber + ", you are underweight.");
			
		}
		
		
		
		}
		
		
		

	}

}

