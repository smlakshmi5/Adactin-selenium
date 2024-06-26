package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
 
	public static WebDriver driver;
	public static void url(WebDriver driver,String s) {
    driver.get(s);

}
	public static void maximize(WebDriver driver) {
driver.manage().window().maximize();

}
	public static void toclick(WebElement e) {
e.click();


}
	public static void tosendvalues(WebElement w, String v) {
w.sendKeys(v);


}
	public static void toselect(WebDriver driver, WebElement e, int a) {
Select dropdown = new Select(e);
dropdown.selectByIndex(a);


}
	
	
	
	
	
	
	
	
	
	
}
