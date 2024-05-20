package TestNgDemo;

import org.testng.annotations.Test;

public class GroupAttributes {

    @Test(groups = "software")
    public  void testcase1()
    {
        System.out.println("infosys");
    }
    @Test(groups = "software")
    public  void testcase2()
    {
        System.out.println("wipro");
    }
    @Test(groups = "automobile")
    public  void testcase3()
    {
        System.out.println("Honda");
    }
    @Test(groups = "automobile")
    public  void testcase4()
    {
        System.out.println("Maruti");
    }
}
