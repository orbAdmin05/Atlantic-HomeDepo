package TestHD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testhd1 {
//    @Test
//    public void testhd(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.homedepot.com/");
//
//        String atxt = driver.findElement(By.xpath("//*[@id=\"myStore\"]/a/span/div[1]")).getText();
//        System.out.println(atxt);
//        Assert.assertEquals(atxt,"You're shopping");
//
//        driver.findElement(By.xpath("//*[@id=\"headerMyAccount\"]/div[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"SPSOSignIn\"]/a/span")).click();
//        driver.findElement(By.id("username")).sendKeys("morbed11@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span")).click();
//
//    }
    @Test
    public void cameraPageTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("All Departments"))).perform();

        driver.findElement(By.linkText("Electrical")).click();
        driver.findElement(By.linkText("Home Security Systems")).click();
        driver.findElement(By.xpath("//*[@id=\"column_thd_2f90\"]/div/div/div/a[1]/p")).click();
        driver.findElement(By.xpath("//*[@id=\"browse-search-dimensions\"]/div/div[4]/div/div[2]/div/div[3]/div/label/a")).click();

       // String actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div/h1")).getText();
        String actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div/h1")).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText,"Wired Security Camera Systems");
        //Assert.assertEquals(actualText,"Swann Wired Security Camera Systems");
    }
}
