// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int a = (int)((Math.random())*num);
		int b = (int)((Math.random())*num);
		int c = (int)((Math.random())*num);
		System.out.println(a + " " + b + " " + c);

		int minAB = Math.min(a,b);
		int min = Math.min(minAB, c);

		int maxAB = Math.max(a,b);
		int max = Math.max(maxAB,c);

		int sum = a + b + c;
		int mid = sum - min - max;

		System.out.println(min + " " + mid + " " + max);
	}
}
