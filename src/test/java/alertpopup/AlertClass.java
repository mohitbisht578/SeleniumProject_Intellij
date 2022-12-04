package alertpopup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        alert.accept();
//
//        Actions actions = new Actions(driver);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
        WebElement element = driver.findElement(By.id("nav-search-submit-button"));
        jsClick(driver, element);
        driver.quit();

    }

    public static void jsClick(WebDriver driver, WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].click();", element);
    }
}
