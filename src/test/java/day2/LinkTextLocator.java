package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class LinkTextLocator {

    public static void main(String[] args) {
      WebDriver driver = BrowserFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.get("https://practice-cybertekschool.herokuapp.com/");

        WebElement multipleButtons = driver.findElement(By.linkText("Multiple Buttons"));
        multipleButtons.click();

        WebElement button2 = driver.findElement(By.name("button2"));
        button2.click();

        String expectedMessage ="Clicked on button two!";
        WebElement resultMessage= driver.findElement(By.id("result"));
        String actualMessage= resultMessage.getText();
       BrowserUtilities.verifyEquals(actualMessage,expectedMessage);

        driver.close();
    }
}
