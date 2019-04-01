package Test;

import Steps.OpenProfileSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;


public class OpenProfile extends SerenityStory{

    @Steps
    OpenProfileSteps openProfileSteps;

    @When("I click button notification")
    public void WhenProfilePicture() {
        openProfileSteps.ClickButtonNotification();
    }
    @Then("I got to my list notification")
    public void ThenListNotification(){
        openProfileSteps.ListNotification();
    }




    }

