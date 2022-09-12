package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUpBefore(){
        System.setProperty("webdriver.chrome.driver", "rsources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/"); //launch the browser
    }
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "rsources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/"); //launch the browser
        homePage = new HomePage(driver);
//        driver.manage().window().maximize(); //do something with browser
//        //driver.manage().window().setSize(new Dimension(375, 812));
//       // WebElement inp = driver.findElement(By.linkText("Add/Remove Elements");
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs")); //return web element
//        inputsLink.click();
//
//        List<WebElement> links = driver.findElements(By.tagName("a")); //return list of web elements
//        System.out.println(links.size()); // print how many elements on this page
//
//        System.out.println(driver.getTitle()); //get title
//        //driver.quit(); //close browser

    }

    @AfterClass
    public void quitMethod(){
      //  driver.quit();
    }
    public void test1() {
        setUpBefore();
        //WebElement inputs = driver.findElement(By.linkText("Add/Remove Elements"));
        WebElement inputs = driver.findElement(By.xpath(""));
        inputs.click();
        //driver.quit();
    }

//    public static void main(String arg[]) {
//        BaseTest test = new BaseTest();
//        test.setUp();
//      //  test.test1();
//    }
}
