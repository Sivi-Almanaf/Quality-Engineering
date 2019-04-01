package test.Admin;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Admin extends SerenityStory {
    @Steps
    AdminSteps adminSteps;

    @Given("that I am on page admin")
    public void giventThatIAmOnPageAdmin() {

    }

    @When("I will post with enter name, and jobs correctly")
    public void whenIWillPostWithEnterNameAndJobsCorrectly() {

        adminSteps.postCreate();
    }

    @When("click button 'Send'")
    public void whenClickButtonSend() {

    }

    @Then("I have update database with post and get new id")
    public void thenIHaveUpdateDatabaseWithPostAndGetNewId() {
        adminSteps.validationMessage();

        adminSteps.validationJSONSchemaPostCreate();
    }

    @When("I will put with enter name, and jobs correctly")
    public void whenIWillPutWithEnterNameAndJobsCorrectly() {
        adminSteps.putUpdate();
    }

    @Then("I have update database with put")
    public void thenIHaveUpdateDatabaseWithPut() {
        adminSteps.validationJSONSchemaPutUpdate();
    }

    @When("I will patch with enter name, and jobs correctly")
    public void whenIWillPatchtWithEnterNameAndJobsCorrectly() {
        adminSteps.patchUpdate();
    }

    @Then("I have update database with patch")
    public void thenIHaveUpdateDatabaseWithPatch() {
        adminSteps.validationJSONSchemaPatchUpdate();
    }

    @When("I input URI and request command for single user")
    public void whenIInputURIAndRequestCommandForSingleUser() {
        adminSteps.getSingleUsers();
    }

    @Then("I get single data from server")
    public void thenIGetSingleDataFromServer() {
        adminSteps.validationJSONSchemaGetSingleUsers();
    }

    @When("I will delete a data from database")
    public void whenIIWillDeleteADataFromDatabase() {
        adminSteps.delete();
    }

    @Then("Im succesfully delete data and show data is deleted")
    public void thenImSuccesfullyDeleteDataAndShowDataIsDeleted() {
        adminSteps.validationJSONSchemaDelete();
    }

}


