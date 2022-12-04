package desiredcapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DesiredCaps {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setAcceptInsecureCerts(true);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.merge(caps);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://cacert.com");
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.quit();
    }
}
