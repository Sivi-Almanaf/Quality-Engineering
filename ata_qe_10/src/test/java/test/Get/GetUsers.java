package test.Get;


import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GetUsers extends SerenityStory{

    @Steps
    GetSteps getSteps;

    @Given("that I am ready to get command")
    public void thatIAmReadyGetCommand(){

    }

    @When("I input URI and request command get for list users")
    public void whenIRequestCommandGetForListUsers()
    {
        getSteps.getListUsers();
    }

    @When("click 'Send'")
    public void whenClickSend()
    {

    }

    @Then("I get list data from server")
    public void thenIGetListDataFromServer() {

        getSteps.validationJSONSchemaGetListUsers();
    }

    @When("I input URI and request command for single user")
    public void whenInputURIRequestCommandSingleUser() {

        getSteps.getSingleUsers();
    }

    @Then("I get single data from server")
    public void thenIGetSingleDataFromServer() {
//        getSteps.validationMessage();
        getSteps.validationJSONSchemaGetSingleUsers();
    }

    @When("I input URI and request command with invalid id")
    public void whenInputURIRequestCommandInvalidId() {

        getSteps.getSingleUserNotFound();
    }

    @Then("I not found data from server or empty")
    public void thenINotFoundDataFromServerEmpty() {
//        getSteps.validationMessage();
        getSteps.validationJSONSchemaGetSingleUsersNotFound();
    }

    @When("I input URI and request command for get list data response")
    public void whenInputURIRequestCommandGetDelayedResponse() {

        getSteps.getSingleUserNotFound();
    }

    @Then("I get list data from server but slow response")
    public void thenINotFoundDataFromServer() {
//        getSteps.validationMessage();
        getSteps.validationJSONSchemaGetDelayedResponse();
    }


}

