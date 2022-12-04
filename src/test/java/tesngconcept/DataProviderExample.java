package tesngconcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    @Test(dataProvider = "logindata")
    public void login(String email, String pwd) {
        System.out.println(email+" " + pwd);
    }

    @DataProvider(name="logindata")
    public Object[][] getData() {

        return new Object[][]
        {
            {
                "mohit", "1234"
            },
            {
                "rohit", "5678"
            }
        };
    }
}
