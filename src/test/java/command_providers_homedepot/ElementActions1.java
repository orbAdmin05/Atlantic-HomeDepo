package command_providers_homedepot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ScreenCapture;

import java.time.Duration;

public class ElementActions1 {
    //web element related functionalities --> click, typing, hover mouse, select value from drop down
   private static final Logger logger = LogManager.getLogger(ElementActions1.class);
   public WebDriver driver;
   private By locator;
    // Constructor
    public ElementActions1(WebDriver driver, By locator){
        this.driver = driver;
        this.locator = locator;
    }
    public WebElement getElement(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = null;
        try{
            element = driver.findElement(locator);
        }catch (Exception e){
            ScreenCapture.getScreenShot(driver);
            logger.error("Element Exception: " +e.getMessage());
        }
        return element;
    }
    public ElementActions1 click(){
        getElement().click();
        return this;
    }
    public ElementActions1 typeValue(String value){
        getElement().clear();
        getElement().sendKeys(value);
        return this;
    }
    public ElementActions1 selectValue(String value){
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
        return this;
    }
    public ElementActions1 mouseHover(){
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement()).perform();
        return this;
    }
    public String getTextValue(){
        return getElement().getText();
    }
}
