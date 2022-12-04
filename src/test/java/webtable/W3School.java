package webtable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class W3School {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //find total rows;
        int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();

        for(int i=1; i<rowCount; i++) {
            for(int j=1; j<=colCount; j++) {

                String name = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
                System.out.println(name);
//                if(name.equals("Island Trading"))
//                System.out.println(i + " : " + j);
            }
        }


    }
}
