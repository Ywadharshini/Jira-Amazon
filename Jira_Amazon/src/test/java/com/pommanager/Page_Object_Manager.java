package com.pommanager;

import org.openqa.selenium.WebDriver;
import com.pom.classs.HomePage;
import com.pom.classs.PurchasePage;
import com.pom.classs.TodaysDeal;

public class Page_Object_Manager {

	public WebDriver driver;
	
	private HomePage hp;
	private TodaysDeal td;
	private PurchasePage pp;
	
	public Page_Object_Manager(WebDriver driver) {

		this.driver = driver;
	}
	
	public HomePage getHp() {
		
		if (hp == null) {
			hp = new HomePage(driver);
		}
		return hp;
		
	}

	public TodaysDeal getTd() {
		
		if (td == null) {
			td = new TodaysDeal(driver);
		}
		return td;
	}

	public PurchasePage getPp() {
		
		if (pp == null) {
			pp = new PurchasePage(driver);
		}
		return pp;
	}
}
