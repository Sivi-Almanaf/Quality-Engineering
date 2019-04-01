package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinLogin extends PageObject {

    @FindBy(id="login-email")
    WebElement fieldEmail;
    public void InputEmail(String email){
        fieldEmail.sendKeys(email);
    }
    @FindBy(id="login-password")
    WebElement fieldPassword;

    public void InputPassword(String password){
        fieldPassword.sendKeys(password);
    }
    @FindBy(id="login-submit")
    WebElement buttonSignIn;

    public void ClickButtonLogin() {
        buttonSignIn.click();
    }

}
