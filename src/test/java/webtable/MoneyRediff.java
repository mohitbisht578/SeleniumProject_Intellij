package webtable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MoneyRediff {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indices");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();

        //row count
        int rowsCount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
        System.out.println(rowsCount);
        int colsCount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/th")).size();
        System.out.println(colsCount);

        for(int i=1; i<rowsCount; i++) {
            for(int j=1; j<=colsCount; j++) {

               String name =  driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
               System.out.print(name + "  ");
            }
            System.out.println();
        }
    }
}
