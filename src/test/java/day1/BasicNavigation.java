package day1;


import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtilities;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
        WebDriver driver = BrowserFactory.getDriver("chrome");
        WebDriver driver1 = BrowserFactory.getDriver("firefox");


        String expectedGoogleTitle = "Google";
        String expectedAmazontitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        //get method waits for the whole page to load
        driver.get("http://google.com");
        String actualfirstTitle = driver.getTitle(); //Google
        //driver.get("http://amazon.com");
        // navigate method is faster than get method
        driver.navigate().to("http://amazon.com");
        String secondTitle = driver.getTitle();//Amazon

        //Go back to previous site
        driver.navigate().back();
        String thirdTitle = driver.getTitle(); // Google
        //Go forward to page ahead
        driver.navigate().forward();
        String fourthTitle = driver.getTitle();//Amazon

        //refresh the page
        driver.navigate().refresh();

        //First WebPage Title
        BrowserUtilities.verifyEquals(actualfirstTitle,expectedGoogleTitle);
        //Second WebPage Title
        BrowserUtilities.verifyEquals(secondTitle,expectedAmazontitle);
        //Third WebPage Title
        BrowserUtilities.verifyEquals(thirdTitle,expectedGoogleTitle);
        //Fourth WebPage Title
        BrowserUtilities.verifyEquals(fourthTitle,expectedAmazontitle);

        driver.close();
        //After close or quit method cannot use driver
       //driver.get("http://facebook.com");






    }
}
