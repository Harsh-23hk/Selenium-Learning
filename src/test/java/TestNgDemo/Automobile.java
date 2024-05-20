package TestNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automobile {

    @Test
    @Parameters({"autoname"})
    public void testcase(String name) {
        System.out.println(name);
    }


}
