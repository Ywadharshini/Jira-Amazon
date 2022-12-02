package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.utilityfiles.Utility_Files;

public class Amazon_Runner extends Utility_Files {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = browser_Launch("chrome");

		url_Launch("https://www.amazon.in/ref=nav_logo");

		manage_Commands("maximize");

		waits("implicit wait", 20);
		
		WebElement todaysDeal = driver.findElement(By.xpath("//a[text() = \"Today's Deals\"]"));
		click_On_Element(todaysDeal);

		WebElement price = driver.findElement(By.xpath("(//a[@aria-pressed=\"false\"])[6]"));
		click_On_Element(price);

		WebElement product = driver.findElement(By.xpath("//img[contains(@alt,'Exciting offers on latest')]"));
		click_On_Element(product);

		WebElement earPhone = driver.findElement(By.xpath("(//img[@class='s-image'])[3]"));
		click_On_Element(earPhone);

		window();

		WebElement color = driver.findElement(By.xpath("//li[@title='Click to select Blue']"));
		click_On_Element(color);

		sleep(2000);

		WebElement qty = driver.findElement(By.xpath("//select[@name='quantity']"));
		dropDown(qty, "value", "3");

		sleep(2000);
		
		WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
		click_On_Element(addToCart);

		sleep(2000);

		WebElement cart = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		click_On_Element(cart);
	}
}
