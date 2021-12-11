package testcasetest;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import frameworkUtiliy.Browser_setup;
import frameworkUtiliy.Utility_functions;
public class Register_dws extends Browser_setup{
	@DataProvider
	public Object[][] testdata1(){
		Object[][] data=new Object[2][5];
		//ist iteration
		data[0][0]="king1";
		data[0][1]="A";
		data[0][2]="king1@gmail.com";
		data[0][3]="123456";
		data[0][4]="123456";
		//2nd iteration
		data[1][0]="king2";
		data[1][1]="B";
		data[1][2]="king2@gmail.com";
		data[1][3]="123456";
		data[1][4]="123456";
		return data;
	}

	@Test(dataProvider="testdata1")
	public void Tc01_Reg(String firstnames,String lastnames,String Username,String password,String confirm ) throws IOException{
		         
		/*System.setProperty("webdriver.chrome.driver","E:\\ass19\\workspace\\Elf_25 Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		     String Url=Utility_Functions.Test_configuration("AppUrl1");
		     driver.get(Url);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);*/
		WebElement register_link=driver.findElement(By.xpath("//a[text()='Register']"));
		Utility_functions.click_element(register_link);;
		WebElement radiobutton=	driver.findElement(By.xpath("//input[@id='gender-male']"));
		Utility_functions.click_element(radiobutton);;
		WebElement firstName=driver.findElement(By.xpath("//input[@name='FirstName']"));
	      Utility_functions.Enter_value_in_edit_field(firstName, firstnames);
		WebElement lastName=driver.findElement(By.xpath("//input[@name='LastName']"));
		Utility_functions.Enter_value_in_edit_field(lastName, lastnames);;
 		WebElement Email=driver.findElement(By.xpath("//input[@name='Email']"));
		  Utility_functions.Enter_value_in_edit_field(Email, Username);
		WebElement Password=driver.findElement(By.xpath("//input[@name='Password']"));
		   Utility_functions.Enter_value_in_edit_field(Password, password);
		WebElement confirm_pass=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
	      Utility_functions.Enter_value_in_edit_field(confirm_pass, confirm);
		WebElement register_Button=driver.findElement(By.xpath("//input[@name='register-button']"));
		Utility_functions.click_element(register_Button);
	
	    }
}
