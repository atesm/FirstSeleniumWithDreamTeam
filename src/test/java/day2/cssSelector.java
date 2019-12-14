package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class cssSelector {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://a.testaddressbook.com/sign_in");

        driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
        BrowserUtilities.wait(4.0);
    }
}
