package tesngconcept;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase1 {

//    @Test(priority = -1)
//    public void a() {
//
//        System.out.println("1");
//    }
//
//    @Test(priority = 0)
//    public void b() {
//        System.out.println("2");
//      //  throw new SkipException("Skipped this");
//    }

    @Test(priority = 1)
    public void c() {
        System.out.println("3");
    }

    @Test(priority = 2)
    public void d() {
        System.out.println("4");
    }


    @Test
    public void e() {
        System.out.println("5");
    }

}
