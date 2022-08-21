package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;
    private By formAuthLink = By.linkText("Form Authentication");


    public Homepage (WebDriver driver){
        this.driver = driver;

    }

    public LoginPage clickFormAuthLink(){

    driver.findElement(formAuthLink).click();
        return new LoginPage(driver);



    }


}
