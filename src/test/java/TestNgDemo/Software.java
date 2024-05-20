package TestNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Software {

    @Test
    @Parameters({"softname"})
    public void testcase(String name) {
        System.out.println(name);
    }
}
