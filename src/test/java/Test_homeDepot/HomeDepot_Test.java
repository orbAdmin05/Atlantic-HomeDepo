package Test_homeDepot;

import command_providers_homedepot.ActOn1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object_homedepot.HomePage;


public class HomeDepot_Test {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
    }
    @Test
    public void launchHomePage(){
        new HomePage(driver)
                .homePageValidation("You're shopping")
                .clickOnMyAccount()
                .clickOnSignInButton()
                .emailInputField("morbed11@gmail.com")
                .clickOnContinueButton();
    }
//    @AfterMethod
//    public void closeBrowser(){
//        ActOn1.browser(driver).closeBrowser();
//    }
}
