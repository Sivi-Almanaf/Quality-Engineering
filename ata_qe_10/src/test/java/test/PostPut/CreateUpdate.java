package test.PostPut;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.Login.LoginSteps;

public class CreateUpdate extends SerenityStory {

    @Steps
    CreateUpdateSteps createUpdateSteps;

    @Given("that I am on page admin")
    public void givenThatIAmOnPageAdmin() {

    }

    @When("I enter name, and jobs correctly")
    public void whenIEnterNameJobsCorrectly()
    {
        createUpdateSteps.createSuccess();
    }

    @When("click 'Send'")
    public void whenClickSend() {

    }

    @Then("I have update database with post and new id")
    public void thenIHaveUpdateDatabaseWithPostAndNewId() {
        createUpdateSteps.validationJSONSchemaCreateSuccess();
    }

    @When("I enter name, and jobs correctly for put update")
    public void whenIEnterNameJobsCorrectlyPutUpdate() {

        createUpdateSteps.updateSuccess();
    }

    @Then("I have update database with put")
    public void thenIHaveUpdateDatabaseWithPut() {
        createUpdateSteps.validationJSONSchemaUpdateSuccess();
    }
    @When("I enter name, and jobs correctly for pacth update")
    public void whenIEnterNameJobsCorrectlyPatchUpdate() {

        createUpdateSteps.updatePatch();
    }

    @Then("I have update database with patch")
    public void thenIHaveUpdateDatabaseWithPatch() {
        createUpdateSteps.validationJSONSchemaUpdatePatch();
    }
}

