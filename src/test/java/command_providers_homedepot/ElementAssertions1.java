package command_providers_homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ElementAssertions1 {
    WebDriver driver;
   private By locator;

    public ElementAssertions1(WebDriver driver, By locator){
        this.driver = driver;
        this.locator = locator;
    }
    public ElementAssertions1 elementIsDisplayed(){
        boolean displayed = driver.findElement(locator).isDisplayed();
        Assert.assertTrue(displayed,"The expected element does not exist");
        return this;
    }
}
