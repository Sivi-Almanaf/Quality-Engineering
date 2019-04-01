package Steps;

import Pages.LinkedinFindColleague;
import Pages.LinkedinFindColleagueFeed;
import net.thucydides.core.steps.ScenarioSteps;

public class FindColleagueSteps extends ScenarioSteps {
    LinkedinFindColleague linkedinFindColleague;
    LinkedinFindColleagueFeed linkedinFindColleagueFeed;

    public void OpenLinkedinPage() {
        linkedinFindColleague.open();
    }

    public void ClickButtonSearch(){
        linkedinFindColleague.ClickButtonSearch();
    }
    public void ShowSuggestedFriendSuccess(){
        linkedinFindColleagueFeed.isHeaderDisplayed();
        linkedinFindColleagueFeed.isFeedDisplayed();
    }

    public void InputFirstName(String firstName) {
        linkedinFindColleague.InputFirstName(firstName);

    }
    public void InputLastName(String password){
        linkedinFindColleague.InputLastName(password);
    }

}
