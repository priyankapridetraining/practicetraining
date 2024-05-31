package program;

import java.util.Calendar;
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is  : " + calendar.getTime());
		System.out.println("At present Calendar's year  : " + calendar.get(Calendar.YEAR));
		System.out.println("At present Calendar's day is  : " + calendar.get(Calendar.DATE));
		System.out.println("Current Minute  : " + calendar.get(Calendar.MINUTE));
		System.out.println("Current Second  : " + calendar.get(Calendar.SECOND));
		//int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.YEAR, -5);
		System.out.println("5 years ago : " + calendar.get(Calendar.YEAR));
		calendar.add(Calendar.YEAR, 8);
		System.out.println("8 years later : " + calendar.getTime());
		
		
		
	}

}
