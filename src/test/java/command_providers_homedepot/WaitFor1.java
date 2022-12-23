package command_providers_homedepot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFor1 {
    private static final Logger logger = LogManager.getLogger(WaitFor1.class);
   private WebDriver driver;
    private By locator;
    public WaitFor1(WebDriver driver, By locator){
        this.driver = driver;
        this.locator = locator;
    }

    public WaitFor1 waitForElementToBeVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }
    public WaitFor1 fixWait(long ms){
        try{
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            logger.error("Wait exception is: " +e.getMessage());
        }
        return this;
    }
}
