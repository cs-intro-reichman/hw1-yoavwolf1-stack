// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int value = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double temp = Math.pow((1 + rate/100) , years);
		int futureValue = (int)(value * temp);
		System.out.println("After " + years + " years, $" + value + 
		" saved at " + rate + "% will yield $" + futureValue);
	}
}