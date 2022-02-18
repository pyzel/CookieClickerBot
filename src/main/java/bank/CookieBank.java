package bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookieBank {

    WebDriver webDriver;

    // XPATHS
    private static By COOKIE_COUNT_AND_PER_SECOND = By.xpath("//div[@id='cookies']");

    public int cookies = 0;
    public int cookiesPerSecond = 0;

    public CookieBank(WebDriver webDriver_) {
        webDriver = webDriver_;
    }

    public void updateCookieCountAndPerSecond() {
        String s = webDriver.findElement(COOKIE_COUNT_AND_PER_SECOND).getText().replace("\n", "");
        String cookies = s.substring(0, s.indexOf("cook"));
        String perSecond = s.replace(" ", "");
        perSecond = perSecond.substring(perSecond.indexOf(":")).replace("\n", "").replace(":", "");

        setCookieCount(Integer.parseInt(cookies.substring(0, 1)));
        setCookiesPerSecond(Integer.parseInt(perSecond.substring(perSecond.length() - 1, perSecond.length()))); //
    }

    public void setCookieCount(int newCount) {
        cookies = newCount;
    }

    public void setCookiesPerSecond(int newCps) {
        System.out.println("");
        cookiesPerSecond = newCps;
    }

    public int getCookieCount() {
        return cookies;
    }

    public int getCookiesPerSecond() {
        return cookiesPerSecond;
    }
}
