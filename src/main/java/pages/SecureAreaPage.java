package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By confirmationMessagge = By.cssSelector(".subheader");


    public SecureAreaPage (WebDriver driver){
        this.driver=driver;

    }

    public String getConfirmationMessagge(){
       return driver.findElement(confirmationMessagge).getText();


    }

}
