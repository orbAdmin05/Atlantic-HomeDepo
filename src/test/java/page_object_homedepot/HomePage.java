package page_object_homedepot;

import command_providers_homedepot.ActOn1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends NavigationBar1{
    private static final Logger logger = LogManager.getLogger(HomePage.class);
    private final By PageValidation = By.xpath("//*[@id=\"myStore\"]/a/span/div[1]");
    private final By MyAccount = By.xpath("//*[@id=\"headerMyAccount\"]/div[1]");
    private final By SignInButton = By.xpath("//*[@id=\"SPSOSignIn\"]/a/span");
    private final By EmailIdField = By.id("username");
    private final By ContinueButton = By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span");

    public HomePage(WebDriver driver){
        super(driver);
    }
    public HomePage homePageValidation (String expectedText){

        logger.debug("Validate the text is: " +expectedText);

        String ActualText = ActOn1.element1(driver,PageValidation).getTextValue();
        Assert.assertEquals(ActualText,expectedText);
        return this;
    }
    public HomePage clickOnMyAccount(){
        ActOn1.element1(driver,MyAccount).click();
        return this;
    }
    public HomePage clickOnSignInButton(){
        ActOn1.element1(driver,SignInButton).click();
        return this;
    }
    public HomePage emailInputField(String value){
        ActOn1.element1(driver,EmailIdField).typeValue(value);
        return this;
    }
    public HomePage clickOnContinueButton(){
        ActOn1.element1(driver,ContinueButton).click();
        return this;
    }

}
