package KeyPress;

import Pages.KeyPressPage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class KeyPressTest extends BaseTest {
    private WebDriver driver;

    @Test
    public void keyPressTest(){
        KeyPressPage keyPressPage = homePage.clickKeyPress();
    }
}
