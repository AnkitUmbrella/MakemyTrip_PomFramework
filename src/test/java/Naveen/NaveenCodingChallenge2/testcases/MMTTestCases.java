package Naveen.NaveenCodingChallenge2.testcases;

//@author : Ankit Lohia
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import Naveen.NaveenCodingChallenge2.ExtentReport.ExtentManager;

import Naveen.NaveenCodingChallenge2.pages.Homepage;

import Naveen.NaveenCodingChallenge2.base.TestBaseChallenge;



public class MMTTestCases extends TestBaseChallenge {
	 
	  Homepage home;  // create object of nonstatic method to access methods
	  ExtentReports rep;
	
	 public MMTTestCases() {
		 super(); //calling parent class constructor or method using super keyword
		
		
	 }
	 
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		getdriver();
	  home= new Homepage();
	  rep=ExtentManager.getInstance();
	  test = rep.startTest("MMTpage Started");
	  test.log(LogStatus.PASS, "Calling TestBase Class");
	  test.log(LogStatus.PASS, "TestBase class Initiated Successfully");

	  
	}
	
	
	
	@Test(priority=1)
	public void FlightCheck() throws InterruptedException{
		boolean test1= home.Roundtripbtn();
		System.out.println(test1);
		home.Roundtripclick();
		test.log(LogStatus.PASS, "Round Trip Radio Button Click");
	    home.FromcityInput("Delhi");
	    home.TocityInput("Bangalore");
	    test.log(LogStatus.PASS, "Providing From and To city");
	    
	  
		home.SelectDates("Fri May 03 2019");
		home.SelectDates("Thu May 09 2019");
		
		test.log(LogStatus.PASS, "Selecting Dates from calender");
		takeScreenShot();
		
		driver.manage().deleteAllCookies();
		home.Searchclick();
		
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Clicking on Search Button");
	
				
	}
	
	
	@Test(priority=2) //expectedExceptions=java.lang.NumberFormatException.class
	public void GetAllFlights() throws InterruptedException  {
		 
	    test.log(LogStatus.PASS, "Executing GetAllFlights TestCase");
		test.log(LogStatus.PASS, "Printing all flights after radio button selection");
	
		home.AllDepartureFlights();
		takeScreenShot();
		home.Nonstopcheckbox();
		home.Onestopcheckbox();
		System.out.println("**********************<-Flights after selecting checkboxes-> *******************************");
		home.AllDepartureFlights();
		
	}
	
	
	@Test(priority=3)
	public void ExtractToptenFlights() throws InterruptedException {
	
	System.out.println("**********************<-Top Ten flights Listed Below-> *******************************");
     home.TenRadioOptions();
		 
	test.log(LogStatus.PASS, "Extracting Top ten Flights");
	takeScreenShot();
	
	
	}
	
	
	
	/*
	
	@Test(priority=4)
	public void ClickAgentName() {
	
	 	
     String name1= home.agentclick();
     home.DetailPageName();
     //String expectedname1= home.DetailPageName();
     //Assert.assertEquals(name1, expectedname1);
     
 	takeScreenShot();
	test.log(LogStatus.PASS, "Compare Agent name");


		
		
	}
	
	*/
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		 test.log(LogStatus.PASS, "Quit Browser");
		 rep.endTest(test);
		 rep.flush();
		 driver.quit();
		
		
		
	}
}
	


