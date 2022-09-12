package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private  WebDriver driver;
    private By formAuthenLink = By.linkText("Form Authentication");
    private By dropDownLink = By.cssSelector("a[href='/dropdown']");


    //Konstruktor
    public  HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticator(){

        driver.findElement(formAuthenLink).click();
        System.out.println("Element was found and clicked");

        return new LoginPage(driver);
    }

    public DropdownPage clicDropDown(){

        driver.findElement(dropDownLink).click();
        System.out.println("Element was found and clicked");

        return new DropdownPage(driver);
    }
}
