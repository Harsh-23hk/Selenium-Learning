package TestNgDemo;

import org.testng.annotations.*;

public class TestCase {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    //executed before class
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    //executed before each test and after method
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    //executed after each test
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }


    @Test
    public void test() {
        System.out.println("Test");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }


}
