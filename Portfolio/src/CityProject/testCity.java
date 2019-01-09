package CityProject;

import java.util.Scanner;

public class testCity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String temp;
		
		//user prompt city one
		System.out.println("Enter city number one");
		
		//user input city one
		city1 = input.nextLine();
		
		//user prompt city two
		System.out.println("Enter city number two");
		
		//user input city two
		city2 = input.nextLine();
		
		System.out.println("Enter city number three");
		city3 = input.nextLine();
		
		System.out.println("Enter city number four");
		city4 = input.nextLine();
		
		System.out.println("Enter city number five");
		city5 = input.nextLine();
		
		//if city one compared to city two > 0 
		//display city in alphabetical order.
		if (city1.compareTo(city2)>0) {
			temp= city1;
			city1= city2;
			city2=temp;
		}
		if	(city2.compareTo(city3)>0) {
				temp = city2;
				city2 = city3;
				city3 = temp;
			if (city1.compareTo(city2)>0) {
				temp = city1;
				city1 = city2;
				city2 = temp;
				
			}
		}
		if (city3.compareTo(city4)>0) {
				temp = city3;
				city3 = city4;
				city4 = temp;
				if (city2.compareTo(city3)>0) {
					temp = city2;
					city2 = city3;
					city3 = temp;
					
				}
				if (city1.compareTo(city2)>0) {
					temp = city1;
					city1 = city2;
					city2 = temp;
					
				}
			}
		if (city4.compareTo(city5)>0) {
				temp = city4;
				city4 = city5;
				city5 = temp;
				if (city3.compareTo(city4)>0) {
					temp = city3;
					city3 = city4;
					city4 = temp;
				}
				if (city2.compareTo(city3)>0) {
					temp = city2;
					city2 = city3;
					city3 = temp;
						
					}
				if (city1.compareTo(city2)>0) {
					temp = city1;
					city1 = city2;
					city2 = temp;
						
					}
				
				System.out.println("The alphabetical order of the cities are: ");
				System.out.println(city1);
				System.out.println(city2);
				System.out.println(city3);
				System.out.println(city4);
				System.out.println(city5);
			}
		
		
		
		
		

	}

}
