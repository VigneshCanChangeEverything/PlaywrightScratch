package org.Practice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchingBrowser {
	
	
	@SuppressWarnings("deprecation")
	public static void main (String[]args ) {
		
	Playwright initialize = Playwright.create();
	Browser launch =initialize.chromium().launch(		
				new BrowserType.LaunchOptions().setHeadless(false));
	Page p = launch.newPage();
	p.navigate("https://www.instagram.com/");
	
	String title = p.title();
	System.out.println(title);
		
	String url = p.url();
	System.out.println(url);
	
	Locator Signup = p.locator("//*[@class='_ap3a _aaco _aacw _aad0 _aad7']");
	System.out.println(Signup);
	Signup.click();
	
	Locator email = p.locator("//*[@name='emailOrPhone']");
	email.fill("Vigneshwaran21@gmail.com");
	email.clear();
	email.type("Vigneshwaran97@gmail.com");
	email.press("Tab");
	Locator Fullname = p.locator("//*[@name='fullName']");
	Fullname.fill("Vigneshwaran");
	
//	initialize.close();
	
	
	
	
	
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
