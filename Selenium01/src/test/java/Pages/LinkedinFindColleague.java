package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedinFindColleague extends PageObject {

    @FindBy(xpath="//*[@id=\"layout-main\"]/div/div[3]/form/input[1]")
    WebElement fieldFirstName;
    public void InputFirstName(String firstName){
        fieldFirstName.sendKeys(firstName);
    }
    @FindBy(xpath="//*[@id=\"layout-main\"]/div/div[3]/form/input[2]")
    WebElement fieldLastName;

    public void InputLastName(String lastName){
        fieldLastName.sendKeys(lastName);
    }
    @FindBy(className="submit-btn")
    WebElement buttonSearch;

    public void ClickButtonSearch() {
        buttonSearch.click();
    }
}
