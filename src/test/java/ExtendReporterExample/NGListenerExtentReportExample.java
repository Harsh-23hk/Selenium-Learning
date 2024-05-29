package ExtendReporterExample;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class NGListenerExtentReportExample {
    @Test
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        Assert.assertTrue(false);
        System.out.println("fail");
    }

    @Test
    public void test3(){
        System.out.println("test3");
        throw new SkipException("testSkipped exception thrown");
    }

    @Test
    public void test4(){
        System.out.println("test4");
        Assert.assertTrue(true);
    }

    @Test
    public void test5(){
        System.out.println("test5");
        Assert.assertTrue(false);
    }


}
