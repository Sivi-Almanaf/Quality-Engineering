package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinFeed extends PageObject {



    @FindBy(id="extended-nav")
    WebElement homePage;
    public void isHeaderDisplayed(){
        Assert.assertTrue(homePage.isDisplayed());



    }
    @FindBy(xpath="//div[@class='core-rail']")
    WebElement feedBack;

    public void isFeedDisplayed(){
        Assert.assertTrue(feedBack.isDisplayed());


    }
    @FindBy(id="app__container")
    WebElement invalidPassword;
    public void isErrorMessage(){
        element(invalidPassword).shouldBeVisible();
    }

    @FindBy(id="recaptcha-anchor-label")
    WebElement invalidEmail;
    public void NotificationAsHuman(){
        element(invalidEmail).shouldBeVisible();
    }

}
