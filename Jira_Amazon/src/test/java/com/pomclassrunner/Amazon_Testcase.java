package com.pomclassrunner;

import org.openqa.selenium.WebDriver;
import com.pom.classs.HomePage;
import com.pom.classs.PurchasePage;
import com.pom.classs.TodaysDeal;
import com.utilityfiles.Utility_Files;

public class Amazon_Testcase extends Utility_Files {

	public static WebDriver driver  = browser_Launch("chrome");
	public static HomePage hp = new HomePage(driver);
	public static TodaysDeal td = new TodaysDeal(driver);
	public static PurchasePage pp = new PurchasePage(driver);

	public static void main(String[] args) throws InterruptedException {

		
		 url_Launch("https://www.amazon.in/ref=nav_logo");

		manage_Commands("maximize");

		waits("implicit wait", 20);
		
		click_On_Element(hp.getTodaysDeal());

		click_On_Element(td.getPrice());

		click_On_Element(td.getProduct());

		click_On_Element(td.getEarphone());

		window();

		click_On_Element(pp.getColor());

		sleep(2000);

		dropDown(pp.getQty(), "value", "3");

		sleep(2000);
		
		click_On_Element(pp.getAddToCart());

		sleep(2000);

		click_On_Element(pp.getCart());
	}
}
