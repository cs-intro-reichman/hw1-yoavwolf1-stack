// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		// receiving the input time from the command line argument, and extracting the hours and minutes digits:
		// hours: first two chars, minutes: last two chars (without the colon in between)

		// convert the hours to an integer in order to work with their value and remove the leading zero if exists
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// keep the minutes as a string to preserve any leading zero, and because we don't need to do any calculations with them
		String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
        
		// defining "sign" as the AM/PM part of the time format
		String sign = "AM";
		// adjusting "hours" and "sign" according to the 12-hour format rules
		if(hours >= 12)
			sign = "PM";
		if(hours > 12)
			hours = hours - 12;
		// printing the result by the required format
		String time = "" + hours + ":" + minutes + " " + sign;
		System.out.println(time);
	}
}