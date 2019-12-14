package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement xpath = driver.findElement(By.xpath("//input[@data-test='email']"));
        xpath.sendKeys("Abi Naber?");
        BrowserUtilities.wait(4.0);
        driver.close();
    }
}
