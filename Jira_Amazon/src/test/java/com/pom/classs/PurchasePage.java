package com.pom.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {

	public WebDriver driver; // null

	@FindBy(xpath = "//li[@title='Click to select Blue']")
	private WebElement color;
	
	@FindBy(xpath = "//select[@name='quantity']")
	private WebElement qty;
	
	@FindBy(xpath = "//input[@value='Add to Cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//a[@id='nav-cart']")
	private WebElement cart;
	
	public PurchasePage(WebDriver driver) {

		this.driver = driver; // runner class driver
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getCart() {
		return cart;
	}

}
