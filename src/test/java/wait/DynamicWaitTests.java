package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicWaitTests extends BaseTests {
    @Test
    public void testLoadingWait(){
        var waitPage = homePage.clickDynamicLoadingPage().clickExample1();
        waitPage.clickStartButton();
        assertEquals(waitPage.getLoadedText(), "Hello World!", "Incorrect loaded Text");
    }
    @Test
    public void testFluentWait(){
        var waitPage = homePage.clickDynamicLoadingPage().clickExample1();
        waitPage.clickStartButtonAndUseFluentWait();
        assertEquals(waitPage.getLoadedText(), "Hello World!", "Incorrect loaded Text");
    }
}
