package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Homepage;

import java.util.BitSet;

public class BaseTest{

    private WebDriver driver;
    protected Homepage homepage;


    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homepage = new Homepage(driver);

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();

    }
}
