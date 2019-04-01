package test.User;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class User extends SerenityStory{
    @Steps
    UserSteps userSteps;

    @Given("that I am ready to Admin page")
    public void givenThatIamReadyToAdminPage() {

    }

    @When("I will post for create user with valid input data")
    public void whenIWillPostCreateUser() {

        userSteps.postCreateUser();
    }

    @Then("I'm succesful create user to petstore")
    public void thenISuccessCreate() {

        userSteps.validationJSONPostCreateUser();
    }

    @When("I will login to my pet store with valid data")
    public void whenIWillLogintoMyPetStore() {

        userSteps.getLogin();
    }

    @Then("I taken to dashboard homepage")
    public void thenITakentoDashboardHomepage() {

        userSteps.validationJSONGetLogin();
    }


}
