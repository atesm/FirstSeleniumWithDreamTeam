package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class AnnotationTest {
    /*
            before --> Chrome browser opens
                        go to the link
            Test1 --> click on link
                        return url
            After --> close driver

             before --> Chrome browser opens
                        go to the link
            Test2 --> click on link
                        return url
            After --> close driver
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
    }

    @Test(description = "Verifying url of Sign up for mailing list page")
    public void test1(){
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        String expectedUrl= "https://practice-cybertekschool.herokuapp.com/sign_up";
        String actualUrl = driver.getCurrentUrl();
       // BrowserUtilities.verifyEquals(actualUrl,expectedUrl);
        Assert.assertEquals(actualUrl,expectedUrl,"Url was wrong");



    }

    @Test(description = "Verifying url of Multiple Buttons page")
    public void test2(){
        driver.findElement(By.linkText("Multiple Buttons")).click();
        String expectedUrl = "https://practice-cybertekschool.herokuapp.com/multiple_buttons";
        String actualUrl = driver.getCurrentUrl();
       // BrowserUtilities.verifyEquals(actualUrl,expectedUrl);
        Assert.assertEquals(actualUrl,expectedUrl,"Url was wrong");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
