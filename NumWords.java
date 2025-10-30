// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

	    int num = Integer.parseInt(args[0]); // getting the input number from the command line argument
		// calculating the hundreds, tens, and ones digits
		int hundreds = num/100;
		int tens = (num / 10) - (hundreds * 10);
		int ones = num - (hundreds * 100) - (tens * 10);
		// printing the results by the required format
		System.out.println(hundreds + " hundreds, " +
		 tens + " tens, and " + ones + " ones.");
	}
}
