package SubtractionGame;

/*
 * Ailsa Mensinger
 * 11-27-18
 */

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_QUESTIONS = 5; //number of questions
		//final int allows it to not be altered
		int correctCount = 0;  //count the number of correct answers
		int count = 0; //count the number of questions
		String output = " "; //output string is initially empty
		long startTime = System.currentTimeMillis();
		
		while (count < NUMBER_OF_QUESTIONS) {
			//1. Generate two random single-digit integers
			int number1 = (int) (Math.random() * 100);
			int number2 = (int)(Math.random() * 100);
			//2. If number1 < number2, swap number1 with number2
			if (number1 < number2){
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			//3. Prompt the student to answer "What is number1 - number2?"
			System.out.println("What is " +number1+" - "+number2+"?");
			int answer = input.nextInt();
			//4. Grade the answer and display the result
			if (number1-number2 == answer) {
				System.out.println("Correct!");
				correctCount ++;
			}
			else {
				System.out.println("Incorrect! Your answer should be " +(number1-number2));
			}
			//Increase the question count
			count ++;
			output += "\n" + number1 + "-" + number2 + "=" + answer +
					((number1 - number2 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("You took " +testTime/1000+" seconds to complete the test\n"
				+output);
		
		
	

	}

}
