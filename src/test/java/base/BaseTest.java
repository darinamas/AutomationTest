package base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.getLogger;
import static java.lang.invoke.MethodHandles.lookup;

public class BaseTest {

    private WebDriver driver;
    // static final Logger log = (Logger) getLogger(String.valueOf(lookup().lookupClass()));

    protected HomePage homePage;

    public void setUpBefore() {
        System.setProperty("webdriver.chrome.driver", "rsources/chromedriver");
        driver = new ChromeDriver();
        String setUrl = "https://the-internet.herokuapp.com/";
        driver.get(setUrl); //launch the browser

    }

    @BeforeClass

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "rsources/chromedriver");
        driver = new ChromeDriver();
        String setUrl = "https://the-internet.herokuapp.com/";
        driver.get(setUrl); //launch the browser
        String title = driver.getTitle();
        // log.debug("The title of {} is {}");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void quitMethod() {
        driver.quit();
    }

        @AfterMethod
        public void takeScreenShotFailure (ITestResult reult){
            if (ITestResult.FAILURE == reult.getStatus()) {
                var camera = (TakesScreenshot) driver;
                File screenshot = camera.getScreenshotAs(OutputType.FILE);
                System.out.println("Screenshot is taken" + screenshot.getAbsolutePath());
                try {
                    Files.move(screenshot,
                            new File("rsources/screenshots/" + reult.getName() + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
