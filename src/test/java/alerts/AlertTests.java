package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavascriptAlert();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert", "Incorrect result dispalyed");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavascriptAlert();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Incorrect alert text");
    }
    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavascriptAlert();
        alertPage.triggerPrompt();
        String text = "Hello World";
        alertPage.alert_setPromptText(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You entered: "+text, "Incorrect Result");
    }
}
