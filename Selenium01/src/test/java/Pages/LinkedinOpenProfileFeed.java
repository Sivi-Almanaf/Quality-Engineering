package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinOpenProfileFeed extends PageObject {

    @FindBy(id="extended-nav")
    WebElement profilePage;
    public void isHeaderDisplayed(){
        Assert.assertTrue(profilePage.isDisplayed());



    }
    @FindBy(id="extended-nav")
    WebElement pageNotification;

    public void isFeedDisplayed(){
        Assert.assertTrue(pageNotification.isDisplayed());


    }





}
