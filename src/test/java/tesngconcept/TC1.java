package tesngconcept;

import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass() {
        System.out.println("This will execute before class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every method");
    }

    @Test
    void test1() {
        System.out.println("This is test1");
    }

    @Test
    void test2() {
        System.out.println("This is test2");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute after every method");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will execute after the class");
    }

}
