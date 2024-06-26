package org.adactin_runner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Adactin_feature\\Adactin_Hotel.feature", glue="org.adactin_stepdef")


public class Adactin_runner {
	public static WebDriver driver;
	
@BeforeClass
	
	public static void Start() {
		
		driver=new ChromeDriver();
		
		
	}

}
