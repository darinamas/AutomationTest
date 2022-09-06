package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "rsources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/"); //launch the browser
        driver.manage().window().maximize(); //do something with browser
        driver.manage().window().setSize(new Dimension(375, 812));
        driver.findElement(By.linkText("Inputs"));
        System.out.println(driver.getTitle()); //get title
        //driver.quit(); //close browser

    }

    public static void main(String arg[]) {
        BaseTest test = new BaseTest();
        test.setUp();
    }
}
