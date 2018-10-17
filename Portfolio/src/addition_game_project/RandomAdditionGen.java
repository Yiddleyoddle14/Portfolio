package addition_game_project;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 10-9-18
 */

public class RandomAdditionGen {

	public static void main(String[] args) {
		//'while' allows the program to loop
		int x = 1;
		
		while (x==1) {
			
		
		Scanner input = new Scanner(System.in);
		//Codes to create random numbers: java.util.Random, math.random, thread.local.random, and System.currentTimeMils(). 
		
		//declare variables for the first and second number being added
		int num1= (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() /7 % 10);
	
		//Display mathematical question to user
		System.out.println(num1 + " + " + num2 + " = ?");
		
		//Declare variables for the student's answer and the correct answer
		int studentAnswer = input.nextInt();
		int correctAnswer = (num1 + num2); 
		
		//Receive input and calculate whether true or false
		if (studentAnswer == correctAnswer) {
			System.out.println("Correct!");
		}
		
		else {
			System.out.println("Incorrect. Correct answer: " + correctAnswer); 
			x = 0;
			System.out.println("Game over!"); 
		}
			
		
	}

}
}