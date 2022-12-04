package challenge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lg soundbar");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.findElement(By.xpath("//span[text()='LG']/preceding-sibling::div//i[@class='a-icon a-icon-checkbox']")).click();

        List<WebElement> productNameList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for(WebElement e : productNameList) {
           String name =  e.getText();
            System.out.println(name);
        }

        List<WebElement> productsPriceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        for(WebElement e : productsPriceList) {
            String price =  e.getText();
            System.out.println(price);
        }


    }
}
