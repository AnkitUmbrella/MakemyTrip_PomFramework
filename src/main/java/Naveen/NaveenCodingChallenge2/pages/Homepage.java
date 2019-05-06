package Naveen.NaveenCodingChallenge2.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//@author : Ankit Lohia

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Naveen.NaveenCodingChallenge2.base.TestBaseChallenge;



public class Homepage extends TestBaseChallenge {

	
	
	//PageFactory Elements or Object repo define for this class
	
	@FindBy(xpath="//li[2]/span[@class='tabsCircle appendRight5']") //Roundtrip Radiobutton click
	WebElement RoundtripRadioButton;
	
	
	
	@FindBy(id="fromCity") //FromCity
	WebElement Fromcity;
	
	
	@FindBy(id="toCity") //ToCity
	WebElement Tocity;
	
	@FindBy(xpath="//div[@class='fsw_inputBox dates inactiveWidget ']") //Departure
	WebElement Departure;
	
	@FindBy(xpath="//div[@class='fsw_inputBox dates reDates inactiveWidget  ']") //Arrival
	WebElement Arrival;
	

	@FindBy(xpath="//span[@class='splitVw-outer append_right9']") //ListViewPrice
	List<WebElement> ListViewPrice;

	
	@FindBy(xpath="//div[@class='fli-list splitVw-listing']") //topten listing
	List<WebElement> topten;

////span[@class='splitVw-outer append_right9']

	@FindBy(xpath="//a[contains(text(), 'Search')]")
	WebElement SearchBtn;
	
	
	
	@FindBy(id="ow_domrt-jrny")
	List<WebElement> deptFlights;
	
	@FindBy(id="rt-domrt-jrny")
	List<WebElement> ReturnFlights;
	
	
	//span[@class='labeltext']
	@FindBy(xpath="//*[@id='fli_filter__stops']/span[1]/label/span[1]")
	WebElement Nonstop;
	

	//span[@class='labeltext']
	@FindBy(xpath="//*[@id='fli_filter__stops']/span[2]/label/span[1]")
	WebElement Onestopfilter;
	
	//selecting all radiobuttons
	
	@FindBy(xpath="//div[@class='paddLR15 make_flex append_bottom7']/span[1]")
	List<WebElement> RadioBtnAll;
	
	
	
	
   //Create Constructor of this class
	//Initializing the Page Objects
   public Homepage() {
	   PageFactory.initElements(driver, this);
	      
	   
   }

   
   //Actions
   
   public boolean Roundtripbtn() {
	  boolean result= RoundtripRadioButton.isDisplayed();
	 return result;
   }
   
   
   public void Roundtripclick() {
	   RoundtripRadioButton.click();
	 
   }
   
   
   public void FromcityInput(String data) {
	   Fromcity.sendKeys(data);
	 
   }
   
   public void TocityInput(String data) {
	   Tocity.sendKeys(data);
	 
   }
   
   
   public void SelectDates(String dateval) {
	   Departure.click();
	   driver.findElement(By.xpath("//div[@aria-label='"+dateval+"']")).click();
       //SetcalenderbyJS(element, dateval);
	 
   }
   
   
   public void Searchclick(){
	   SearchBtn.click();
	   
   }
   

   
   public void AllDepartureFlights(){
	   for (int i=0; i<ReturnFlights.size(); i++) {
		   
		   for(int j=0; j<deptFlights.size();j++) {
			   System.out.println(deptFlights.get(j).getText());  
			    System.out.println("------------------------------------");
		   }
		    System.out.println(ReturnFlights.get(i).getText());  
		    System.out.println("------------------------------------");
		    
		    
	   }
	  
	      
   }
   
   
   
   
   public void Nonstopcheckbox() {
	   Nonstop.click();
   }
   
   public void Onestopcheckbox() {
	   Onestopfilter.click();
   }
   
   
   
   
   
   public void TenRadioOptions() throws InterruptedException {
        for (int i=0;i<=9; i++) {
		   System.out.println(topten.get(i).getText());
		   

        }
   }
   
   
      
 		
 		

   
   public void Selectingallradiobutton() throws InterruptedException {
	   Actions act= new Actions(driver);
	   scrolldownpage();
	   int j=0;
	   while(j<=RadioBtnAll.size()) {
		   Thread.sleep(2000);
		Actions wb= act.moveToElement(RadioBtnAll.get(j));
		 // focus(RadioBtnAll.get(j));
		wb.click().build().perform();
		   Thread.sleep(2000);
		   scrolldownpage();
		   //String price= driver.findElement(By.xpath("//span[@class='INR']")).getText();
		   //System.out.println(price);
	   }	   
	   
   
   }
}
   
   



