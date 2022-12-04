package tesngconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}, alwaysRun = true)
    void driverCar() {
        System.out.println("Driver car");
    }

}
