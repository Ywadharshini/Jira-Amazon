package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.cucumber.concepts.Amazon_Testcase;
import com.pommanager.Page_Object_Manager;
import com.utilityfiles.Utility_Files;
import io.cucumber.java.en.*;

public class Stepdefinition extends Utility_Files{
	
	public static WebDriver driver = Amazon_Testcase.driver;

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);
	
	@Given("user launch The Application")
	public void user_launch_the_application() {
	    
		url_Launch("https://www.amazon.in/ref=nav_logo");

		manage_Commands("maximize");

		waits("implicit wait", 20);
	}
	
	@When("user Click On The Today's Deals Link in Amazon Home Page")
	public void user_click_on_the_today_s_deals_link_in_amazon_home_page() throws InterruptedException {
	   
		sleep(1000);
		
		click_On_Element(manager.getHp().getTodaysDeal());
		
	}
	
	@When("user Click On Price Link Under Price Category")
	public void user_click_on_price_link_under_price_category() {
		
		click_On_Element(manager.getTd().getPrice());
	    
	}
	
	@When("user click On Any One Of The Product")
	public void user_click_on_any_one_of_the_product() {
	    
		click_On_Element(manager.getTd().getProduct());
	}
	
	@When("user Click On the Bluetooth Product")
	public void user_click_on_the_bluetooth_product() {
	    
		click_On_Element(manager.getTd().getEarphone());
		
	}
	
	@When("user Change The Driver Position")
	public void user_change_The_driver_Position() {
	    
		window();
		
	}
	
	@When("user Change The Colour Of The Product")
	public void user_change_the_colour_of_the_product() {

		click_On_Element(manager.getPp().getColor());


	}
	
	@When("user Change The Quantity Of The Product")
	public void user_change_the_quantity_of_the_product() throws InterruptedException {
		
		sleep(2000);
	    
		dropDown(manager.getPp().getQty(), "value", "3");

		sleep(2000);
	}
	
	@When("user Click On The Add To Cart Button")
	public void user_click_on_the_add_to_cart_button() throws InterruptedException {
	   
		click_On_Element(manager.getPp().getAddToCart());

		sleep(2000);
	}
	
	@Then("user Click On The Cart Button to view the products and its Navigate to {string}")
	public void user_click_on_the_cart_button_to_view_the_products_and_its_navigate_to(String expected_Title) {
	    
		click_On_Element(manager.getPp().getCart());
		
		String title = expected_Title;

		String actual_Title = driver.getTitle();
		
		Assert.assertEquals(title, actual_Title);
	}

}
