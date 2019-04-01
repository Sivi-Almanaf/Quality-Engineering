package test.Register;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Register extends SerenityStory {

    @Steps
    RegisterSteps registerSteps;

    @Given("that I am on the sign-up page")
    public void givenThatIAmOnTheSignupPage(){
    }
    @When("I enter name, my email and password correctly")
    public void whenIEnterNameMyEmailPasswordCorrectly()
    {
        registerSteps.registerSuccess();
    }
    @When("click 'Sign Up'")
    public void whenClickSignup(){

    }
    @Then("I am taken to the Register page")
    public void takenRegisterPage(){
        registerSteps.validationJSONSchemaRegisterSuccess();

    }

    @When("I enter name and my email only and password empty")
    public void whenIEnterNameMyEmailOnlyPasswordEmpty()
    {
        registerSteps.registerFailed();
    }
    @Then("Show error message 'Please Enter password'")
    public void thenShowErrorMessageEnterPassword(){
        registerSteps.validationMessage();
        registerSteps.validationJSONSchemaRegisterFailed();


    }
}
