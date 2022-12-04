package navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class BrowserTest {

    @Test
    public void openBrowser() {

        WebDriverManager.chromedriver().driverVersion("85").setup();
    }
}
