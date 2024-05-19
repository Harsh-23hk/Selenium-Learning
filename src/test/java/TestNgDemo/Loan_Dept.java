package TestNgDemo;
import org.testng.annotations.Test;

public class Loan_Dept {

    @Test
    public void mobilePersonalLoan(){
        System.out.println("Mobile personal loan");
    }
    @Test
    public void webPersonalLoan(){
        System.out.println("Web personal loan");
    }
    @Test
    public void apiPersonalLoan(){
        System.out.println("Api personal loan");
    }

    @Test
    public void mobileAutomobileLoan(){
        System.out.println("Mobile Automobile loan");
    }
    @Test
    public void webAutomobileLoan(){
        System.out.println("Web Automobile loan");
    }
    @Test
    public void apiAutomobileLoan(){
        System.out.println("Api Automobile loan");
    }
}
