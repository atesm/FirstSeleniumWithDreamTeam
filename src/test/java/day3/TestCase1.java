package day3;

import org.openqa.selenium.*;
import utilities.*;

public class TestCase1 {

    public static void main(String[] args) {
       WebDriver driver = BrowserFactory.getDriver("chrome");
       driver.get("https://practice-cybertekschool.herokuapp.com/");
       //Click on Sign Up for mailing list
       driver.findElement(By.linkText("Sign Up For Mailing List")).click();

       //Enter Valid name
        WebElement name = driver.findElement((By.cssSelector("[type='text']")));
        name.sendKeys("Mucahit Dervis");

        //Enter valid email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("email@email.com");

        //Click on Sign Up button
        WebElement signUpButton= driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";
        WebElement verificationMessage= driver.findElement(By.cssSelector("[name='signup_message']"));
        String actualMessage=verificationMessage.getText();
        BrowserUtilities.verifyEquals(actualMessage,expectedMessage);

        driver.findElement(By.xpath("//a(contains(text(),\"Google Site\"))"));



        driver.close();
    }
}
