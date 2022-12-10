package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.GooglePages;

public class GoogleSearch extends TestBase {
	GooglePages g;
	@Parameters({"Browser","url"})
	@Test
	public void search() throws IOException,InterruptedException{
		g=new GooglePages(Driver);
		g.a().click();
		g.a().sendKeys("Selenium");
		@SuppressWarnings("unchecked")
		List<WebElement> dropdown=(List<WebElement>) g.dropdown();
	    for(WebElement item: dropdown)
	    {
	    	System.out.println(item.getText());
	    }
	}

}
