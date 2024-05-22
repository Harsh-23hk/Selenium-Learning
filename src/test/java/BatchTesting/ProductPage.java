package BatchTesting;

import org.testng.annotations.Test;

public class ProductPage {

    @Test
    public void addProductToCart() {
        System.out.println("Add Product to Cart");
    }

    @Test
    public void addProductToWishList() {
        System.out.println("Add Product to wish list");
    }

    @Test
    public void selectQuantity() {
        System.out.println("Select Quantity");
    }
}
