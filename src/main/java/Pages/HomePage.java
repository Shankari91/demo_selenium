package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KepPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KepPressesPage(driver);
    }
    public AlertsPage clickJavascriptAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public WisywigEditorPage clickWisywigEditorPage(){
        clickLink("WYSIWYG Editor");
        return new WisywigEditorPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
