package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.GooglePages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
GooglePages pg;
WebDriver Driver;
@Parameters({"Browser","url"})
@BeforeClass
public void main(String Browser,String url)throws IOException{
	if(Browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		Driver=new EdgeDriver();
	}
	pg=new GooglePages(Driver);
	Driver.manage().window().maximize();
	Driver.get(url);
	
}
@AfterClass
public void teardown() throws InterruptedException {
Driver.close();
Thread.sleep(5000);
}
}
