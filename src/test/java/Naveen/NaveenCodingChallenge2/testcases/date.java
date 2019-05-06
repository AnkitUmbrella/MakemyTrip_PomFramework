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
	
	
  // @Test(priority=1)
	public String Getcurr(){
		
		String x= getcurrentday();
		String y= datetest();
		//System.out.println(x);
		//System.out.println(y);
		String z=x+" "+y;
		z= z.replaceAll("/", " ");
		
		//System.out.println(z);
		return z;
		
	}
	
	
	
	
	//@Test(priority=2)
   public String Afterdate(){
		
		String a1= getcurrentday();
		String a2= datetest();
		a2= a2.replaceAll("/", " ");
		//System.out.println(a2);
		String month= a2.substring(0, 3);
		String date = a2.substring(4, 6);
		String year = a2.substring(7, 11);
		
		String EarlierDate= month+" "+date+" "+year;
		
		int datenext= Integer.parseInt(date);
		datenext= datenext+7;
		//System.out.println(datenext);
		
		String NewDate= month+" "+datenext+" "+year;
        String z= a1+" "+NewDate;
        //System.out.println(z);
        return z;
		
	}
	
}
