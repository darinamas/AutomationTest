package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private  WebDriver driver;
    private By formAuthenLink = By.linkText("Form Authentication");
    private By dropDownLink = By.cssSelector("a[href='/dropdown']");

    private By hoverLink = By.cssSelector("a[href='/hovers']");
    private By keyPressLink = By.cssSelector("a[href='/key_presses']");

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

    public HoverPage clicHoverPage(){

        driver.findElement(hoverLink).click();
        System.out.println("Element was found and clicked");

        return new HoverPage(driver);
    }

    public KeyPressPage clickKeyPress() {
        driver.findElement(keyPressLink).click();
        return new KeyPressPage(driver);
    }

}
