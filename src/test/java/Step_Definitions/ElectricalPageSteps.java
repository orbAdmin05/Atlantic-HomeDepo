package Step_Definitions;

import command_providers_homedepot.ActOn1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object_homedepot.ElectricalPage;
import utilities.ReadConfigFiles;

public class ElectricalPageSteps {
    private static final Logger logger = LogManager.getLogger(ElectricalPage.class);
    private static final By AllDepartment = By.linkText("All Departments");
    private static final By Electrical = By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section/div/ul/li[9]/a[@title=\"Electrical\"]");
    private static final By HomeSecuritySystem = By.linkText("Home Security Systems");
    private static final By SecurityCameraSystems = By.xpath("//*[@id=\"column_thd_2f90\"]/div/div/div/a[1]/p");
    private static final By actualText = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div/h1[@class=\"results-header__keyword\"]");
    WebDriver driver = Hooks.driver;
    @Given("^user open home depot home page$")
    public void openHomeDepotHomePage(){
        ActOn1.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("homedepotAppURL"));
        logger.info("user is in HomeDepot home page");
    }
    @When("^user hover over all department link$")
    public void navigateToAllDepartment(){
        ActOn1.element1(driver,AllDepartment).mouseHover();
        logger.info("user navigate to all department link");
    }
    @And("^click on electric link$")
    public void clickOnElectric(){
        ActOn1.element1(driver,Electrical).click();
        logger.info("user clicked on electric link");
    }
    @And("^click on home security systems$")
    public void clickOnHomeSecuritySystems(){
        ActOn1.element1(driver,HomeSecuritySystem).click();
        logger.info("user clicked on home security system link");
    }
    @And("^click on security camera systems$")
    public void clickOnSecurityCameraSystems(){
        ActOn1.element1(driver,SecurityCameraSystems).click();
        logger.info("user clicked on security camera system link");
    }
    @Then("^validate desired camera page$")
    public void validateCameraPage(){
        boolean wiredTextDisplayed = driver.findElement(actualText).isDisplayed();
        Assert.assertTrue("page not displayed",wiredTextDisplayed);
        logger.info("validate wired camera page");
    }
}
