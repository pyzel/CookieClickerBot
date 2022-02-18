package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import bank.CookieBank;
import pageobjects.BigCookie;
import pageobjects.Store;

public class BasePage {

    // cookies banner 'Got it!' acknowledgment button
    private static final By GOT_IT =  By.xpath("//a[@data-cc-event='click:dismiss']");

    WebDriver webDriver;
    public BigCookie bigCookie;
    public Store store;
    public CookieBank cookieBank;

    public BasePage(WebDriver webDriver_) {
        webDriver = webDriver_;
        bigCookie = new BigCookie(webDriver);
        store = new Store(webDriver);
        cookieBank = new CookieBank(webDriver);
        	}

    public void clickCookieAcknowledgement() {
        if(checkForGotItButton()) { webDriver.findElement(GOT_IT).click(); }
    }

    public boolean checkForGotItButton() {

        boolean isExists = true;
        try {
            webDriver.findElement(GOT_IT);
        } catch (NoSuchElementException e) {
            isExists = false;
            System.out.println("Info: Cookie acknowledgement button not found.");
        }
        return isExists;

    }
}
