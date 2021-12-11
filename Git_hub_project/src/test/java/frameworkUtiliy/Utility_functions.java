package frameworkUtiliy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Utility_functions {
	@Test
	public static String Test_configuration(String key) throws IOException{
		String filepath="./Test_configuration/Config.properties";
		FileInputStream fis=new FileInputStream(filepath);
		//created object for properties
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	public static void Enter_value_in_edit_field(WebElement element,String value){
		element.sendKeys(value);
	}
	public static void click_element(WebElement element){
		element.click();
	}
	public static void select_by_visibletext(WebElement element,String s) {
		// TODO Auto-generated method stub
		Select sc=new Select(element);
		sc.selectByVisibleText(s);
	}
	public static void select_by_index(WebElement element,int i) {
		// TODO Auto-generated method stub
		Select sc=new Select(element);
	     sc.selectByIndex(i);
	}
	public static void select_by_value(WebElement element,String s) {
		// TODO Auto-generated method stub
		Select sc=new Select(element);
		sc.selectByValue(s);
	}
}
