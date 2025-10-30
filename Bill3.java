// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		// receiving the names and bill amount from the command line arguments
	    String name1 = args[0];
	    String name2 = args[1];
	    String name3 = args[2];
		int bill = Integer.parseInt(args[3]);
		//spliting and rounding up the bill
		double split = bill/3.0;
		split = Math.ceil(split);
		//printing the result by the required order
		System.out.println("Dear " + name3 + ", " + name2 + 
		", and " + name1 + ": pay " + split + " Shekels each.");
	}
}
