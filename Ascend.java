/*

feedback:

Great Work

Yam

*/



// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]); // receiving the input number from the command line argument
		// generating three random integers from 0 to num-1
		int a = (int)((Math.random())*num);
		int b = (int)((Math.random())*num);
		int c = (int)((Math.random())*num);
		System.out.println(a + " " + b + " " + c); // printing the three numbers

		// finding the minimum value by first finding the minimum of a and b,
		// and then between that and c
		int minAB = Math.min(a,b);
		int min = Math.min(minAB, c);
		// finding the maximum value, same way as the minimum value
		int maxAB = Math.max(a,b);
		int max = Math.max(maxAB,c);
		// finding the middle value by subtracting min and max from the sum of the 3 numbers
		int sum = a + b + c;
		int mid = sum - min - max;

		System.out.println(min + " " + mid + " " + max); // printing in ascending order
	}
}

