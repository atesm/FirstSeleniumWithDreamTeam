package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class PartialLinkText {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.partialLinkText("Sign Up")).click();
        driver.findElement(By.name("full_name")).sendKeys("sahddsa");
        driver.findElement(By.name("email")).sendKeys("email@email.com");
        driver.findElement(By.name("wooden_spoon")).click();

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
