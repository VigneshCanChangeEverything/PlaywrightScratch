package org.WrightSt;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {

	public static void main(String[] args) {
		Playwright initalize = Playwright.create();
		Browser launch = initalize.chromium().launch(
				new BrowserType.LaunchOptions().setHeadless(false)
				);
		Page p =launch.newPage();
		p.navigate("https://www.facebook.com/login/");
		

	}

}
