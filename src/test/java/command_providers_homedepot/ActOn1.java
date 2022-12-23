package command_providers_homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActOn1 {
    // this class used to call browser Actions1, element Actions1, wait for

    public static BrowserActions1 browser(WebDriver driver){
        return new BrowserActions1(driver);
    }
    public static ElementActions1 element1(WebDriver driver, By locator){
        return new ElementActions1(driver,locator);
    }
    public static WaitFor1 wait(WebDriver driver, By locator){
       return new WaitFor1(driver,locator);
    }
}
