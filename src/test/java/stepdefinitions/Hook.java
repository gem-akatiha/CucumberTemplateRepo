package stepdefinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    public static WebDriver driver;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
