package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test
    public void cashOnDelivery() {
        System.out.println("COD");
    }

    @Test
    public void netBanking() {
        System.out.println("Net Banking");
    }

}
