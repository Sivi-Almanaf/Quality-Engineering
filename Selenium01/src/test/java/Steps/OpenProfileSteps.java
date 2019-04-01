package Steps;

import Pages.LinkedinOpenProfile;
import Pages.LinkedinOpenProfileFeed;

import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

public class OpenProfileSteps extends ScenarioSteps {

    LinkedinOpenProfile linkedinOpenProfile;
    LinkedinOpenProfileFeed linkedinOpenProfileFeed;


    public void ClickButtonNotification(){
        linkedinOpenProfile.ClickButtonNotification();
    }
    public void ListNotification(){
        linkedinOpenProfileFeed.isHeaderDisplayed();
        linkedinOpenProfileFeed.isFeedDisplayed();
    }

}
