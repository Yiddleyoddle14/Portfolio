package lottery_project;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 10-15-18
 */

public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//generate a lottery number
		String lottery = ""+(int)(Math.random()*10)+(int)(Math.random()*10);
		
		
		//prompt user to enter a guess
		System.out.println("Please enter your lottery pick (two digits): ");
		String guess = input.nextLine();
		
		//get digits from lottery
		String lotteryDigit1 = lottery.charAt(0);
		int lotteryDigit2 = lottery % 10;
		
		
		//get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess == lottery) {
			System.out.println("Exact match! You win $10,000");
			
		}
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 .= lotteryDigit2) {
			System.out.println("Match all digits: you win $3,000");
			
		}
		else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit you win $1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}

	}

}
