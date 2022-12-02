package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver; // null

	@FindBy(xpath = "//a[text() = \"Today's Deals\"]")
	private WebElement TodaysDeal;

	public HomePage(WebDriver driver) {

		this.driver = driver; // runner class driver
		PageFactory.initElements(driver, this);
	}

	public WebElement getTodaysDeal() {
		return TodaysDeal;
	}

}
