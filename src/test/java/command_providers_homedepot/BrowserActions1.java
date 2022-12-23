package command_providers_homedepot;

import org.openqa.selenium.WebDriver;

public class BrowserActions1 {
    // Three types of actions--> browser open, browser close, get Title
    WebDriver driver;

    public BrowserActions1(WebDriver driver){
        this.driver = driver;
    }

    public BrowserActions1 openBrowser(String url){
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return this;
    }
    public BrowserActions1 closeBrowser(){
        driver.quit();
        return this;
    }
    public String getTitle(){
        return driver.getTitle();
        //  return this ( this = browserActions1 class );
    }
}
