package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");
    //Konstruktor
    public  SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public  String getAlertText(){
       return driver.findElement(statusAlert).getText();
    }

    public boolean waitUntilDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean isDisplayed = wait.until(
                ExpectedConditions.presenceOfElementLocated(statusAlert)).isDisplayed();
        System.out.println(isDisplayed);
        return isDisplayed;
    }

}
