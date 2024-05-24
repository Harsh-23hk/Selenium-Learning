package TestNgDemo;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class InvocationCount {


    //ITestContext is used to share and store data between different test methods
    @Test(invocationCount = 5)
    public void test1(ITestContext context) {
        int currentInvocationCount = context.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("test1 :" + currentInvocationCount);
    }

    @Test(invocationCount = 3)
    public void test2() {
        System.out.println("test2");
    }


}
