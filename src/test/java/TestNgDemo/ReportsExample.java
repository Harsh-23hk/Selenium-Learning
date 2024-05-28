package TestNgDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsExample {

    @Test
    public void test1() {
        System.out.println("Test");
        Reporter.log("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test");
        Reporter.log("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test");
        Reporter.log("Test3");
    }



}
