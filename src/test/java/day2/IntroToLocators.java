package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class IntroToLocators {
    public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
        // ChromeDriver driver = new ChromeDriver();
         WebDriver driver = BrowserFactory.getDriver("chrome");
         driver.get("http://a.testaddressbook.com/sign_in");

         //Find element by name attribute
        WebElement email = driver.findElement(By.name("session[email]"));
        email.sendKeys("kexesobepu@zsero.com");
        //Find element by id attribute
        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("password");
        // Find element by class attribute
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        String expectedTitle = "Address Book";
        String actualTitle = driver.getTitle(); // returns the title of page
        BrowserUtilities.verifyEquals(actualTitle,expectedTitle);






         // driver.close(); // Close current tab
         driver.quit(); // Close ALL tabs
    }

}
