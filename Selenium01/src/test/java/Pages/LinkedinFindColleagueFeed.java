package Pages;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinFindColleagueFeed extends PageObject {

    @FindBy(className="wrapper")
    WebElement listSuggestion;
    public void isHeaderDisplayed(){
        Assert.assertTrue(listSuggestion.isDisplayed());



    }
    @FindBy(id="profile")
    WebElement listFriend;

    public void isFeedDisplayed(){
        Assert.assertTrue(listFriend.isDisplayed());


    }

}
