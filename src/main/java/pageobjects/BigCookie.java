package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cookiebot.CookieBot;

public class BigCookie {

    private static final By BIG_COOKIE_BY = By.xpath("//div[@id='bigCookie']");

    WebDriver webDriver;

    public BigCookie(WebDriver webDriver_) {
        webDriver = webDriver_;
    }

    public void clickBigCookie() {
//		if(loggingEnabled) {
//			int i = 0;
//			System.out.println("Log: clickBigCookie - " + i);
//			i++;
//		}
        webDriver.findElement(BIG_COOKIE_BY).click();
        //System.out.println("CLICK!");
    }
}
