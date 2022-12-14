package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


private WebDriver driver;
private By usernameField = By.id("username");
private By passField = By.id("password");
private By loginButton = By.cssSelector("#login button");
private By loginError = By.id("flash");


public LoginPage (WebDriver driver){
    this.driver = driver;

}

public void setUsername(String username){
    driver.findElement(usernameField).sendKeys(username);


}
public void setPassword(String password) {
    driver.findElement(passField).sendKeys(password);


}
public SecureAreaPage clickLoginButton(){
    driver.findElement(loginButton).click();
    return new SecureAreaPage(driver);
}

public String getErrortext(){
   return driver.findElement(loginError).getText();


}

}
