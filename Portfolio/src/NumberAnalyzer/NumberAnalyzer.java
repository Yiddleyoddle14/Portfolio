package NumberAnalyzer;

/*
 * Ailsa Mensinger
 * 12-7-18
 */

public class NumberAnalyzer {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Enter the number of items");
		
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		System.out.println("Enter the numbers: ");
		for (int i = 0; i<n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum/numbers.length;
		int lower = 0;
		int high = 0;
		for (double element: numbers) {
			if (element < average) {
				lower++;
			}
			else {
				high++;
			}
		}
		double min = numbers[0];
		for (double element: numbers) {
			if (element < min) {
				min = element;
			}
		}
		
		double max = numbers[0];
		for (double element: numbers) {
			if (element > max) {
				max = element;
			}
		}
		
		double mean = sum/numbers.length;
		for (double element: numbers) {
			if (element < mean) {
				lower++;
			}
			else {
				high++;
			}
		}
		
		
		
		
		double modeValue = 0;
		double modeCount = 0;

	    for (int i = 0; i < numbers.length; i++) {
	        double count = 0;
	        for (int j = 0; j < numbers.length; ++j) {
	            if (numbers[j] == numbers[i]) ++count;
	        }
	        if (count > modeCount) {
	            modeCount = count;
	            modeValue = numbers[i];
	        }
	    }
	    int median = numbers.length/2;
	    if (numbers.length%2 == 1) {
	       double x = numbers[median];
	    } 
	    else {
	        double x = (numbers[(median-1)] + numbers[ median]) / 2.0;
	    }


	   
	
		
		
		System.out.println("Average: " +average);
		System.out.println("Minimum: " +min);
		System.out.println("Maximum: " +max);
		System.out.println("Mean: " +mean);
		System.out.println("Median: " +median);
		System.out.println("Mode: " +modeValue);
	}

}
