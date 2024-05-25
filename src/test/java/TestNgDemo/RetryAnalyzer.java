package TestNgDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int count = 0;
    int maxTry = 3;

    @Override
    public boolean retry(ITestResult result) {
     if(!result.isSuccess()){
         if(count < maxTry){
             count++;
             return true;
         }
     }


        return false;
    }
}
