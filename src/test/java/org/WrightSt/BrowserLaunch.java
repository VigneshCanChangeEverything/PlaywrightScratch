package org.WrightSt;

import javax.naming.InitialContext;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		// Playwright.create(); >>> First Step <<<
	//  Return Type as Interface <<<< ie- Playwright is a Interface  >> Second Step<<
		
		Playwright intitialize = Playwright.create();  //  Creates a Browser Context for each Test
		
	/*	intitialize.chromium().launch(); >> Third Step >>> need to give the Browser engine details to the Browser Context for Launching using the Browser 
		BrowserContext object
								
		*/
//		intitialize.chromium().launch(// To set the Browser Head view need to configure in the Launch Method
//				// Use new Keyword to allocate the Space in the Heap memory and create an object instance of the Class
//				// This happens when we are using interface >> new BrowserType
//				// LaunchOptions() >> More chain methods 
//				// .setHeadless(false)   >>> To invoke the Browser UI 
//					new BrowserType.LaunchOptions().setHeadless(false) 				
//				); 
		
		Browser launch = intitialize.chromium().launch(
				
				new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome")
				
				
				); // browser is a interface
		
		// new Page is a method to launch the New Tab >> Which Returns Page Interface
	Page p = launch.newPage();
	// navigate is the method to launch the application url	
	p.navigate("https://www.facebook.com/login/");
	String title = p.title();
	System.out.println("Page Title is " +  title);
	
	
	
	
	
	
	
	
	p.close();	launch.close();
	intitialize.close();

	
	
	
	
		

	}

}
