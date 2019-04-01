package test.Users;import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class Users extends SerenityStory{

    @Steps
    RegressionSteps regressionSteps;

    @Given("that I am on page admin")
    public void givenThatIAmOnPageAdmin() {

    }

    @When("I enter name, and jobs correctly")
    public void whenIEnterNameJobsCorrectly()
    {
        regressionSteps.createSuccess();
    }

    @When("click 'Send'")
    public void whenClickSend() {

    }

    @Then("I have update database with post and new id")
    public void thenIHaveUpdateDatabaseWithPostAndNewId() {
        regressionSteps.validationJSONSchemaCreateSuccess();
    }

    @When("I enter name, and jobs correctly for put update")
    public void whenIEnterNameJobsCorrectlyPutUpdate() {

        regressionSteps.updateSuccess();
    }

    @Then("I have update database with put")
    public void thenIHaveUpdateDatabaseWithPut() {
        regressionSteps.validationJSONSchemaUpdateSuccess();
    }
    @When("I enter name, and jobs correctly for pacth update")
    public void whenIEnterNameJobsCorrectlyPatchUpdate() {

        regressionSteps.updatePatch();
    }

    @Then("I have update database with patch")
    public void thenIHaveUpdateDatabaseWithPatch() {
        regressionSteps.validationJSONSchemaUpdatePatch();
    }
}
