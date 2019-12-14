package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtilities;

public class MyFirstTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //Opens chrome browser
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        //Wait for three seconds
        //Thread.sleep(3000);
        BrowserUtilities.wait(3.5);

        String expectedTitle = "Google";
        String actualTitle =driver.getTitle();
        System.out.println(actualTitle);

        BrowserUtilities.verifyEquals(actualTitle,expectedTitle);

        //Close down the tab
       // driver.close();
        driver.quit();
        // --> closes down the whole window
    }

}
