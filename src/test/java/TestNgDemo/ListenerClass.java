package TestNgDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class ListenerClass implements ITestListener {

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("on finish invoke");

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("on start invoke");

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("on skipped invoke" + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("on failure invoke"+result.getName() );
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("on success invoke"+ result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("on test start invoke" + result.getName());

        ITestListener.super.onTestStart(result);
    }
}
