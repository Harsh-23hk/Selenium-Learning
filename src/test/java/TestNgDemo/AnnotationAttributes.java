package TestNgDemo;

import org.testng.annotations.Test;

public class AnnotationAttributes {
    //@Test(description = "testcase1",priority = 1)
    @Test(dependsOnMethods = {"test2"})
    public void test1() {
        System.out.println("mobile");
    }

    //@Test(description = "testcase2",timeOut = 200,priority = 2)
    @Test()
    public void test2() {
        System.out.println("web");

    }

    // @Test(description = "testcase3",priority = 0)
    @Test(enabled = false, dependsOnMethods = {"test1"})
    public void test3() {
        System.out.println("api");
    }
}
