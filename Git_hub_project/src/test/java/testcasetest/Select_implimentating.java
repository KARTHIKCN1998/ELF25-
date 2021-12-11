package testcasetest;
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import frameworkUtiliy.Browser_setup;
import frameworkUtiliy.Utility_functions;

public class Select_implimentating extends Browser_setup {
	@Test
	public  void Select_imp(){
	WebElement ele=	driver.findElement(By.xpath(" (//a[@href='/books'])[1]"));
	Utility_functions.click_element(ele);
	WebElement books=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Utility_functions.select_by_index(books, 2);
	}
	
}
