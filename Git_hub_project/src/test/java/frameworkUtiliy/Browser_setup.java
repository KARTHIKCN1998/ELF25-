
 package frameworkUtiliy;
 import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class Browser_setup 
{
	public WebDriver driver;
	@BeforeTest()
	public void Browser_setup1S() throws IOException{
		 System.setProperty("webdriver.chrome.driver","E:\\ass19\\workspace\\Elf_25 Selenium_Training\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     String Url=Utility_functions.Test_configuration("AppUrl1");
	     driver.get(Url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
   @AfterTest
	public void Browser_teardown(){
		driver.close();
	}
}
