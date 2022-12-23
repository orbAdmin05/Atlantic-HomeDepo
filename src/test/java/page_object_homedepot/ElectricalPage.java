package page_object_homedepot;

import command_providers_homedepot.ActOn1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ElectricalPage {

    private static final Logger logger = LogManager.getLogger(ElectricalPage.class);
    private final By AllDepartment = By.linkText("All Departments");
    private final By Electrical = By.linkText("Electrical");
    private final By HomeSecuritySystem = By.linkText("Home Security Systems");
    private final By SecurityCameraSystems = By.xpath("//*[@id=\"column_thd_2f90\"]/div/div/div/a[1]/p");
    private final By SwannCamera = By.xpath("//*[@id=\"browse-search-dimensions\"]/div/div[5]/div/div[2]/div/div[3]/div/label/a/h3");
    private final By actualText = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div/h1[@class=\"results-header__keyword\"]");

    WebDriver driver;
    public ElectricalPage(WebDriver driver){
        this.driver=driver;
    }

    public ElectricalPage mouesHoverToAllDepartment(){
        ActOn1.element1(driver,AllDepartment).mouseHover();
        return this;
    }
    public ElectricalPage navigateToElectrical(){
        ActOn1.element1(driver,Electrical).click();
        return this;
    }
    public ElectricalPage navigateToHomeSecuritySystem(){
        ActOn1.element1(driver,HomeSecuritySystem).click();
        return this;
    }
    public ElectricalPage navigateToSecurityCameraSystems(){
        ActOn1.element1(driver,SecurityCameraSystems).click();
        return this;
    }
    //    public ElectricalPage clickOnSwannCamera(){
//        ActOn1.element1(driver,SwannCamera).click();
//        return new ElectricalPage(driver);
//    }
    public ElectricalPage validateSwanCamera(String ExpectedText){

        logger.debug("Validate text is: " +ExpectedText);

        String ActualText = ActOn1.element1(driver,actualText).getTextValue();
        Assert.assertEquals(ActualText,ExpectedText);
        return this;
    }
}
