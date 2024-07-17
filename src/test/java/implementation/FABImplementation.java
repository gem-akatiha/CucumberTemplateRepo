package implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locators.FABLocators;

import java.time.Duration;

public class FABImplementation {

    private final WebDriver driver;
    public FABLocators fabLocators = new FABLocators();

    public FABImplementation() {
        this.driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public void clickOnLoginButton() {
        WebElement loginButtonElement = driver.findElement(fabLocators.loginButton);
        loginButtonElement.click();
    }

    public void elementIsClickableLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fabLocators.loginButton));
    }
}