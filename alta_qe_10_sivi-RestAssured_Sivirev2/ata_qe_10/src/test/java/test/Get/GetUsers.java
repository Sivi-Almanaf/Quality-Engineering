package test.Get;


import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GetUsers extends SerenityStory{

    @Steps
    GetSteps getSteps;

    @Given("that I am ready to get command users")
    public void thatIAmReadyToGetCommandListUsers(){

    }

    @When("I will get with input URI and request command get for list users")
    public void whenIWillGetWithInputURIAndRequestCommandGetForListUsers()
    {

        getSteps.getListUsers();
    }
    @When("click 'Send'")
    public void whenClickSend() {

    }



    @Then("I got list data from server")
    public void thenIGotListDataFromServer() {

        getSteps.validationJSONSchemaGetListUsers();
    }


    @When("I will get with input URI and request command with invalid id")
    public void whenIWillGetWithInputURIRequestCommandWithInvalidId() {

        getSteps.getSingleUserNotFound();
    }

    @Then("I not found data from server or empty")
    public void thenINotFoundDataFromServerEmpty() {
//        getSteps.validationMessage();
        getSteps.validationJSONSchemaGetSingleUsersNotFound();
    }

    @When("I input URI and request command for list users unknown")
    public void whenInputURIAndRequestCommandForListUsersUnknown() {

        getSteps.getListUsersUnknown();
    }
    @Then("I get list random data from server")
    public void thenIGetListRandomDataFromServer(){
//        getSteps.validationMessage();
        getSteps.validationJSONSchemaGetListUsersUnknown();

    }
    @When("I input URI and request command for single user unknown")
    public void whenInputURIAndRequestCommandForSingleUsesUnknown() {

        getSteps.getSingleUserUnknown();
    }
    @Then("I got single random data from server")
    public void thenIGotSingleRandomDataFromServer(){
        getSteps.validationJSONSchemaGetSingleUserUnknown();

    }
    @When("I input URI and request command for single user unknown and not found data")
    public void whenInputURIAndRequestCommandForSingleUsesUnknownAndNotFoundData() {

        getSteps.getSingleUserUnknownNotFound();
    }
    @Then("I'm not found any random data from server")
    public void thenImNotFoundAnyRandomDataFromserver(){
//        getSteps.validationMessage();
        getSteps.validationJSONSchemaGetSingleUserUnknownNotFound();
    }

    @When("I input URI and request command for get list data response delayed")
    public void whenInputURIRequestCommandGetDelayedResponse() {

        getSteps.getDelayedResponse();
    }

    @Then("I get list data from server but slow response")
    public void thenINotFoundDataFromServer() {
        getSteps.validationJSONSchemaGetDelayedResponse();
    }


}

