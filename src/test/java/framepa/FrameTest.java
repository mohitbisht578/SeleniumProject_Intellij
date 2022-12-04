package framepa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.switchTo().frame(1);
        driver.switchTo().frame("name");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("id")));
    }
}
