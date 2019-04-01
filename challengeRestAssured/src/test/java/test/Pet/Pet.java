package test.Pet;


import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Pet extends SerenityStory{

    @Steps
    PetSteps petSteps;

    @Given("that I am ready to pet page")
    public void givenThatIAmReadyToperPpage() {

    }

    @When("I will post data with fill the data as correctly")
    public void whenIWillPostDataWithFillTheDataAsCorrectly() {

        petSteps.postDataCorrectly();
    }

    @Then("I taken to dashboard new data added")
    public void thenIITakenToDashboardnewDataAdded() {


        petSteps.validationJSONPostDataCorrectly();
    }

    @When("I will put data with fill the data as correctly")
    public void whenIWillPutDataWithFillTheDataAsCorrectly() {

        petSteps.putDataCorrectly();
    }

    @Then("I taken to dashboard and show update pet")
    public void thenITakenToDashboardAndShowUpdatePet() {

        petSteps.validationJSONPutDataCorrectly();
    }

    @When("I will find pets by valid ID")
    public void whenIWillDeletePurchaseOrderByID() {
        petSteps.getPetValidId();
    }

    @Then("I taken to dashboard show status pet by valid ID")
    public void thenShowMessageInvalidIdToDeleteFromOrder() {
        petSteps.validationJSONGetPetValidId();
    }

    @When("I will delete data as correctly")
    public void whenIWillDeleteUserFromDatabaseByInvalidId() {
        petSteps.deleteUserFromDatabaseValidId();
    }

    @Then("I taken to dashboard data deleted")
    public void thenITakenToDashboardDataDeleted() {
    }


}
