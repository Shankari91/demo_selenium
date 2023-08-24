package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By resultText = By.id("result");
    private By triggerAlertButton = By.xpath(".//button[normalize-space()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[normalize-space()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[normalize-space()='Click for JS Prompt']");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_setPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
