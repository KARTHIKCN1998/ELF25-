package testcasetest;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import frameworkUtiliy.Browser_setup;
import frameworkUtiliy.Utility_functions;
public class Login_addtocartTestcase_DWS extends Browser_setup {
	@DataProvider
	public Object[][] testdata(){
		Object[][] data=new Object[5][2];
		//Ist iteration
		data[0][0]="karthikcn1998@gmail.com";
		data[0][1]="karthik93@";
		//IInd iteration
		data[1][0]="karthik1@gmail.com";
		data[1][1]="Karthik93@";
		//3rd iteration
	    data[2][0]="karthik2@gmail.com";
	    data[2][1]="Karthik93@";
		//4th iteration
    	data[3][0]="karthik3@gmail.com";
		data[3][1]="Karthik93@";
		//5th iteration
		data[4][0]="karthik3@gmail.com";
		data[4][1]="Karthik93@";
		return data;
		
	}
	@Test(dataProvider="testdata")
	public void Tc02_login(String Username,String Password ) throws IOException, InterruptedException
	{
		  //String email="karthikcn1998@gmail.com";
		 //String password="Karthik93@";
		/*System.setProperty("webdriver.chrome.driver","E:\\ass19\\workspace\\Elf_25 Selenium_Training\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	     String Url=Utility_Functions.Test_configuration("AppUrl1");
	     driver.get(Url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);*/
	  	WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
	  		Utility_functions.click_element(login);
		WebElement Username1= driver.findElement(By.xpath("//input[@id='Email']"));
			Utility_functions.Enter_value_in_edit_field(Username1, Username);
		WebElement Password1= driver.findElement(By.xpath("//input[@id='Password']"));
		  Utility_functions.Enter_value_in_edit_field(Password1, Password);
		WebElement login_button= driver.findElement(By.xpath("//input[@value='Log in']"));
		  Utility_functions.click_element(login_button);
		  Thread.sleep(3000);
			}
	
}

