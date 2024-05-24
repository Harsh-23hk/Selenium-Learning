package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithPageFactory {

    WebDriver driver;

    LoginWithPageFactory(WebDriver driver) {
        this.driver = driver;

        //this will initialize all the elements
        PageFactory.initElements(driver,this);
    }
    //identify elements
    @FindBy(id="user-name")
    WebElement Username;
    @FindBy(id="password")
    WebElement Password;
    @FindBy(id="login-button")
    WebElement Login;

    public void enterUsername(String username) {
        Username.sendKeys(username);
    }
    public void enterPassword(String password) {
        Password.sendKeys(password);
    }
    public void clickLogin() {
        Login.click();
    }

    public void closeBrowser() {
        driver.close();
    }

}
