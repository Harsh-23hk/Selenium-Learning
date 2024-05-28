package ExtendReporterExample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicExtendReport {

    ExtentSparkReporter sparkReporter;
    ExtentTest extentTest;
    ExtentReports extentReports;

    @BeforeTest
    public void configureReport() {
        sparkReporter = new ExtentSparkReporter("BasicExtendReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);


        //add system information
        extentReports.setSystemInfo("OS", "Windows 10");
        extentReports.setSystemInfo("Tester", "Harsh");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Environment", "QA");

        //
        sparkReporter.config().setDocumentTitle("BasicExtendReport");
        sparkReporter.config().setReportName("Test Report");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setEncoding("UTF-8");
        sparkReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy @hh:mm a '('zzz')'");
    }

    @Test
    public void launchBrowser() {
        extentTest = extentReports.createTest("Launch Browser & open Url");
        Assert.assertTrue(true);
    }

    @Test
    public void verifyTitle() {
        extentTest = extentReports.createTest("Verify Title");
        Assert.fail();
    }

    @Test
    public void verifyLogo() {
        extentTest = extentReports.createTest("Verify Logo");
        Assert.assertTrue(true);
    }


    @Test
    public void verifyEmail() {
        extentTest = extentReports.createTest("Verify Email");
        throw new SkipException("Test Skipped with exception");
    }

    @AfterMethod
    public void getTestResult(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getTestName() + "is passed", ExtentColor.GREEN));
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getTestName() + " is skipped", ExtentColor.YELLOW));
        } else if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " is failed", ExtentColor.RED));
        }
    }

    @AfterTest
    public void writer(){
        extentReports.flush();

    }

}
