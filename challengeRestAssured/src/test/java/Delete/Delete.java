//package Delete;
//
//import net.serenitybdd.jbehave.SerenityStory;
//import net.thucydides.core.annotations.Steps;
//import org.jbehave.core.annotations.Given;
//import org.jbehave.core.annotations.Then;
//import org.jbehave.core.annotations.When;
//import DeleteSteps;
//
//
//public class Delete extends SerenityStory {
//
//    @Steps
//    DeleteSteps deleteSteps;
//
//    @Given("that I am ready to Admin page for delete")
//    public void givenReadyToAdminPageForDelete() {
//
//    }
//
//    @When("I will delete data as correctly")
//    public void whenIWillDeleteDataAsCorrectly() {
//
//        deleteSteps.deleteValidId();
//    }
//
//    @Then("I taken to dashboard data deleted")
//    public void thenIITakenToDashboardDataDeleted() {
//
//
//        deleteSteps.validationJSONSchemaDeleteValidId();
//    }
//
//    @When("I will delete data invalid id")
//    public void whenIWillDeleteDataInvalidId() {
//
//        deleteSteps.deleteInvalidId();
//    }
//
//    @Then("Show message invalid id to delete")
//    public void thenShowMessageInvalidIdToDeleted() {
//        deleteSteps.validationMessage();
//        deleteSteps.validationJSONDeleteInvalidId();
//    }
//
//    @When("I will delete a data that not found")
//    public void whenIWillDeleteDataThatNotFound() {
//
//        deleteSteps.deletePetNotFound();
//    }
//
//    @Then("Show message pet not found to delete")
//    public void thenShowMessagePetNotFoundToDelete() {
//        deleteSteps.validationJSONSchemaDeletePetNotFound();
//    }
//
//    @When("I will delete purchase order by ID")
//    public void whenIWillDeletePurchaseOrderByID() {
//        deleteSteps.deletePurchaseOrderInvalidId();
//    }
//
//    @Then("Show message invalid id to delete from order")
//    public void thenShowMessageInvalidIdToDeleteFromOrder() {
//        deleteSteps.validationJSONSchemaDeletePurchaseOrderInvalidId();
//    }
//
//    @When("I will delete purchase order not found")
//    public void whenIWillDeletePurchaseOrderNotFound() {
//
//        deleteSteps.deletePurchaseOrderNotFound();
//    }
//
//    @Then("Show message order not found to delete")
//    public void thenShowMessageOrderNotFoundToDelete() {
//        deleteSteps.validationMessage();
//        deleteSteps.validationJSONSchemaDeletePurchaseOrderNotFound();
//    }
//
//    @When("I will delete user from database by invalid ID")
//    public void whenIWillDeleteUserFromDatabaseByInvalidId() {
//        deleteSteps.deleteUserFromDatabaseByInvalidId();
//    }
//
//    @Then("Show message invalid user to delete")
//    public void thenShowMessageinvalidUserToDelete() {
//        deleteSteps.validationJSONSchemaDeleteUserFromDatabaseByInvalidId();
//    }
//
//    @When("I will delete user not found from database")
//    public void whenIWillDeleteUserNotFoundFromDatabase() {
//
//        deleteSteps.deleteUserNotFoundFromDatabase();
//    }
//
//    @Then("Show message user not found to delete")
//    public void thenShowMessageUserNotFoundToDelete() {
//        deleteSteps.validationMessage();
//        deleteSteps.validationJSONSchemaDeleteUserNotFoundFromDatabase();
//    }
//}
//
//
