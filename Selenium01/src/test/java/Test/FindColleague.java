package Test;

import Steps.FindColleagueSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;


public class FindColleague extends SerenityStory {
    @Steps
    FindColleagueSteps findColleagueSteps;

    @Given("I open linkedin and see feature find a colleague")
    public void GivenColleagueLinkedin() {
        findColleagueSteps.OpenLinkedinPage();
    }

    @When("I input firstName and LastName $firstName dan $lastName")
    public void WhenInputName(String firstName, String LastName) {
        findColleagueSteps.InputFirstName(firstName);
        findColleagueSteps.InputLastName(LastName);
    }

    @When("I click button search")
    public void WhenClickButtonLogin() {
        findColleagueSteps.ClickButtonSearch();
    }
    @Then("I got to my list suggested friend page")
    public void ThenLoginSucces(){
        findColleagueSteps.ShowSuggestedFriendSuccess();

    }


}
