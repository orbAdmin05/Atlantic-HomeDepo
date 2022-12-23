package Test_homeDepot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object_homedepot.ElectricalPage;
import page_object_homedepot.HomePage;
import page_object_homedepot.NavigationBar1;

public class Test_CameraBuying{
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void testSelectSecurityCamera(){
        new ElectricalPage(driver)
                .mouesHoverToAllDepartment()
                .navigateToElectrical()
                .navigateToHomeSecuritySystem()
                .navigateToSecurityCameraSystems()
                .validateSwanCamera("Wired Security Camera Systems");
    }
  //  @AfterMethod
//    public void closeBrowser(){
//        ActOn1.browser(driver).closeBrowser();
//    }
}
