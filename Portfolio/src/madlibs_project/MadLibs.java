package madlibs_project;

import java.util.Scanner;


/*
 * Ailsa Mensinger
 * 9-14-18
 */

public class MadLibs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare variables for each type of word the user needs to enter
		String adjective1;
		String noun1;
		String plural_noun1;
		String female_in_room;
		String adjective2;
		String article_of_clothing;
		String noun2;
		String city;
		String plural_noun2;
		String adjective3;
		String body_part1;
		String alphabet_letter;
		String celebrity;
		String plural_noun3;
		String adjective4;
		String a_place;
		String body_part2;
		String adjective5;
		String adjective6;
		String verb;
		String plural_noun4;
		String number;
		
		//Prompt user to enter the words
		System.out.println("Enter your answers according to how the instructions say");
		System.out.println("Enter an adjective");
		adjective1 = input.next(); 
		System.out.println("Enter a noun");
		noun1 = input.next();
		System.out.println("Enter a plural noun");
		plural_noun1 = input.next();
		System.out.println("Enter the name of a female in the room");
		female_in_room = input.next();
		System.out.println("Enter an adjective");
		adjective2 = input.next();
		System.out.println("Enter an article of clothing");
		article_of_clothing = input.next();
		System.out.println("Enter a noun");
		noun2 = input.next();
		System.out.println("Enter a city");
		city = input.next();
		System.out.println("Enter a plural noun");
		plural_noun2 = input.next();
		System.out.println("Enter an adjective");
		adjective3 = input.next();
		System.out.println("Enter a body part");
		body_part1 = input.next();
		System.out.println("Enter a letter of the alphabet");
		alphabet_letter = input.next();
		System.out.println("Enter the name of a celebrity");
		celebrity = input.next();
		System.out.println("Enter a plural noun");
		plural_noun3 = input.next();
		System.out.println("Enter an adjective");
		adjective4 = input.next();
		System.out.println("Enter a place");
		a_place = input.next();
		System.out.println("Enter a body part");
		body_part2 = input.next();
		System.out.println("Enter an adjective");
		adjective5 = input.next();
		System.out.println("Enter an adjective"); 
		adjective6 = input.next();
		System.out.println("Enter a verb");
		verb = input.next();
		System.out.println("Enter a plural noun");
		plural_noun4 = input.next();
		System.out.println("Enter a number");
		number = input.next();
		
		//create full output code
		System.out.println("There are many"
		+ adjective1 + "ways to choose a/an" 
				+ noun1 + "to read. First, you could ask for recommendations"
						+ " from your friends and" + plural_noun1 +
						". Just don't ask Aunt" + female_in_room + 
						"-she only reads" + adjective2 + "books with"
						+ article_of_clothing + "-ripping goddess on the cover."
								+ " If your friends and family are no help,"
								+ " try checking out the" + noun2 +
								"Review in The" + city +
								"Times. If the" + plural_noun2 +
								"featured there are too" + adjective3 +
								"for your taste, try something a little more low-" 
								+ body_part1 + ", like" + alphabet_letter +
								": The" + celebrity + "Magazine, or" + plural_noun3 
								+ "Magazine. You could also choose a book the" 
								+ adjective4 + "-fashioned way. Head to your local "
										+ "library or" + a_place + "and browse the shelves"
												+ " until something catches your" 
										+ body_part2 + ". Or, you could save yourself"
												+ " a whole lot of" + adjective5 +
												"trouble and log on to www.bookish.com,"
												+ " the" + adjective6 + "new website to" 
												+ verb + "for books! With all the time"
														+ " you'll save not having"
														+ " to search for" 
														+ plural_noun4 + ", you can read" 
														+ number + "more books!");
		
		
		
		
		
		

	}

}
