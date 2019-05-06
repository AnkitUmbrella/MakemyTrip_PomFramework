package Naveen.NaveenCodingChallenge2.testcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.Test;

public class date {

	

	public String datetest() {
		
		 
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MMMM/dd/yyyy");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		// System.out.println("Current date and time is " +date1);	
		  String currdate= date1;
		   return currdate;
		
	}
	
	
     
	public String getcurrentday() {
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String day= new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
		return day;
	}
	
	
  @Test
	public void Getcurr(){
		
		String x= getcurrentday();
		String y= datetest();
		System.out.println(x);
		System.out.println(y);
		String z=x+" "+y;
		
		System.out.println(z);
		
	}
	
}
