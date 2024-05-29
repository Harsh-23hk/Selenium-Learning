package ExtendReporterExample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListenerDemo implements ITestListener {

    ExtentSparkReporter sparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;


    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
        System.out.println("on finish invoke" + context);
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("on test start invoke" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("on success invoke" + result.getName());
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " is passed", ExtentColor.GREEN));

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("on failure invoke" + result.getName());
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "is failed", ExtentColor.RED));

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("on skipped invoke" + result.getName());
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "is skipped", ExtentColor.ORANGE));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        configReport();
        System.out.println("on start invoke" + context);

        ;
    }

    public void configReport() {
        sparkReporter = new ExtentSparkReporter("ExtentListenerDemo.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);

        //add system information
        extentReports.setSystemInfo("OS", "Windows 10");
        extentReports.setSystemInfo("Tester", "Harsh");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Environment", "QA");

        //report specific configuration
        sparkReporter.config().setDocumentTitle("ExtentListenerDemo");
        sparkReporter.config().setReportName("Test Report");
        sparkReporter.config().setEncoding("UTF-8");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        sparkReporter.config().setTheme(Theme.DARK);
    }
}
