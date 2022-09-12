package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormTest {

    private WebDriver driver;

    @Test
    public void formTest() {
        var link = "https://formy-project.herokuapp.com/form";

        //Start webDriver
        System.setProperty("webdriver.chrome.driver", "rsources/chromedriver");
        driver = new ChromeDriver();
        driver.get(link);

        //Click on the first textField
        var textFiled1 = By.cssSelector("#first-name");
        var fieldElement1 = driver.findElement(textFiled1);
        fieldElement1.click();

        //tape in the text field
        driver.findElement(textFiled1).sendKeys("Darinka");

        //#last-name
        var textFiled2 = By.cssSelector("#last-name");
        var fieldElement2 = driver.findElement(textFiled2);
        fieldElement2.click();
        fieldElement2.sendKeys("Melis");

        //#checkbox-1
        var checkBox1 = By.cssSelector("#checkbox-1");
        var checkBoxElement = driver.findElement(checkBox1);
        checkBoxElement.click();

        var isSelectedCheckBox = checkBoxElement.isSelected();

        System.out.println("IS SELECTED???" + isSelectedCheckBox);
    }
}
