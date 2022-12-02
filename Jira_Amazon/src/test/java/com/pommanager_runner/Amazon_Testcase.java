package com.pommanager_runner;

import org.openqa.selenium.WebDriver;
import com.pommanager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class Amazon_Testcase extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException {

		url_Launch("https://www.amazon.in/ref=nav_logo");

		manage_Commands("maximize");

		waits("implicit wait", 20);

		click_On_Element(manager.getHp().getTodaysDeal());

		click_On_Element(manager.getTd().getPrice());

		click_On_Element(manager.getTd().getProduct());

		click_On_Element(manager.getTd().getEarphone());

		window();

		click_On_Element(manager.getPp().getColor());

		sleep(2000);

		dropDown(manager.getPp().getQty(), "value", "3");

		sleep(2000);

		click_On_Element(manager.getPp().getAddToCart());

		sleep(2000);

		click_On_Element(manager.getPp().getCart());
	}
}
