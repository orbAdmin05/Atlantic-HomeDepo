package command_providers_homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssertThat1 {
    public static ElementAssertions1 elementAssertions1(WebDriver driver, By locator){
        return new ElementAssertions1(driver,locator);
    }
}
