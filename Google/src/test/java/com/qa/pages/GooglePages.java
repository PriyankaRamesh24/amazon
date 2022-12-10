package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
WebDriver Driver;
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
WebElement a;
public WebElement a() {
	return a;
}
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]")
WebElement dropdown;
public WebElement dropdown() {
	return dropdown;
}

public GooglePages(WebDriver Driver) {
	this.Driver=Driver;
	PageFactory.initElements(Driver,this);
}
}
