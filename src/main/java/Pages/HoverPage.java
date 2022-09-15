package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private By hoverElemenrt = By.xpath("//div[@class='example']//div[1]//img[1]");
    private WebDriver driver;

    public HoverPage(WebDriver driver){

        this.driver = driver;
    }

    public void hoverOverFigure(){
        WebElement figure = driver.findElement(hoverElemenrt);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
    }
}
