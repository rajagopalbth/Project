package org.stepclass;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition{
	
	   public WebDriver driver;
	   
	@Given("User is in Adactin login Page")
	public void user_is_in_Adactin_login_Page() {
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://adactinhotelapp.com/index.php");
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enter The valid Username and valid password")
	public void user_enter_The_valid_Username_and_valid_password() {
	    WebElement user = driver.findElement(By.id("username"));
	    user.sendKeys("Rajagopal007");
	    
	    WebElement pass = driver.findElement(By.id("password"));
		   pass.sendKeys("raja123");
	}

	@When("User click The login button")
	public void user_click_The_login_button() {
		
		WebElement log = driver.findElement(By.id("login"));
	    log.click();
	}

	@When("User Select The Location")
	public void user_Select_The_Location() {
		WebElement loc = driver.findElement(By.id("location"));
		Select s1=new Select(loc);
		s1.selectByVisibleText("New York");
	}

	@When("User Select The Hotel Type")
	public void user_Select_The_Hotel_Type() {
	  WebElement hote = driver.findElement(By.id("hotels"));
	 Select s2 = new Select(hote);
	 s2.selectByVisibleText("Hotel Creek");
	}

	@When("User Select The Room Type")
	public void user_Select_The_Room_Type() {
	   WebElement room = driver.findElement(By.id("room_type"));
	   Select s3 = new Select(room);
	   s3.selectByVisibleText("Double");
	   
	}

	@When("User Select The Number Of Rooms")
	public void user_Select_The_Number_Of_Rooms() {
	   WebElement rnos = driver.findElement(By.id("room_nos"));
	   Select s4= new Select(rnos);
	   s4.selectByVisibleText("3 - Three");
	}

	@When("User Select The Adults per Room")
	public void user_Select_The_Adults_per_Room() {
	   WebElement aroom = driver.findElement(By.id("adult_room"));
	   Select s5=new Select(aroom);
	   s5.selectByVisibleText("3 - Three");
	}

	@When("User Select The Children per Room")
	public void user_Select_The_Children_per_Room() {
	   WebElement croom = driver.findElement(By.id("child_room"));
	   Select s6=new Select(croom);
	   s6.selectByVisibleText("1 - One");
	}

	@When("user Click The Search button")
	public void user_Click_The_Search_button() {
	   WebElement sub = driver.findElement(By.id("Submit"));
	  sub.click();
	}

	@When("User Click The Select The Radio Button")
	public void user_Click_The_Select_The_Radio_Button() {
	   WebElement rio = driver.findElement(By.id("radiobutton_0"));
	   rio.click();
	}

	@When("User Click The Continue button")
	public void user_Click_The_Continue_button() {
	   WebElement cl1 = driver.findElement(By.id("continue"));
	   cl1.click();
	}

	@When("User Enter The First Name")
	public void user_Enter_The_First_Name() {
	   WebElement fn = driver.findElement(By.id("first_name"));
	   fn.sendKeys("Rajagopal");
	}

	@When("User Enter The Last Name")
	public void user_Enter_The_Last_Name() {
	   WebElement ln = driver.findElement(By.id("last_name"));
	   ln.sendKeys("B");
	}

	@When("User enter The Address")
	public void user_enter_The_Address() {
	   WebElement add = driver.findElement(By.id("address"));
	   add.sendKeys("no:34 kk nager chrompet chennai 54 ");
	}

	@When("User Enter The Credit Card No")
	public void user_Enter_The_Credit_Card_No() {
	   WebElement cc = driver.findElement(By.id("cc_num"));
	   cc.sendKeys("1234567890123456");
	}

	@When("User Enter The Credit Card Type")
	public void user_Enter_The_Credit_Card_Type() {
	  WebElement cct = driver.findElement(By.id("cc_type"));
	  Select s8=new Select(cct);
	  s8.selectByVisibleText("VISA");
	}

	@When("User Enter The Expiry Date")
	public void user_Enter_The_Expiry_Date() {
	   WebElement mon = driver.findElement(By.id("cc_exp_month"));
	   Select s9=new Select(mon);
	   s9.selectByVisibleText("January");
	   WebElement year = driver.findElement(By.id("cc_exp_year"));
	   Select s10=new Select(year);
	   s10.selectByVisibleText("2011");  
	}

	@When("User Enter The CVV Number")
	public void user_Enter_The_CVV_Number() {
	   WebElement cvv = driver.findElement(By.id("cc_cvv"));
	   cvv.sendKeys("488");
	   
	  
	}

	@When("User Click The book Now button")
	public void user_Click_The_book_Now_button() {
	    WebElement bn= driver.findElement(By.id("book_now"));
	    bn.click();
	    
	    Alert a = driver.switchTo().alert();
		   a.accept();
		   
		   WebElement b= driver.findElement(By.id("book_now"));
		    b.click();     
	}

	@When("User Wait For Five min")
	public void user_Wait_For_Five_min() throws InterruptedException {
	     
	}

	@Then("User Get The Order Number")
	public void user_Get_The_Order_Number() {
		
		WebElement num = driver.findElement(By.id("order_no"));
		String str = num.getAttribute("value");
		System.out.println(str);
		
		
	}



}
