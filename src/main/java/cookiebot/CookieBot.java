package cookiebot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import basepage.BasePage;
import pageobjects.BigCookie;
import pageobjects.Store;

public class CookieBot {

    public WebDriver webDriver;
    public ChromeOptions options;
    public BasePage basePage;
    // public static boolean loggingEnabled = true; TO-DO -- MAKE A Logger.java class I can import into every page object which will print operations globally
    private boolean isRunning = false;

    public CookieBot() {
        options = new ChromeOptions();
        setProperties();
        webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        basePage = new BasePage(webDriver);
    }

    public void openPage() {

        this.webDriver.navigate().to("https://orteil.dashnet.org/cookieclicker/");

    }


    public static void main(String[] args) {

        CookieBot cookieBot = new CookieBot();

        cookieBot.openPage();
        cookieBot.basePage.clickCookieAcknowledgement();

        while(cookieBot.isRunning) {
            cookieBot.conductRegularOperations();

        }

    }

    public void conductRegularOperations() {

//		if(loggingEnabled) {
//			int i = 0;
//			System.out.println("Log: conductRegularOperations - " + i);
//			i++;
//		}
        this.basePage.bigCookie.clickBigCookie();
        this.basePage.cookieBank.updateCookieCountAndPerSecond();

        // check available cookies in bank
        // check available upgrades
        // check available buildings
        // purchase viable upgrades
        // purchase viable buildings
    }

    public void setProperties() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Tristan's PC\\eclipse\\java-2018-09\\Webdriver\\selenium-java-3.141.59\\libs\\chromedriver.exe");
        isRunning = true;
    }

    public void setIsRunning(boolean state) {
        isRunning = state;
    }
}
