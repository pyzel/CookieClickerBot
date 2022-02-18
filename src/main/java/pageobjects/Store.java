package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Store {



    // Store item xpaths

    private static final String STORE_ITEM_PURCHASE_BUTTON = "//div[@id='product%d' and contains(@class, 'product unlocked enabled')]";

    WebDriver webDriver;

    public Store(WebDriver webDriver_) {
        webDriver = webDriver_;
    }

    //TODO - Create enum for store items to pass in
    public void purchaseItem(String storeItem_) {
        webDriver.findElement(By.xpath(String.format(STORE_ITEM_PURCHASE_BUTTON, 1))).click(); // replace 1 with enum.getValue()
    }
}
