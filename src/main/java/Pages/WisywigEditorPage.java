package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WisywigEditorPage {
    private WebDriver driver;
    private String editoriFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIntendButton = By.cssSelector("button[title='Decrease indent']");
    private By getText = By.tagName("p");

    public WisywigEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditorArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditorArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public void switchToEditorArea(){
        driver.switchTo().frame(editoriFrameId);
    }
    public String getTextFromEditor(){
        switchToEditorArea();
        String result =  driver.findElement(getText).getText();
        switchToMainArea();
        return result;
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIntendButton).click();
    }
}
