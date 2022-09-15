package Hover;

import Pages.HoverPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class HoverTest extends BaseTest {

    @Test
    public void testHover(){
        HoverPage hoverPage = homePage.clicHoverPage();
        hoverPage.hoverOverFigure();
    }
}
