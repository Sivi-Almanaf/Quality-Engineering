package Pages;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LinkedinOpenProfile extends PageObject {

    @FindBy(id="notifications-tab-icon")
    WebElement buttonNotification;
    public void ClickButtonNotification() {
        buttonNotification.click();
    }

}

