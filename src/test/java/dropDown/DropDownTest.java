package dropDown;

import Pages.DropdownPage;
import Pages.LoginPage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    private WebDriver driver;

    @Test
    void dropDownTest() {
        DropdownPage dropPage = homePage.clicDropDown();
        String option = "Option 1";

        dropPage.selectFromDropDown(option);
        var selectedOptions = dropPage.getSelctedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
