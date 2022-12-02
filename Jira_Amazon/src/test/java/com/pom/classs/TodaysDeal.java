package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDeal {

	public WebDriver driver; // null

	@FindBy(xpath = "(//a[@aria-pressed=\"false\"])[6]")
	private WebElement price;

	@FindBy(xpath = "//img[contains(@alt,'Exciting offers on latest')]")
	private WebElement product;

	@FindBy(xpath = "(//img[@class='s-image'])[3]")
	private WebElement earphone;

	public TodaysDeal(WebDriver driver) {

		this.driver = driver; // runner class driver
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPrice() {
		return price;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getEarphone() {
		return earphone;
	}


}
